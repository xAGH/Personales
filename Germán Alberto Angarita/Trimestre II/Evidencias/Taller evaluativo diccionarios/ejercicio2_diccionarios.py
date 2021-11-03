def for_keys(persona): # Usando ciclo for y el método keys(), imprima todas las claves del diccionario dado.
    print("LLaves: ")
    for key in persona.keys():
        print(key)

def for_values(persona): # Usando ciclo for y el método values() imprima todos los valores del diccionario.
    print("Valores: ")
    for value in persona.values():
        print(value)

# Luego, sobre el mismo diccionario realice las siguientes operaciones:
# ● Cambie el valor de la clave peso por 77.
# ● Cambie el valor de la clave edad por 21.
# ● Elimine la clave apellidos usando método pop.
# ● Imprimir el valor de la clave peso usando el método get.

def cambios(persona):
    persona["peso"] = 77
    persona["edad"] = 21
    persona.pop("apellidos")
    print(f"\nDiccionario con los cambios: {persona}")
    get_peso = persona.get("peso")
    print(f"\nPeso con el método get(): {get_peso}\n")

def main():
    persona = {"edad": 20, "peso": 75, "nombres": "Pedro", "apellidos": "Pérez Pérez"}
    print("\n")
    for_keys(persona)
    print("\n")
    for_values(persona)
    cambios(persona)

main()
