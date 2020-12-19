<#
    CONDICIONES:
    El Bytecode está en la misma ruta que este script.

    OBJETIVOS:
    - Ejecutar un Bytecode de Java.
#>

# Comandos:

Get-Date

Write-Host "------------------------------------------------------------------------------"

java entorno/Code

Write-Host "------------------------------------------------------------------------------"

Write-Host "El Script ha terminado!!!"

Write-Host "Press any key to continue ..."

#  ReadKey (RawUI) - 
$x = $host.UI.RawUI.ReadKey("NoEcho,IncludeKeyDown")

# Fin.