# 2.  Cree las siguientes clases con los siguientesrequerimientos

# a)Persona: con dos métodos y dos propiedades:
class Persona():

    nombre = ""
    edad = ""

    def hablar(self):
        pass

    def pensar(self):
        pass

# b)Aprendiz: con dos métodos y dos propiedades:
class Aprendiz():

    ficha = "2336347"
    nombre_curso = "ADSI"

    def atender(self):
        pass

    def estudiar(self):
        pass

# c)Avión: con cuatro métodos y tres propiedades:
class Avion():

    color = ""
    tipo = ""
    capacidad = ""

    def volar(self):
        pass

    def transportar(self):
        pass

    def aterrizar(self):
        pass

    def despegar(self):
        pass

# d)Un clase con su nombre con métodos y atributos quelo describan a Ud:
class Alejandro(Persona, Aprendiz):
    Persona.nombre = "Alejo"
    Persona.edad = "18"

    def programar(self):
        print(f"{Persona.nombre} programa")

    def jugar(self):
        print(f"{Persona.nombre} juega videojuegos.")

    def caminar(self):
        print(f"A {Persona.nombre} le gusta caminar.")

    def escuchar(self):
        print(f"A {Persona.nombre} le gusta la música.")

Alejo = Alejandro() 
print(Alejo.nombre)
print(Alejo.edad)
print(Alejo.ficha)
print(Alejo.nombre_curso)
Alejo.programar()
Alejo.jugar()
Alejo.caminar()
Alejo.escuchar()