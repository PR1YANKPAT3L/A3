// Generated from Simple.g4 by ANTLR 4.5.2

    import java.util.TreeMap;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SimpleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.5.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, NUM=11, ID=12, WS=13;
	public static final int
		RULE_start = 0, RULE_statement = 1, RULE_program = 2, RULE_block = 3, 
		RULE_printStmt = 4, RULE_assignStmt = 5, RULE_repeatStmt = 6, RULE_exprList = 7, 
		RULE_expression = 8, RULE_operation = 9, RULE_var = 10;
	public static final String[] ruleNames = {
		"start", "statement", "program", "block", "printStmt", "assignStmt", "repeatStmt", 
		"exprList", "expression", "operation", "var"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'print'", "'('", "')'", "'let'", "'='", "'repeat'", "'{'", "'}'", 
		"','", "'+'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, "NUM", 
		"ID", "WS"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "Simple.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }


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

	public SimpleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class StartContext extends ParserRuleContext {
		public ProgramContext program;
		public List<TerminalNode> EOF() { return getTokens(SimpleParser.EOF); }
		public TerminalNode EOF(int i) {
			return getToken(SimpleParser.EOF, i);
		}
		public List<ProgramContext> program() {
			return getRuleContexts(ProgramContext.class);
		}
		public ProgramContext program(int i) {
			return getRuleContext(ProgramContext.class,i);
		}
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{

			            System.out.println(".class public sample");
			            System.out.println(".super java/lang/Object");
			            System.out.println(".method public <init>()V");
			            System.out.println("\taload_0");
			            System.out.println("\tinvokenonvirtual java/lang/Object/<init>()V");
			            System.out.println("\treturn");
			            System.out.println(".end method");
			            System.out.println(".method public static main([Ljava/lang/String;)V");
			            System.out.println("\t.limit stack 50");
			            System.out.println("\t.limit locals 10");
			        
			setState(26); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(23);
				((StartContext)_localctx).program = program();

				                System.out.println(((StartContext)_localctx).program.s);
				            
				}
				}
				setState(28); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << T__3) | (1L << T__5))) != 0) );
			setState(30);
			match(EOF);

			                System.out.println("\treturn");
			                System.out.println(".end method");
			            
			setState(32);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatementContext extends ParserRuleContext {
		public String s;
		public AssignStmtContext assignStmt;
		public PrintStmtContext printStmt;
		public RepeatStmtContext repeatStmt;
		public AssignStmtContext assignStmt() {
			return getRuleContext(AssignStmtContext.class,0);
		}
		public PrintStmtContext printStmt() {
			return getRuleContext(PrintStmtContext.class,0);
		}
		public RepeatStmtContext repeatStmt() {
			return getRuleContext(RepeatStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_statement);
		try {
			setState(43);
			switch (_input.LA(1)) {
			case T__3:
				enterOuterAlt(_localctx, 1);
				{
				setState(34);
				((StatementContext)_localctx).assignStmt = assignStmt();

				            ((StatementContext)_localctx).s =  ((StatementContext)_localctx).assignStmt.s;
				        
				}
				break;
			case T__0:
				enterOuterAlt(_localctx, 2);
				{
				setState(37);
				((StatementContext)_localctx).printStmt = printStmt();

				            ((StatementContext)_localctx).s =  ((StatementContext)_localctx).printStmt.s;
				        
				}
				break;
			case T__5:
				enterOuterAlt(_localctx, 3);
				{
				setState(40);
				((StatementContext)_localctx).repeatStmt = repeatStmt();

				            ((StatementContext)_localctx).s =  ((StatementContext)_localctx).repeatStmt.s;
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ProgramContext extends ParserRuleContext {
		public String s;
		public BlockContext block;
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(45);
			((ProgramContext)_localctx).block = block();

			            ((ProgramContext)_localctx).s =  ((ProgramContext)_localctx).block.s;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class BlockContext extends ParserRuleContext {
		public String s;
		public StatementContext statement;
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public BlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_block; }
	}

	public final BlockContext block() throws RecognitionException {
		BlockContext _localctx = new BlockContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_block);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			            ((BlockContext)_localctx).s =  "";
			        
			setState(52); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(49);
					((BlockContext)_localctx).statement = statement();

					                _localctx.s += ((BlockContext)_localctx).statement.s;
					            
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(54); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,2,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PrintStmtContext extends ParserRuleContext {
		public String s;
		public ExprListContext exprList;
		public ExprListContext exprList() {
			return getRuleContext(ExprListContext.class,0);
		}
		public PrintStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_printStmt; }
	}

	public final PrintStmtContext printStmt() throws RecognitionException {
		PrintStmtContext _localctx = new PrintStmtContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_printStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(56);
			match(T__0);
			setState(57);
			match(T__1);
			setState(58);
			((PrintStmtContext)_localctx).exprList = exprList();
			setState(59);
			match(T__2);

			            ((PrintStmtContext)_localctx).s =  "";
			            for(String expression : ((PrintStmtContext)_localctx).exprList.s.split(",")) {
			                _localctx.s += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
			                _localctx.s += "\t" + expression + "\n";
			                _localctx.s += "\tinvokevirtual java/io/PrintStream/print(I)V\n";
			                _localctx.s += "\tgetstatic java/lang/System/out Ljava/io/PrintStream;\n";
			                _localctx.s += "\tldc " + "\" \"" + "\n";
			                _localctx.s += "\tinvokevirtual java/io/PrintStream/print(Ljava/lang/String;)V\n";
			            }
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignStmtContext extends ParserRuleContext {
		public String s;
		public Token ID;
		public Token NUM;
		public ExpressionContext expression;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public AssignStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignStmt; }
	}

	public final AssignStmtContext assignStmt() throws RecognitionException {
		AssignStmtContext _localctx = new AssignStmtContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_assignStmt);
		try {
			setState(73);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(62);
				match(T__3);
				setState(63);
				((AssignStmtContext)_localctx).ID = match(ID);
				setState(64);
				match(T__4);
				setState(65);
				((AssignStmtContext)_localctx).NUM = match(NUM);

				            ((AssignStmtContext)_localctx).s =  "\tldc " + ((AssignStmtContext)_localctx).NUM.getText() + "\n";
				            _localctx.s += "\tistore " + add(((AssignStmtContext)_localctx).ID.getText()) + "\n";
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(67);
				match(T__3);
				setState(68);
				((AssignStmtContext)_localctx).ID = match(ID);
				setState(69);
				match(T__4);
				setState(70);
				((AssignStmtContext)_localctx).expression = expression();

				            ((AssignStmtContext)_localctx).s =  "\t" + ((AssignStmtContext)_localctx).expression.s + "\n";
				            _localctx.s += "\tistore " + get(((AssignStmtContext)_localctx).ID.getText()) + "\n";
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RepeatStmtContext extends ParserRuleContext {
		public String s;
		public ExpressionContext expression;
		public BlockContext block;
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public BlockContext block() {
			return getRuleContext(BlockContext.class,0);
		}
		public RepeatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeatStmt; }
	}

	public final RepeatStmtContext repeatStmt() throws RecognitionException {
		RepeatStmtContext _localctx = new RepeatStmtContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_repeatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(75);
			match(T__5);
			setState(76);
			((RepeatStmtContext)_localctx).expression = expression();
			setState(77);
			match(T__6);
			setState(78);
			((RepeatStmtContext)_localctx).block = block();
			setState(79);
			match(T__7);

			            ((RepeatStmtContext)_localctx).s =  "\tiload 0\n";
			            _localctx.s += "\tistore " + count + "\n";
			            _localctx.s += "\t" + ((RepeatStmtContext)_localctx).expression.s + "\n";
			            _localctx.s += "\tistore " + (count++) + "\n";
			            _localctx.s += "\tloop_" + loop + ":\n";
			            _localctx.s += "\t" + ((RepeatStmtContext)_localctx).block.s + "\n";
			            _localctx.s += "\tiinc " + count + " 1\n";
			            _localctx.s += "\tiload " + count + "\n";
			            _localctx.s += "\tiload " + (count++) + "\n";
			            _localctx.s += "\tif_icmplt loop_" + loop;
			            loop++;
			            count = count + 2;
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprListContext extends ParserRuleContext {
		public String s;
		public ExpressionContext expression;
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public ExprListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exprList; }
	}

	public final ExprListContext exprList() throws RecognitionException {
		ExprListContext _localctx = new ExprListContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_exprList);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{

			            ((ExprListContext)_localctx).s =  "";
			        
			setState(89);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(83);
					((ExprListContext)_localctx).expression = expression();
					setState(84);
					match(T__8);

					                _localctx.s += ((ExprListContext)_localctx).expression.s + ",";
					            
					}
					} 
				}
				setState(91);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(92);
			((ExprListContext)_localctx).expression = expression();

			                _localctx.s += ((ExprListContext)_localctx).expression.s + ",";
			            
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public String s;
		public Token NUM;
		public OperationContext operation;
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public OperationContext operation() {
			return getRuleContext(OperationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_expression);
		int _la;
		try {
			setState(123);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(96);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(95);
					match(T__1);
					}
				}

				setState(98);
				((ExpressionContext)_localctx).NUM = match(NUM);
				setState(100);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
				case 1:
					{
					setState(99);
					match(T__2);
					}
					break;
				}

				            ((ExpressionContext)_localctx).s =  "ldc " + ((ExpressionContext)_localctx).NUM.getText();
				        
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(104);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(103);
					match(T__1);
					}
				}

				setState(106);
				((ExpressionContext)_localctx).operation = operation();
				setState(108);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
				case 1:
					{
					setState(107);
					match(T__2);
					}
					break;
				}

				            ((ExpressionContext)_localctx).s =  ((ExpressionContext)_localctx).operation.s;
				        
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(113);
				_la = _input.LA(1);
				if (_la==T__1) {
					{
					setState(112);
					match(T__1);
					}
				}

				setState(115);
				((ExpressionContext)_localctx).operation = operation();
				setState(117);
				_la = _input.LA(1);
				if (_la==T__2) {
					{
					setState(116);
					match(T__2);
					}
				}

				setState(119);
				match(T__9);
				setState(120);
				((ExpressionContext)_localctx).NUM = match(NUM);

				            ((ExpressionContext)_localctx).s =  ((ExpressionContext)_localctx).operation.s + "\n";
				            _localctx.s += "\tldc " + ((ExpressionContext)_localctx).NUM.getText() + "\n";
				            _localctx.s += "\tiadd";
				        
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OperationContext extends ParserRuleContext {
		public String s;
		public VarContext var;
		public VarContext var() {
			return getRuleContext(VarContext.class,0);
		}
		public OperationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_operation; }
	}

	public final OperationContext operation() throws RecognitionException {
		OperationContext _localctx = new OperationContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_operation);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(125);
			((OperationContext)_localctx).var = var();

			            ((OperationContext)_localctx).s =  "iload " + get(((OperationContext)_localctx).var.sVar);
			        
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VarContext extends ParserRuleContext {
		public String sVar;
		public Token ID;
		public Token NUM;
		public TerminalNode ID() { return getToken(SimpleParser.ID, 0); }
		public TerminalNode NUM() { return getToken(SimpleParser.NUM, 0); }
		public VarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var; }
	}

	public final VarContext var() throws RecognitionException {
		VarContext _localctx = new VarContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_var);
		try {
			setState(132);
			switch (_input.LA(1)) {
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(128);
				((VarContext)_localctx).ID = match(ID);

				            ((VarContext)_localctx).sVar =  ((VarContext)_localctx).ID.getText();
				        
				}
				break;
			case NUM:
				enterOuterAlt(_localctx, 2);
				{
				setState(130);
				((VarContext)_localctx).NUM = match(NUM);

				            ((VarContext)_localctx).sVar =  "" + ((VarContext)_localctx).NUM.getText();
				        
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\17\u0089\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\3\2\3\2\3\2\3\2\6\2\35\n\2\r\2\16\2\36\3\2\3\2\3\2\3\2\3"+
		"\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\3\5\3.\n\3\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\6\5\67\n\5\r\5\16\58\3\6\3\6\3\6\3\6\3\6\3\6\3\7\3\7\3\7\3\7\3\7\3"+
		"\7\3\7\3\7\3\7\3\7\3\7\5\7L\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\t\3\t\3"+
		"\t\3\t\3\t\7\tZ\n\t\f\t\16\t]\13\t\3\t\3\t\3\t\3\n\5\nc\n\n\3\n\3\n\5"+
		"\ng\n\n\3\n\3\n\5\nk\n\n\3\n\3\n\5\no\n\n\3\n\3\n\3\n\5\nt\n\n\3\n\3\n"+
		"\5\nx\n\n\3\n\3\n\3\n\3\n\5\n~\n\n\3\13\3\13\3\13\3\f\3\f\3\f\3\f\5\f"+
		"\u0087\n\f\3\f\2\2\r\2\4\6\b\n\f\16\20\22\24\26\2\2\u008c\2\30\3\2\2\2"+
		"\4-\3\2\2\2\6/\3\2\2\2\b\62\3\2\2\2\n:\3\2\2\2\fK\3\2\2\2\16M\3\2\2\2"+
		"\20T\3\2\2\2\22}\3\2\2\2\24\177\3\2\2\2\26\u0086\3\2\2\2\30\34\b\2\1\2"+
		"\31\32\5\6\4\2\32\33\b\2\1\2\33\35\3\2\2\2\34\31\3\2\2\2\35\36\3\2\2\2"+
		"\36\34\3\2\2\2\36\37\3\2\2\2\37 \3\2\2\2 !\7\2\2\3!\"\b\2\1\2\"#\7\2\2"+
		"\3#\3\3\2\2\2$%\5\f\7\2%&\b\3\1\2&.\3\2\2\2\'(\5\n\6\2()\b\3\1\2).\3\2"+
		"\2\2*+\5\16\b\2+,\b\3\1\2,.\3\2\2\2-$\3\2\2\2-\'\3\2\2\2-*\3\2\2\2.\5"+
		"\3\2\2\2/\60\5\b\5\2\60\61\b\4\1\2\61\7\3\2\2\2\62\66\b\5\1\2\63\64\5"+
		"\4\3\2\64\65\b\5\1\2\65\67\3\2\2\2\66\63\3\2\2\2\678\3\2\2\28\66\3\2\2"+
		"\289\3\2\2\29\t\3\2\2\2:;\7\3\2\2;<\7\4\2\2<=\5\20\t\2=>\7\5\2\2>?\b\6"+
		"\1\2?\13\3\2\2\2@A\7\6\2\2AB\7\16\2\2BC\7\7\2\2CD\7\r\2\2DL\b\7\1\2EF"+
		"\7\6\2\2FG\7\16\2\2GH\7\7\2\2HI\5\22\n\2IJ\b\7\1\2JL\3\2\2\2K@\3\2\2\2"+
		"KE\3\2\2\2L\r\3\2\2\2MN\7\b\2\2NO\5\22\n\2OP\7\t\2\2PQ\5\b\5\2QR\7\n\2"+
		"\2RS\b\b\1\2S\17\3\2\2\2T[\b\t\1\2UV\5\22\n\2VW\7\13\2\2WX\b\t\1\2XZ\3"+
		"\2\2\2YU\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2[\\\3\2\2\2\\^\3\2\2\2][\3\2\2\2^"+
		"_\5\22\n\2_`\b\t\1\2`\21\3\2\2\2ac\7\4\2\2ba\3\2\2\2bc\3\2\2\2cd\3\2\2"+
		"\2df\7\r\2\2eg\7\5\2\2fe\3\2\2\2fg\3\2\2\2gh\3\2\2\2h~\b\n\1\2ik\7\4\2"+
		"\2ji\3\2\2\2jk\3\2\2\2kl\3\2\2\2ln\5\24\13\2mo\7\5\2\2nm\3\2\2\2no\3\2"+
		"\2\2op\3\2\2\2pq\b\n\1\2q~\3\2\2\2rt\7\4\2\2sr\3\2\2\2st\3\2\2\2tu\3\2"+
		"\2\2uw\5\24\13\2vx\7\5\2\2wv\3\2\2\2wx\3\2\2\2xy\3\2\2\2yz\7\f\2\2z{\7"+
		"\r\2\2{|\b\n\1\2|~\3\2\2\2}b\3\2\2\2}j\3\2\2\2}s\3\2\2\2~\23\3\2\2\2\177"+
		"\u0080\5\26\f\2\u0080\u0081\b\13\1\2\u0081\25\3\2\2\2\u0082\u0083\7\16"+
		"\2\2\u0083\u0087\b\f\1\2\u0084\u0085\7\r\2\2\u0085\u0087\b\f\1\2\u0086"+
		"\u0082\3\2\2\2\u0086\u0084\3\2\2\2\u0087\27\3\2\2\2\17\36-8K[bfjnsw}\u0086";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}