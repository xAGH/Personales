class Validator():
    
    def validar_nombre(self, nombre):
        numeros = False

        if nombre == None:
            return "El nombre está vacio"
        
        for i in range(len(nombre)):
            if nombre[i].isdigit():
                numeros = True

        if len(nombre) < 2:
            return "El nombre debe contener más de 1 letras."

        elif numeros == True:
            return "El nombre no puede contener números."

        elif len(nombre.split()) < 2:
            return "El cliente debe de contar al menos con un apellido."

        else:
            return True

    def validar_telefono(self, movil):
        try:

            if len(movil) < 5:
                return "El número telefónico debe contener mas de 5 números."

            elif int(movil) < 0:
                return "El número telefónico no puede ser negativo."

            elif len(movil) == 0:
                return "El número telefónico debe contener un valor."

            elif len(movil) > 15:
                return "El número telefónico no puede tener más de 16 dígitos."

            elif not movil.isdigit():
                return "Solo se aceptan números naturales en el teléfono."

            else:
                return True

        except:
            return "El número telefónico debe contener solo números."

    def validar_saldo(self, saldo):
        try:
            if len(saldo) == 0:
                return "El saldo está vacio"

            elif int(saldo) < 50 and int(saldo) > 0:
                return "El saldo debe de ser mayor a 50 pesos"

            else:
                return True

        except:
            return "Solo se admiten números."