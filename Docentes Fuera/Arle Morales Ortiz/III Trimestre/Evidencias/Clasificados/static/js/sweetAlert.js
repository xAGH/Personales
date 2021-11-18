function contacto(nombre, email, telefono){
    var nombre = nombre, email = email, telefono = telefono; 
    Swal.fire({
        title: 'Datos de contacto',
        html: "<div class='datos'>Nombre: " + nombre + "<br/><br/>" + "Email: " + email + "<br/><br/>" + "Teléfono: " + telefono + "</div>",
        icon: 'info',
        confirmButtonText: 'Ok'
      })
}