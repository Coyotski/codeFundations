$content = Get-Content "c:\Users\César\Documents\escuela publica de codigo\Rutina\Rutina.txt" -Raw -Encoding UTF8

# Reemplazar caracteres extraños comunes
$content = $content -replace '[â]', ''
$content = $content -replace 'Ã\s*Ü', 'Ó'
$content = $content -replace 'Ü', 'Ú'
$content = $content -replace 'Ã±', 'ñ'
$content = $content -replace 'Ã', 'Ñ'
$content = $content -replace '¦', '|'
$content = $content -replace '¤', ''
$content = $content -replace '\?{3,}', '---'
$content = $content -replace '-{80,}', "`n---`n"
$content = $content -replace '\r\r\n', "`n"
$content = $content -replace '\r\n', "`n"

# Agregar iconos a secciones principales
$content = $content -replace '(?m)^PARTE I:', '# 📚 PARTE I:'
$content = $content -replace '(?m)^PARTE II:', '# 📈 PARTE II:'
$content = $content -replace '(?m)^PARTE III:', '# 🍽️ PARTE III:'
$content = $content -replace '(?m)^PARTE IV:', '# 💪 PARTE IV:'
$content = $content -replace '(?m)^PARTE V:', '# 😴 PARTE V:'
$content = $content -replace '(?m)^PARTE VI:', '# 🧠 PARTE VI:'
$content = $content -replace '(?m)^CAPÍTULO (\d+):', '## 📖 CAPÍTULO $1:'
$content = $content -replace '(?m)^DÍA (\d+):', '### 🏋️ DÍA $1:'
$content = $content -replace '(?m)^EJERCICIO (\d+):', '#### 🔹 EJERCICIO $1:'

# Guardar
$content | Out-File "c:\Users\César\Documents\escuela publica de codigo\Rutina\rutinaLeviatan.md" -Encoding UTF8
Write-Host "✅ Archivo creado exitosamente!"
