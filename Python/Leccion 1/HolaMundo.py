# Hola Mundo en Python

'''miVariable = "Hola Mundo"
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
'''
'''
# OPERADORES ARITMETICOS
operandoA = 8
operandoB = 5
suma = operandoA + operandoB
# print("Resultado de la suma:", suma)
print(f"El resultado de la suma es: {suma}") #Interpolación (Método más usado para imprimir)

resta = operandoA - operandoB
print(f"El resultado de la resta es: {resta}")

producto = operandoA * operandoB
print(f"El resultado del producto es: {producto}")

division = operandoA / operandoB
print(f"El resultado de la división es: {division}")

division = operandoA // operandoB
print(f"El resultado de la division (int) es: {division}")

modulo = operandoA % operandoB
print(f"El resultado del modulo es: {modulo}")

potencia = operandoA ** operandoB
print(f"El resultado de la potencia es: {potencia}")

# Calculo de área y perímetro

alto = int(input("Proporciona el alto del rectángulo: "))
ancho = int(input("Proporciona el ancho del rectángulo: "))
area = alto * ancho
perimetro = (alto + ancho) * 2
print(f"El área del rectángulo es de: {area}", f"y el perimetro es: {perimetro}")
'''
'''
# OPERADORES DE REASIGNACIÓN
mivariable3 = 10
print(mivariable3)

mivariable3 = mivariable3 + 1  # Método tradicional
print(mivariable3)

mivariable3 += 1  # Método más eficiente
print(mivariable3)

# mivariable3 = mivariable3 - 2
mivariable3 -=2
print(mivariable3)

# mivariable3 = mivariable3 *3
mivariable3 *= 3
print(mivariable3)

# mivariable3 = mivariable3 / 1
mivariable3 /= 2
print(mivariable3)

# OPERADORES DE COMPARACIÓN
d=4
b=2
# Operador de igualdad
resultado = d == b
print(resultado)
# Operador de diferencia
resultado = d != b
print(resultado)
# Operador mayor
resultado = d > b
print(resultado)
# Operador menor
resultado = d < b
print(resultado)
# Operador mayor o igual
resultado = d >= b
print(resultado)
# Operador menor o igual
resultado = d <= b
print(resultado)
'''
'''
# Ejercicio Pares o impares

x = int(input("Ingrese un número: "))
resultado = x % 2

if resultado == 0:
    print("El número ingresado es par.")
else:
    print("El número ingresado es impar")
'''
# Ejercicio Mayor de Edad

edad = int(input("¿Cuál es su edad?"))
if edad >= 18: print("Es mayor de 18.")
else: print("No es mayor de 18.")

