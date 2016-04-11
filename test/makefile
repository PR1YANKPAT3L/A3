make:
	java -jar antlr.jar -no-listener Simple.g4
	javac -cp antlr.jar *.java
	java -cp antlr.jar:. SimpleCompiler sample.src > sample.j
	java -jar jasmin.jar sample.j
	java sample
