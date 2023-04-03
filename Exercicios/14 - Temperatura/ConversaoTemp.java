import java.util.Scanner;

public class ConversaoTemp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float celsius, fahrenheit;
        int tp;

        do {
            System.out.println("Informe a temperatura em Celsius: ");
            celsius = in.nextFloat();

            fahrenheit = (9*celsius)/5 + 32;

            System.out.println("O equivalente em Fahrenheit: " + fahrenheit);
            
            System.out.println("Deseja parar? Press 0");
            tp = in.nextInt();

        } while (tp != 0);

        in.close();
    }
}
