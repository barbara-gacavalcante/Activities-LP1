import java.io.*;

public class Desconto {
    public static void main(String[] args) throws IOException {
        String s;
        double total, desc; 
        BufferedReader dado;

        System.out.println("Informe o valor do produto: ");
        dado = new BufferedReader (new InputStreamReader(System.in));
        s = dado.readLine();
        double valor = Double.parseDouble(s);

        System.out.println("Informe a porcentagem do desconto: ");
        dado = new BufferedReader (new InputStreamReader(System.in));
        s = dado.readLine();
        double desconto = Double.parseDouble(s);

        desc = valor*desconto/100;
        total = valor-desc;

        System.out.println("O valor do desconto: R$ " + desc + "\nO valor do produto com o desconto: R$ " + total);
    }
}
