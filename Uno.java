// Integrantes : Kevin Li, Keny Tang, Enrique Wen, Roberto Luo
import java.util.Scanner;
public class Uno {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        //Se le pide al usuario el caracter
        System.out.println("Ingrese un caracter");
        //El caracter es introducido como String para la siguiente operacion
        String x = scan.nextLine();
        //Se revisa si el usuario introdujo 1 caracter como lo requerido
        if(x.length()==1){
            //El String es convertido en valor ascii
            int ascii = x.charAt(0);
            //If para revisar si el codigo ascii esta entre los numeros
            if(ascii>=48 && ascii<=57){
                System.out.println("USTED HA INGRESADO UN NUMERO");
            }
            //If para revisar si el codigo ascii esta entre las letras mayusculas
            else if(ascii>=65 && ascii<= 90){
                System.out.println("USTED HA INGRESADO UNA LETRA MAYUSCULA");
            }
            //If para revisar si el codigo ascii esta entre las letras minusculas
            else if(ascii>=97 && ascii<=122){
                System.out.println("USTED HA INGRESADO UNA LETRA MINUSCULA");
            }
            //Si el codigo ascii no esta dentro de ninguno de los 3 If, esta condicion se ejecuta
            else{
            System.out.println("VALOR NO RECONOCIDO");
            }
            //Se cierra el scanner
        scan.close();
        }
        //Else por si el String al inicio no era de 1 caracter o digito
        else{
            System.out.println("El valor del caracter debe contener solo 1 digito");
        }
    }
}