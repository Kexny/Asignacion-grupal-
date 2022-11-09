//  ********** Integrantes ********** //
//Kevin Li, Enrique Wen, Kenny Tang, Roberto Luo
//  ********** Problema 5 ********** //

import java.util.Scanner;

public class problem5 {
    public static void main(String[] args) {
        Scanner figura = new Scanner(System.in);

        // declaracion de variable
        Double a, b, c, d, perimetro, area;
        int respuesta = 1, op;
        // fin declaracion

        // respuesta = 1 porque si el usuario al ingresar un numero diferente se cierra
        while (respuesta == 1) {
            try {
                System.out.println(
                        "Seleccione la figura a calcular 1. Cuadrilátero 2.	Triangulo 3.	Trapecio 4.	Circulo");
                op = Integer.parseInt(figura.nextLine());

                switch (op) {
                    case 1:
                        System.out.println("Calculando el Cuadrilatero");

                        System.out.println("Ingrese valor para lado A: ");
                        a = figura.nextDouble();
                        System.out.println("Ingrese valor para lado B: ");
                        b = figura.nextDouble();

                        // declaracion de condicionales
                        if (a == b) {
                            System.out.println("Es un cuadrado");
                        } else {
                            System.out.println("Es un rectangulo");
                        }
                        // fin de condicionales

                        // operacion
                        perimetro = (a + b) * 2;
                        area = a * a;
                        // fin operacion

                        System.out.println("El Perimetro del cuadrilatero es: " + perimetro);
                        System.out.println("El Area del cuadrilatero es: " + area);

                        System.out.print("Desea continuar? \n");
                        System.out.println("1 para continuar o cualquier numero para salir");
                        respuesta = figura.nextInt();
                        break; // fin de case 1

                    case 2:
                        System.out.println("Calculando el Triangulo \n");

                        System.out.println("Ingrese valor para A: ");
                        a = figura.nextDouble();
                        System.out.println("Ingrese valor para B: ");
                        b = figura.nextDouble();
                        System.out.println("Ingrese valor para C: ");
                        c = figura.nextDouble();

                        // operacion
                        perimetro = a + b + c;
                        area = perimetro / 2;
                        // fin de operacion

                        System.out.println("El Perimetro del Triangulo es: " + perimetro);
                        System.out.println("El Area del Triangulo es: " + area);

                        System.out.print("Desea continuar? \n");
                        System.out.println("1 para continuar o cualquier numero para salir");
                        respuesta = figura.nextInt();

                        break; // fin del case 2

                    case 3:
                        System.out.println("Calculando el Trapecio \n");

                        System.out.println("Ingrese valor para Altura: ");
                        a = figura.nextDouble();
                        System.out.println("Ingrese valor para Base superior: ");
                        b = figura.nextDouble();
                        System.out.println("Ingrese valor para Base inferior: ");
                        c = figura.nextDouble();
                        System.out.println("Ingrese valor para D: ");
                        d = figura.nextDouble();

                        // operacion
                        perimetro = a + b + c + d;
                        area = (b * c) * a / 2;
                        // fin de operacion

                        System.out.println("El Perimetro del Trapecio es: " + perimetro);
                        System.out.println("El Area del Trapecio es: " + area);

                        System.out.print("Desea continuar? \n");
                        System.out.println("1 para continuar o cualquier numero para salir");
                        respuesta = figura.nextInt();

                        break; // fin del case 3

                    case 4:
                        System.out.println("Calculando el Circulo \n");

                        System.out.println("Introduzca valor para radio: ");
                        a = figura.nextDouble();

                        // operacion
                        perimetro = 2 * Math.PI * a;
                        area = Math.PI * Math.pow(a, 2);
                        // fin de operacion

                        System.out.println("El Perimetro del circulo es: " + perimetro);
                        System.out.println("El Area del circulo es: " + area);

                        System.out.print("Desea continuar? \n");
                        System.out.println("1 para continuar o cualquier numero para salir");
                        respuesta = figura.nextInt();

                        break; // fin del case 4
                    default:
                        System.out.println("Opcion Invalida");
                        break;
                } // fin de switch
            } // fin de try

            catch (Exception e) {
                System.out.print("Hubo un error intentate nuevamente \n");
            } // fin del catch
        } // fin del while
        figura.close(); // fin de Scanner
    }
}
