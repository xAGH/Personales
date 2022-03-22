# Flask Api
Api con 4 rutas básicas que simula una aplicación de compras.

## ¡Importante!
Renombrar el archivo **env** a **.env**

## Instalación

```bash
pip install -r requirements.txt
```

## Uso
```
/api/v01/registeruser:
    Metodos => POST {
        Recibe => 
            Json: {
                "nombres": string [lenght > 0 and lenght <= 200],
                "apellidos": string [lenght > 0 and lenght <= 200],
                "edad": int [value >= 18 and value <= 120],
                "ciudad": string [lenght > o and lenght <= 100],
                "email": string[email],
                "password": string[lenght >= 8 and lenght <= 12]
            }
        Retorna => 
            Json: {
                "status": 201,
                "response": "Usuario registrado satisfactoriamente"
            }
        }
```
```
/api/v01/login:
    Metodos => POST {
        Recibe => 
            Args Params {
                "email": string[email],
                "password": string[lenght >= 8 and lenght <= 12]
            }
        Retorna => 
            Json {
                "status": 202,
                "reponse": "Logueado correctamente.",
                "token": jwt_token
            }
        }
```
```
/api/v01/productos:
    Metodos => GET {
        Retorna => 
            Json {
                "status": 202,
                "reponse": list[{"id":int, "producto":string, "precio": double}...]
            }
        }
```
```
/api/v01/comprar:
    Metodos => POST {
        Recibe => 
            Json {
                "idproducto": int
            }
            Header {
                "Authorization": jwt_token
            }
        Retorna => 
            Json {
                "status": 200,
                "response": "Compra ok"
            }
        }
```
