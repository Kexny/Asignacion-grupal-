// Integrantes : Kevin Li, Keny Tang, Enrique Wen, Roberto Luo
import java.util.Scanner;
public class Tres {
    public static void main(String[] args){
        int top=0, n1=0, n2=1, res;
        Scanner scan = new Scanner(System.in);
        //Try porque si el usuario introduce un valor que no es numero
        try{
            //Le pedimos el tope superior al usuario
            System.out.println("Introduzca un valor");
            top = scan.nextInt();
           System.out.println("Los numeros de Fibonacci son");
           //Se imprime los 2 primeros numeros de Fibonacci
           System.out.println(n1);
           System.out.println(n2);
           //Se le quita 2 al tope introducido al usuario, ya que se imprimio 2 de los numeros
           top = top -2;
           for(int x = 0; x<top; x++){
            //Se imprime el valor de Fibonacci que es numero 1 + numero 2 = resultado
              System.out.println( res= n1 + n2);
              // el numero 1 se convierte en el numero 2, segun la formula
              n1 = n2;
              // el numero 2 se convierte el resultado del calculo anterior, segun la formula
              n2 = res;
           }
           // Se cierra el scanner
        scan.close();
        }
        //Catch por si el usuario introduce un valor que no es numero
        catch(Exception e){
            System.out.println("No es un numero");
        }
    }
}