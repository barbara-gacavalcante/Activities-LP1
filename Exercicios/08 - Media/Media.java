import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        int nota1, nota2, n;
        float media;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite a primeira nota: ");
            nota1 = sc.nextInt();
            System.out.println("Digite a segunda nota:");
            nota2 = sc.nextInt();

            media = (float) (nota1 + nota2) / 2;
            System.out.println("A média do aluno é: " + media);
            
            System.out.println("Deseja sair? Press 0");
            n = sc.nextInt();
        } while (n != 0);

        sc.close();
    }
}
