# FLAGS=java -Wall variable para almacenar banderas u opciones de configuracion

all: src/main/java/Main.java src/main/java/Interfaz.java
	@javac src/main/java/*.java
	@mv src/main/java/*.class .
	@echo "Make all completed"

clear:
	@rm *.class
	@echo "clear completed"
	
