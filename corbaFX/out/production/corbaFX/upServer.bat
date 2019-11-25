cd C:\Users\L\IdeaProjects\corbaFX\src

javac *.java NotePadApp/*.java

start orbd -ORBInitialPort 1050

start java -classpath . Server -ORBInitialPort 1050 -ORBInitialHost localhost