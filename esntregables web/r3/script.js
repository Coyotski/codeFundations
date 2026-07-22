function guardarDatos(event) {
    event.preventDefault(); // Evita que se recargue la página

    const nombre = document.getElementById('nombre').value;
    const apellidos = document.getElementById('apellidos').value;
    const edad = document.getElementById('edad').value;
    const correo = document.getElementById('correo').value;
    const contrasena = document.getElementById('contrasena').value;

    const datos = {
        nombre,
        apellidos,
        edad,
        correo,
        contrasena
    };

    localStorage.setItem('datos', JSON.stringify(datos)); // Guarda los datos en localStorage

    window.location.href = 'card.html'; // Redirige a card.html
}