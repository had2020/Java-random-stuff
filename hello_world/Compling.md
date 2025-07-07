// for basic compile and run
1. javac test.java
2. java test


// for jar file
1. manifest.txt -> Main-Class: test
2. javac test.java
3. jar cfm MyProgram.jar manifest.txt test.class
4. java -jar test.jar
