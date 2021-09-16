class Validator():
    
    def validar_nombre(nombre):
        numeros = False
        
        for i in nombre:
            if i is int:
                numeros = True

        if nombre == None:
            return {False:"El nombre está vacio"}

        elif nombre < 2:
            return {False:"El nombre debe contener más de 2 letras."}

        elif numeros == True:
            return {False:"El nombre no puede contener letras."}

        else:
            return nombre.title()