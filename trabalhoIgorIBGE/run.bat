@echo off
echo Compilando...
mkdir bin 2>nul
javac -cp ".;gson-2.13.1.jar" -d bin Main.java Sistema.java Usuario.java Noticia.java Persistencia.java
echo Executando...
java -cp "bin;gson-2.13.1.jar" Main
pause
