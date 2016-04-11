grammar Simple;

@header {
    import java.util.TreeMap;
}

@parser::members {
    public static TreeMap<String, Integer> map = new TreeMap<String, Integer>();
    public static int count = 0;
    public static int loop = 0;

    public int add(String key) {
        int val = -1;
        if(map.get(key) == null) {
            map.put(key, count);
            count++;
            val = map.get(key);
        } else {
            val = map.get(key);
        }
        return val;
    }

    public int get(String key) {
        return map.get(key);
    }
}

start
    :
        {
            System.out.println(".class public input");
            System.out.println(".suprt java/lang/Object");
            System.out.println(".method public <init>()V");
            System.out.println("\taload_0");
            System.out.println("\tinvokenonvirtual java/lang/Object/<init>()V");
            System.out.println("\treturn");
            System.out.println(".end method");
            System.out.println(".method public static main([Ljava/lang/String;)V");
            System.out.println("\t.limit stack 50");
            System.out.println("\t.limit locals 10");
        }
        (
            program
            {
                System.out.println($program.s);
            }
        )+
        EOF
            {
                System.out.println("\treturn");
                System.out.println(".end method");
            }
        EOF
    ;

/*
 stmt
    : printStmt
    | assignStmt
    | repeatStmt
    ;
 */
statement returns [String s]
    :
        assignStmt
        {
            $s = $assignStmt.s;
        }
    |
        printStmt
        {
            $s = $printStmt.s;
        }
    |
        repeatStmt
        {
            $s = $repeatStmt.s;
        }
    ;

/*
    prog : block;
 */
program returns [String s]
    :   block
        {
            $s = $block.s;
        }
    ;

/*
    block
        : stmt+
        ;
 */
block returns [String s]
    :
        {
            $s = "";
        }
        (
            statement
            {
                $s += $statement.s;
            }
        )+
    ;

/*
 primtStmt
    : 'print' '(' exprList ')'
    ;
 */
printStmt returns [String s]
    : 'print' '(' exprList ')'
        {
            $s = "";
            for(String expression : $exprList.s.split(",")) {
                $s += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
                $s += "\t" + expression + "\n";
                $s += "\tinvokevirtual java/io/PrintStream/print(I)V\n";
                $s += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
                $s += "\tldc " + "\" \"" + "\n";
                $s += "\tinvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n";
            }
        }
    ;

/*
 assignStmt
    : (expr ',')* expr
    ;
 */
assignStmt returns [String s]
    :
        'let' ID '=' NUM
        {
            $s = "\tldc " + $NUM.getText() + "\n";
            $s += "\tistore " + add($ID.getText()) + "\n";
        }
    |
        'let' ID '=' expression
        {
            $s = "\t" + $expression.s + "\n";
            $s += "\tistore " + get($ID.getText()) + "";
        }
    ;

/*
 repeatStmt
    : 'repeat' expr '{' block '}'
    ;
 */
repeatStmt returns [String s]
    :
        'repeat' expression '{' block '}'
        {
            $s = "\tiload 0\n";
            $s += "\tistore " + count + "\n";
            $s += "\t" + $expression.s + "\n";
            count++;
            $s += "\tistore " + count + "\n";
            $s += "\tloop_" + loop + ":\n";
            $s += "\t" + $block.s + "\n";
            $s += "\tiinc " + count + " 1\n";
            $s += "\tiload " + count + "\n";
            count++;
            $s += "\tiload " + count + "\n";
            $s += "\tif_icmplt loop_" + loop;
            loop++;
            count = count + 2;
        }
    ;

exprList returns [String s]
    :
        {
            $s = "";
        }
        (
            expression ','
            {
                $s += $expression.s + ",";
            }
        )*
        expression
            {
                $s += $expression.s + ",";
            }
    ;

expression returns [String s]
    :
        '('? NUM ')'?
        {
            $s = "ldc " + $NUM.getText();
        }
    |
        '('? operation ')'?
        {
            $s = $operation.s;
        }
    |
        '('? operation ')'? '+' NUM
        {
            $s = $operation.s + "\n";
            $s += "\tldc " + $NUM.getText() + "\n";
            $s += "\tiadd";
        }
    ;

operation returns [String s]
    :   var
        {
            $s = "iload " + get($var.sVar);
        }
    ;

var  returns [String sVar]
    :   ID
        {
            $sVar = $ID.getText();
        }
    |
        NUM
        {
            $sVar = "" + $NUM.getText();
        }
    ;

/* Terminals */
NUM : ('0' .. '9')+ ;
ID : ('a' .. 'z' | 'A' .. 'Z')+ ('a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' | '-')* ;
WS : (' ' | '\t' | '\r' | '\n') {skip();} ;