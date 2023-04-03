import java.util.Scanner;

public class SomaElementosUsuario {
    public static void main(String[] args) {
        int[] a = new int[7];
        int soma = 0;

        Scanner sc = new Scanner(System.in);

        for(int i = 0; i < a.length; i++) {
            System.out.printf("Informe o elemento da posição %d:", i+1);
            a[i] = sc.nextInt();
            soma += a[i];
        }

        System.out.println("Resultado da soma: " + soma);

        sc.close();
    }
}
