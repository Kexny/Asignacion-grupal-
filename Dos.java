// Integrantes: Kelvin Li, Enrique Wen, Keny Tang, Roberto Luo
import java.util.Arrays;
import java.util.Scanner;
public class Dos {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        double mayor=0, menor=999999999, promedio=0;
        //try de por si el usuario introduce un valor que genera error
        try{
        //Se le pide al usuario la cantidad de numeros que quiere introducir
            System.out.println("Introduzca la cantidad de numeros que desea introducir");
            int cant = scan.nextInt();
            //Se declara un arreglo, en donde el tamaño de dicho es introducido por el usuario
            double a[] = new double[cant];
            //Bucle para introducir los valores y buscar el mayor, menor y promedio
            for(int x =0; x<cant ; x++){
                System.out.println("Introduzca un valor");
                a[x]=scan.nextDouble();
                //Condicion por si el valor es mayor al de la variable mayor
                if(a[x]>mayor){
                    mayor = a[x];
                }
                //Condicion por si el valor es menor al de la variable menor
                if(a[x]<menor){
                    menor = a[x];
                }
                //Se suman los valores a la variable promedio
                promedio = promedio+a[x];
            }
            //Se divide la variable promedio con la cantidad de los numeros introducidos
            promedio = promedio/cant;
            //Se imprime los valores introdicods, el mayor, menor y el promedio
            System.out.println("Usted introdujo los siguientes numeros");
            System.out.println(Arrays.toString(a));
            System.out.println("Numero mayor: " + mayor);
            System.out.println("Numero menor: " + menor);
            System.out.println("Promedio de los "+cant +" numeros es "+ promedio);
        }
        //catch de por si el usuario introduce un valor que 
        catch(Exception e){
            System.out.println("Valor invalido");
        }
        scan.close();
    }
}
