<#
    CONDICIONES:
    - En el directorio ya debe estar el archivo de manifiesto con el nombre: "temp.mf"

    OBJETIVO:
    - Generar un archivo .jar
#>

# Menera el Jar:
jar -cf entorno/Code.jar entorno/Code.class

# Modificarlo para indicarle que archivo de manifiesto debe usar,
jar cmf temp.mf entorno/Code.jar entorno/Code.class

<#
Se permiten comodines (por ejemplo, para incluir todos los archivos class de la carpeta 
o que cumplan con alguna condición dada):

jar cmf temp.mf HolaMundo.jar fichero$.class
jar cmf temp.mf HolaMundo.jar *.class
#>

Write-Host "Finalizado!!!"

Read-Host -Prompt "Presiona la tecla Enter para continuar..."
