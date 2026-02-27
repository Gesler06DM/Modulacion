# Modulacion
En este proyecto desarrollé un programa en Java utilizando el concepto de modulación, es decir, dividí el programa en diferentes métodos para que cada uno realizara una tarea específica. Lo hice de esta manera para que el código fuera más ordenado, más fácil de entender y más profesional.

El programa funciona mediante un menú principal, el cual permite al usuario elegir entre diferentes ejercicios como calculadora, validación de contraseña, número primo, suma de pares, conversión de temperatura, contador de vocales, factorial, adivinanza, intercambio de valores y tabla de multiplicar.

Utilicé un ciclo do-while en el método main para que el menú se repita hasta que el usuario decida salir (opción 0). También utilicé un switch para controlar qué ejercicio se ejecuta dependiendo de la opción seleccionada.

// 1) CALCULADORA
En esta sección desarrollé una calculadora básica.
Primero le pido al usuario dos números.
Luego muestro un pequeño menú con las operaciones disponibles (suma, resta, multiplicación y división).
Después utilizo un switch para ejecutar la operación elegida.
Separé cada operación en métodos diferentes:
	sumar()
	restar()
	multiplicar()
	dividir()

Lo hice así porque aplicar modulación significa que cada método debe cumplir una función específica.
También agregué una validación para evitar dividir entre cero.

// 2) CONTRASEÑA
Aquí hice un ejercicio donde el usuario debe ingresar una contraseña correcta.
Utilicé un ciclo do-while para que el usuario siga intentando hasta que escriba la contraseña correcta (123456).
Cuando la contraseña es correcta, se muestra el mensaje “Acceso aprobado”.

// 3) NUMERO  PRIMO
En este ejercicio el usuario ingresa un número y el programa determina si es primo.
Creé un método aparte llamado esPrimo() que devuelve true o false.
Utilicé:
		Validación para números menores o iguales a 1.
		Un ciclo for para comprobar divisores.
Separé la lógica en otro método para aplicar correctamente el concepto de modula

//4) SUMA DE NUMEROS PARES
En esta parte el usuario ingresa números hasta que escriba 0.
Si el número es par (numero % 2 == 0), se suma a la variable sumaPares.
Utilicé un ciclo while para repetir el proceso hasta que el usuario decida terminar.

//5) TEMPERATURA
Aquí hice un conversor de temperatura.
El usuario puede elegir:
	1.	Celsius a Fahrenheit
	2.	Fahrenheit a Celsius

Creé métodos separados:
	celsiusAFahrenheit()
		fahrenheitACelsius()
Utilicé fórmulas matemáticas correctas para hacer las conversiones.

//6) VOCAES
En este ejercicio el usuario escribe un texto.

Creé un método contarVocales() que:
	  Convierte el texto a minúsculas.
		Recorre cada carácter con un ciclo for.
		Verifica si es vocal usando una condición con ||.
Devuelve la cantidad total de vocales encontradas.

// 7) FACTORIAL
Aquí el usuario ingresa un número entero no negativo.

Utilicé:
		Un ciclo do-while para validar que no sea negativo.
		Un método factorial() que utiliza un ciclo for para calcular el resultado.
Usé tipo long para evitar desbordamiento en números grandes.

//8) ADIVINANSA 
En esta parte el programa genera un número aleatorio entre 1 y 100 usando Random.
El usuario debe adivinar el número.
Utilicé un ciclo do-while para que el usuario siga intentando hasta acertar.

El programa indica si el número es mayor o menor que el ingresado.

// 9)PASO POR REFERENCIA
Aquí hice un ejemplo de intercambio de valores usando una clase interna llamada IntBox.
Java trabaja por valor, entonces utilicé objetos para simular el paso por referencia.
Creé:
		Una clase IntBox
		Un método intercambiar() que cambia los valores usando una variable temporal.

  //10) TABLA DE MULTIPLICAR
  En este ejercicio el usuario ingresa un número.
Creé el método generarTabla() que utiliza un ciclo for para imprimir la tabla del 1 al 10.
