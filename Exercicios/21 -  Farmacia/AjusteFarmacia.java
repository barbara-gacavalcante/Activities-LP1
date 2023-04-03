import java.util.Scanner;

public class AjusteFarmacia {
    public static void main(String[] args) {
        float[] values = new float[100];
        int op, i = 0;
        float valor;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe o valor do produto: ");
            valor = sc.nextFloat();
            i++;

            values[i] = (float) (valor * 1.12);

            System.out.println("Novo valor: ");
            System.out.println(values[i] + " = " + Math.round(values[i]));
            
            System.out.println("Deseja sair? Press 0");
            op = sc.nextInt();
        } while (op != 0);

        sc.close();
    }
}
