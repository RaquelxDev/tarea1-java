import java.util.Scanner;

public class Main {
    public static void HolaMundo() {
        System.out.println("¡Hola Mundo!");
    }

    public static void Suma(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Suma de dos numeors");
        System.out.println("Escriba el primer numero");
        int num1 = sc.nextInt();
        System.out.println("Escriba el segundo numero");
        int num2 = sc.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los dos numeros es de: " + suma);
    }
    public static void NumParImpar(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero para revisar si es par o impar");
        int num1 = sc.nextInt();
        if (num1 %2 == 0){
            System.out.println("El numero si es par");}
        else{
            System.out.println("El numero es impar");
        }
    }
    public static void Factorial(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero para calcular su factorial");
        int num1 = sc.nextInt();
        int factorial = 1;
        for (int i = 1; i <= num1; i++) {
            factorial *= i;
        }
        System.out.println("El factorial del numero ingresado "+num1+" es: " + factorial);
    }
    public static void TablaMultiplicar(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un numero para mostrar la tabla de multiplicacion");
        int num1 = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            int resultado = num1 * i;
            System.out.println(num1+" * "+ i + " = " + resultado);
        }
    }
    public static void Bonus(){
        Scanner sc = new Scanner(System.in);
        int numero,numMayor,numMenor;
        numMayor = 0;
        numMenor = Integer.MAX_VALUE;
        do {
            System.out.println("Escriba un numero entero positivo");
            numero = sc.nextInt();
            if (numero>0){
                if (numero > numMayor) {
                    numMayor=numero;
                } else if (numero<numMenor) {
                    numMenor=numero;
                }
            }
        }   while (numero >= 0);
        System.out.println("El numero Mayor es: "+numMayor);
        System.out.println("El numero Menor es: "+numMenor);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int option;
        do {
            System.out.println("-----------Menú-----------");
            System.out.println("1. Hola Mundo");
            System.out.println("2. Suma de dos números");
            System.out.println("3. Cálculo de numero par e impar");
            System.out.println("4. El Factorial de un número");
            System.out.println("5. La Tabla de multiplicar");
            System.out.println("6. Bonus (Numero mayor y Menor)");
            System.out.println("7. Salir");
            System.out.print("Escribe el numero de opcion que desea realizar: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    HolaMundo();
                    break;
                case 2:
                    Suma();
                    break;
                case 3:
                    NumParImpar();
                    break;
                case 4:
                    Factorial();
                    break;
                case 5:
                    TablaMultiplicar();
                    break;
                case 6:
                    Bonus();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intenta de nuevo.");
            }
        } while (option != 7);
        scanner.close();
    }
}






