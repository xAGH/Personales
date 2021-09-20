class Validator():
    
    def validar_nombre(nombre):
        numeros = False
        apellido = False
        
        for i in range(len(nombre)):
            if nombre[i] is int:
                numeros = True

            try:
                if (nombre[i] == " ") and (nombre[i + 1].ispalha()):
                    apellido = True
            
            except:
                pass

        if nombre == None:
            return "El nombre está vacio"

        elif nombre < 2:
            return "El nombre debe contener más de 2 letras."

        elif numeros == True:
            return "El nombre no puede contener letras."

        elif apellido != True:
            return "El cliente debe de contar al menos con un apellido."

        else:
            return True

    def validar_movil(movil):
        try:
            if len(movil) < 4:
                return "El número telefónico debe contener mas de 4 números."

            elif movil < 0:
                return "El número telefónico no puede ser negativo."

            elif len(movil) == 0:
                return "El número telefónico debe contener un valor."

            elif len(movil) > 15:
                return "El número telefónico no puede tener más de 15 dígitos."

            else:
                return True

        except:
            return "El número telefónico debe contener solo números."