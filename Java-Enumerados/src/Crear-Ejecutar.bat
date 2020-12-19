@echo off
MODE CON cols=72 lines=20
title Build

echo Crear el ejecutable de Java

REM --------------------------------------------------

:: Crear bytecode: -encoding utf8
javac Main.java Mes.java -encoding utf8

:: Creando el .jar 
jar -cf Main.jar Main.class Mes.class

:: Modificar para usar el manifiesto
jar cmf manifiesto.mf Main.jar Main.class Mes.class

REM --------------------------------------------------



echo Creado Main.jar
pause


cls
Java -jar Main.jar

pause