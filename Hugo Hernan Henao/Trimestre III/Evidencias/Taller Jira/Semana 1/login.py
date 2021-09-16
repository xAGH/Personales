from getpass import getpass as inp

data =      {"alejo":"pruebas1234",
            "julian":"pruebas1234",
            "cris":"pruebas1234",
            "juan jose":"pruebas1234",
            "juan camilo":"pruebas1234",
            "guillermo":"pruebas1234",
            "jorge mario":"pruebas1234"
            }

def ingresoDatos():
    usuario = input("Ingrese su usuario: ").lower()
    password = inp("Ingrese su contraseña: ")
    password2 = inp("Confirme su contraseña: ")
    return usuario, password, password2

def validarLargorContrasenas(password, password2):
    if (len(password)) > 7 and (len(password2)) > 7:
        return True
    return False


def validarUsuario(usuario):
    for i in data:
        if i == usuario:
            return True
    return False

def validarContrasenas(password, password2):
    if password == password2:
       return True
    return False

def validarData(usuario, passw):
    if data[usuario] == passw:
        return True
    return False

def main():
    usuario, password, password2 = ingresoDatos()
    if validarUsuario(usuario) == True:

        if validarLargorContrasenas(password, password2) == True:

            if validarContrasenas(password, password2) != False:

                if validarData(usuario, password) == True:
                    return "Ha ingresado correctamente."

                return "Las credenciales no coinciden."

            return "Las contraseñas no coinciden."

        return "Las contraseñas deben contener al menos 8 caracteres."

    return "No se encuentra ningun usuario con ese nombre registrado."
        

if __name__ == '__main__':
    print(main())