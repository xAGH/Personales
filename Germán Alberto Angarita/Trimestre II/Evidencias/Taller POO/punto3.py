# 3.  Cree las siguientes clases aplicando la herencia requerida:

# a)  Una super clase Ave la cual tenga dos métodos: volar y beber:
class Ave():
    
    def volar(self):
        print("Los pájaros vuelan.")

    def beber(self):
        print("Los pájaros beben.")

# b)  Una clase Canarioque tengaun métodocantary que herede de la clase Ave:
class Canario(Ave):
    
    def cantar(self):
        print("Los canarios cantan.")

# Instancie la clase Canario y use los métodos cantar(propios de la claseCanario) y los métodos heredados volar y beber.

Mi_Pajaro = Canario()
Mi_Pajaro.volar()
Mi_Pajaro.beber()
Mi_Pajaro.cantar()
