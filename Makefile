# FLAGS=java -Wall variable para almacenar banderas u opciones de configuracion

all: Main.java Interfaz.java
	javac *.java

clear:
	rm *.class
	