# Leer archivo
$lines = Get-Content "c:\Users\César\Documents\escuela publica de codigo\Rutina\Rutina.txt" -Encoding UTF8

# Crear nuevo archivo
$output = @()
$output += "# 🦁 EL CAMINO DEL LEVIATÁN"
$output += ""
$output += "## De 118KG a 140KG en 12 Meses"
$output += ""
$output += "**Manual Completo de Transformación Masiva para Powerlifting**"
$output += ""
$output += "---"
$output += ""

foreach ($line in $lines) {
    # Limpiar caracteres extraños básicos
    $clean = $line -replace '[^\x00-\x7F]+', ''
    
    # Agregar formato Markdown
    if ($clean -match '^PARTE [IVX]+:') {
        $clean = "# " + $clean
    }
    elseif ($clean -match '^CAPTULO \d+:') {
        $clean = "## " + $clean
    }
    elseif ($clean -match '^DA \d+:') {
        $clean = "### " + $clean
    }
    elseif ($clean -match '^EJERCICIO \d+:') {
        $clean = "#### " + $clean
    }
    elseif ($clean -match '^-{20,}') {
        $clean = "---"
    }
    
    $output += $clean
}

# Guardar
$output | Out-File "c:\Users\César\Documents\escuela publica de codigo\Rutina\rutinaLeviatan.md" -Encoding UTF8
Write-Host "Archivo creado exitosamente!"
