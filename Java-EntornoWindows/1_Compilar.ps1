<#  
    El archivo de java debe estar en la misma ruta que este Script.
    El archivo java no pertenece a ningún paquete.

    OBJETIVOS:
    - Crear un Bytecode a partir de un código de java.
#>

# Comandos:

javac entorno/Code.java

Write-Host "Terminado!!!"

write-host "Preiona una tecla para continuar..."

# ReadKey (System.Console)
[void][System.Console]::ReadKey($true)


# Fin.