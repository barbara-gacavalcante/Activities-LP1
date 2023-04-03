import java.util.Scanner;
import java.lang.String;

public class StringManipulation {
    public static void main(String[] args) {
        String nomeCompleto;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome completo: ");
        nomeCompleto = sc.next();

        System.out.println("Tamanho da string: " + nomeCompleto.length());
        System.out.println("Primeira letra da string: " + nomeCompleto.charAt(0));
        System.out.println("Sobrenome: " + nomeCompleto.substring(7, nomeCompleto.length()));
        System.out.println("Maiúsculas: " + nomeCompleto.toUpperCase());
        System.out.println("Minúsculas: " + nomeCompleto.toLowerCase());

        sc.close();
    }
}
