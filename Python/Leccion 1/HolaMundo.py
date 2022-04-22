# Hola Mundo en Python

miVariable = "Hola Mundo"
print(miVariable)
miVariable = 3.5
print(miVariable)
x = 10
y = 2
z = x+y
print(z)
print(id(x))  # Literales en memoria(varía constantemente y se escribe x234, y432, z213)
print(id(y))
print(id(z))

# Tipos int, float, string, bool
x = 10
print(x)
print(type(x))  # Indicador del tipo de variable
x = 14.5
print(x)
print(type(x))
x = "Hola!"
print(x)
print(type(x))
x = True
print(x)
print(type(x))
x = False
print(x)
print(type(x))

# Manejo de cadenas (String)
miGrupoFavorito = "Led Zeppelin ""The best band"
print("Mi grupo favorito es: "+miGrupoFavorito)
numero1 = "7"
numero2 = "8"
print(int(numero1) + int(numero2))  # Conversión de String a Entero

# Tipos Booleanos (Bool)
miBooleano = 7 > 2
print(miBooleano)

if miBooleano:
    print("El resultado es verdadero")
else:
    print("El resultado es falso")

# Procesar la entrada del usuario
# FUNCIÓN INPUT
# resultado = input("Digite un número")  #Retorna un dato tipo String
# print(resultado)

# Conversión de la entrada de los datos
numero1 = int(input("Escribe el primer número: "))  # CONVERSION
numero2 = int(input("Escribe el segundo número: "))
resultado = numero1 + numero2
print("El resultado de la suma es: ", resultado)