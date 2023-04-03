import java.util.Scanner;

public class MediaFor {
    public static void main(String[] args) {
        int nota1, nota2, n;
        float media;

        Scanner input = new Scanner (System.in);

        for (n = 1; n < 2; n++){
            System.out.println("Digite a primeira nota: ");
            nota1 = input.nextInt();
            System.out.println("Digite a segunda nota:");
            nota2 = input.nextInt();

            media = (float) (nota1+nota2)/2;

            System.out.println("A média do aluno é: " + media);
            
            input.close();
        }


    }
}