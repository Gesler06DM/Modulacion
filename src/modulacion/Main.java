package modulacion;

import java.util.Random;
import java.util.Scanner;

public class Main {
	private static final Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		int opcion;
		do {
			mostrarMenu();
			opcion = leerEntero("Elige una opcion: ");
			
			switch (opcion){
				case 1: ejercicioCalculadora();
				break;
				case 2: ejercicioContrasena();
				break;
				case 3: ejercicioPrimo();
				break;
				case 4: ejercicioSumaPares();
				break;
				case 5: ejercicioTemperatura();
				break;
				case 6: ejercicioVocales();
				break;
				case 7: ejercicioFactorial();
				break;
				case 8: ejercicioAdivinar();
				break;
				case 9: ejercicioIntercambio();
				break;
				case 10: ejercicioTabla();
				break;
				case 0:System.out.println("Salida del programa Adios ");
				break;
				default: System.out.println("Error opcion Incorrecta");
			}
			if (opcion != 0) pausa();
		}
		while (opcion !=0);
		sc.close();
	}
		//AQUI ESTA EL MENU PRINCIPAL
	private static void mostrarMenu() {
		System.out.println("Menu principal");
		System.out.println("1) Calculadora");
		System.out.println("2) Validacion de contraseña");
		System.out.println("3) Numero primo");
		System.out.println("4) Suma de numero pares");
		System.out.println("5) Covercion de temperatura");
		System.out.println("6) Contador de vocales");
		System.out.println("7) Factorial");
		System.out.println("8) Juego de Adivinanza");
		System.out.println("9) Intercambio de valores");
		System.out.println("10) Tabla de multiplicar");
		System.out.println("0) Salir el programa");
	}
	private static int  leerEntero(String msg) {
		while(true) {
			try {
				System.out.print(msg);
				return Integer.parseInt(sc.nextLine());
			}catch (Exception e) {
				System.out.println("Ingrese un numero valido");
			}
		}
	}
		//VALIDACIONES
	private static double leerDouble(String msg) {
		while (true) {
			try{
				System.out.print(msg);
				return Double.parseDouble(sc.nextLine());
			}catch (Exception e) {
				System.out.println("Ingrese un numero valido");
			}
		}
	}
	private static void pausa() {
		
		System.out.println("precione ENTER para continuar");
		sc.nextLine();
	}
		//1)CALCULADORA
	private static void ejercicioCalculadora() {
		System.out.println("\nCalculadora");
		
		double a= leerDouble("Ingrese el primer numero");
		double b= leerDouble("Ingrese el segundo numero");
		
		System.out.println("Operaciones");
		System.out.println("1) Suma");
		System.out.println("2) Resta");
		System.out.println("3) Multiplicacion ");
		System.out.println("4) Division");
		
		int op = leerEntero("Elige cualquiera de las operaciones");
		
		switch (op) {
		case 1: System.out.println("El resultado de la suma es: "+ sumar(a, b));
		break;
		case 2: System.out.println("El resultado de la resta es: "+ restar(a, b));
		break;
		case 3: System.out.println("El resultado de la multiplicacion es: "+ multiplicar(a, b));
		break;
		case 4: if (b ==0) {
			System.out.println("No se puede dividir entre ceros");			
		}else {
			System.out.println("El resultado de la division es:"+dividir(a,b));
		}
		break;
		default: System.out.println("Opcion Incorrecta");
		}
	}
		//METODO POR OPERACION
	private static double sumar(double x, double y) {
        return x + y;
    }

    private static double restar(double x, double y) {
        return x - y;
    }

    private static double multiplicar(double x, double y) {
        return x * y;
    }

    private static double dividir(double x, double y) {
        return x / y;	
    }
    	//2)CONTRASEÑA
    private static void ejercicioContrasena() {
    	System.out.println("\n Validacion de la contraseña");
    	int intento;
    	
    	do { intento=leerEntero("Ingrela la contraseña");
    	
    	if (intento!=123456) {
    		System.out.println("La contrasela que ingreso es incorrecta. Intenta otra vez");
    		}
    	}while (intento!=123456);
    	System.out.println("Acceso aprovado");
    }
    	//3)NUMERO PRIMO
    private static void ejercicioPrimo() {
    	
    	System.out.println("\n Numero Primo");
    	
    	int n = leerEntero("Ingresa un numero Entero");
    	if(esPrimo(n)) {
    		System.out.println("El numero es primo"+n);
    		}else { System.out.println("El numero no es primo"+n);
    		}
    }
    private static boolean esPrimo(int n) {
    	if (n <=1) return false;
    	if (n ==2) return true;
    	if (n %2 ==0) return false;
    	
    	for (int i=3; i*i<= n; i+=2) {
    		if (n%i ==0)return false;
    	} return true;
    }
    
    	//4)SUMA DE NUMEROS PARES
    private static void ejercicioSumaPares() {
    	System.out.println("\nSuma de numero pares");
    	System.out.println("Ingresa un numero entero. Que termine con 0");
    	int sumaPares=0;
    	int numero = leerEntero("Numero");
    	
    	while (numero !=0) {
    		if(numero%2 == 0) {
    			sumaPares +=numero;
    		}
    		numero=leerEntero("Numero: ");
    	}	System.out.println("La suma de numeros pares ingresados es: "+sumaPares);
    }
    	
    	//5)TEMPERATURA
    	private static void ejercicioTemperatura() {
            System.out.println("\nCovercion de temperatura");
            System.out.println("1) Celsius a Fahrenheit");
            System.out.println("2) Fahrenheit a Celsius");

            int op = leerEntero("Elija una opcion: ");

            if (op == 1) {
                double c = leerDouble("Ingrese Celsius: ");
                System.out.println("Fahrenheit: " + celsiusAFahrenheit(c));
            } else if (op == 2) {
                double f = leerDouble("Ingrese Fahrenheit: ");
                System.out.println("Celsius: " + fahrenheitACelsius(f));
            } else {
                System.out.println("Opcion invalida.");
            }
        }
        private static double celsiusAFahrenheit(double c) {
            return (c * 9.0 / 5.0) + 32.0;
        }
        private static double fahrenheitACelsius(double f) {
            return (f - 32.0) * 5.0 / 9.0; } 
		//6)VOCALES
	private static void ejercicioVocales() {
		System.out.println("\nContador de Vocales");
		System.out.println("Ingrese");
		String texto = sc.nextLine();
		int cantidad = contarVocales(texto);
		System.out.println("Cantidad de vocales encontrada: "+cantidad );
		}
	private static int contarVocales(String texto) {
		int cont =0;
		String t=texto.toLowerCase();
		for(int i =0; i<t.length();i++) {
			char ch = t.charAt(i);
			if (ch=='a' || ch == 'e'|| ch == 'i' || ch == 'o' || ch == 'u') {
			cont++ ;
			} 
	} return cont;
}
		//7)FACTORIAL
	private static void ejercicioFactorial() {
	System.out.println("\n Ejercicio Factorial");
	int n;
	do {
		n=leerEntero("Ingrese un numero entero no negativo");
		if (n<0) {
			System.out.println("No se permiten numeros negativos");
		}
	}while (n<0);
	long resultado=factorial(n);
	System.out.println(n+ "! = "+ resultado);
	}
	private static long factorial (int n) {
		long res=1;
		for (int i =2; i<=n; i++) {
			res *=i;
		}return res;
	}
	//8)AIVINANZA
	private static void ejercicioAdivinar() {
		System.out.println("\n Ejercicio Adivinanza");
		int secreto = new Random().nextInt(100)+1;
		int intento;
		
		do 
		{ intento = leerEntero("Adivina el numero (1-100) ");
		if(intento<secreto) {
			System.out.println("Estas serca pero el numero es mas grande");
		}else if (intento>secreto) {
			System.out.println("Te pasaste el numero es menor");
		}
		}while (intento != secreto);
		System.out.println("Lo lograste el numero es: "+secreto);
	}
		//9=PASO  POR REFERENCIA
	private static void ejercicioIntercambio() {
		System.out.println("\n Ejercicio Paso por refencia");
		
		IntBox a=new IntBox(leerEntero("Ingrese a"));
			IntBox b=new IntBox(leerEntero("Ingrese b"));
			
			System.out.println("Antes del intercambio a="+ a.value+"b="+ b.value);
			intercambiar (a, b);
			System.out.println("Despues del intercambio a="+ a.value + "b"+ b.value);
	}
	private static class IntBox {
        int value;
        IntBox(int value) { this.value = value; }
    }

    private static void intercambiar(IntBox x, IntBox y) {
        int temp = x.value;
        x.value = y.value;
        y.value = temp;
    }
	//10)TABLA DE MULTIPLICAR
	private static void ejercicioTabla() {
		System.out.println("\n Ejercicio Tabla de multiplicar");
		int n= leerEntero("Ingrese un numero");
		generarTabla(n);
	}
	private static void generarTabla(int n) {
		for (int i=1; i<=10; i++) {
			System.out.println(n+("X")+i+"="+(n*i));
		}
	}
}
