package org.example;

import org.example.models.Calculadora;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Elija una opcion:");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicacion");
            System.out.println("4. Division");
            System.out.println("5. Salir");
            System.out.print("Ingrese su opcion: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Error: Debe ingresar un numero entre 1 y 5.");
                scanner.next();
                continue;
            }

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Escoja el primer numero: ");
                    int num1 = scanner.nextInt();
                    System.out.print("Escoja el segundo numero: ");
                    int num2 = scanner.nextInt();
                    int resultadoSuma = Calculadora.sumar(num1, num2);
                    System.out.println("El resultado es: " + resultadoSuma);
                    break;

                case 2:
                    System.out.print("Escoja el primer numero: ");
                    int num3 = scanner.nextInt();
                    System.out.print("Escoja el segundo numero: ");
                    int num4 = scanner.nextInt();
                    int resultadoResta = Calculadora.restar(num3, num4);
                    System.out.println("El resultado es: " + resultadoResta);
                    break;

                case 3:
                    System.out.print("Escoja el primer numero: ");
                    int num5 = scanner.nextInt();
                    System.out.print("Escoja el segundo numero: ");
                    int num6 = scanner.nextInt();
                    int resultadoMultiplicacion = Calculadora.multiplicar(num5, num6);
                    System.out.println("El resultado es: " + resultadoMultiplicacion);
                    break;

                case 4:
                    System.out.print("Escoja el primer numero: ");
                    int num7 = scanner.nextInt();
                    System.out.print("Escoja el segundo numero: ");
                    int num8 = scanner.nextInt();
                    if (num8 != 0) {
                        double resultadoDivision = Calculadora.dividir(num7, num8);
                        System.out.println("El resultado es: " + resultadoDivision);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                case 5:
                    salir = true;
                    System.out.println("Saliendo de la calculadora...");
                    break;

                default:
                    System.out.println("Opcion no valida. Por favor elija una opcion entre 1 y 5.");
                    break;
            }
        } while (!salir);

        scanner.close();
    }
}
