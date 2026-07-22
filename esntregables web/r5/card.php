<!DOCTYPE html>
<html lang="es">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Alumno</title>
    <link rel="stylesheet" href="card.css">
</head>
<body>
    <div class="card">
        <img src="student.png" alt="Foto de alumno">  <h2>Alumno</h2>
        <?php
        if ($_SERVER["REQUEST_METHOD"] == "POST") {
            $nombre = $_POST["nombre"];
            $apellidos = $_POST["apellidos"];
            $edad = $_POST["edad"];
            $correo = $_POST["correo"];

            echo "<p><strong>Nombre:</strong> " . $nombre . "</p>";
            echo "<p><strong>Apellidos:</strong> " . $apellidos . "</p>";
            echo "<p><strong>Edad:</strong> " . $edad . "</p>";
            echo "<p><strong>Correo:</strong> " . $correo . "</p>";
        }
        ?>
    </div>
</body>
</html>