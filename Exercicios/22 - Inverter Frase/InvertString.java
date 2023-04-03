import java.lang.StringBuffer;
import java.util.Scanner;

public class InvertString {
    public static void main(String[] args) {

        String aux;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe uma frase de até 40 caracteres: ");
        aux = sc.next();
        StringBuffer frase = new StringBuffer(aux);

        System.out.println("\n\n" + frase);
        frase.reverse();
        System.out.println(frase);

        sc.close();
    }
}
