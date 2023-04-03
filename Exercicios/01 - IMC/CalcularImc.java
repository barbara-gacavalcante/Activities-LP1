import java.util.Scanner;

public class CalcularImc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float peso, altura;
        float imc;
        
        System.out.println("Informe o peso: ");
        peso = sc.nextFloat();
        
        System.out.println("Informe a altura: ");
        altura = sc.nextFloat();
        
        imc = peso / (altura * altura);
        
        System.out.println("O IMC é: " + imc);

        sc.close();
    }

}