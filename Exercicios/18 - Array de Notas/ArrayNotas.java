import javax.swing.JOptionPane;
import java.util.Arrays;

public class ArrayNotas {
    public static void main(String[] args) {
        float[] notas = new float[5];
        String aux;
        float soma = 0, media = 0;

        for (int i = 0; i < 5; i++){
            aux = JOptionPane.showInputDialog("Informe a " + (i+1) + "ª nota: ");
            notas[i] = Float.parseFloat(aux);
            soma += notas[i];
        }

        Arrays.sort(notas);
        System.out.println("Notas em ordem crescente: {");
        for (int i = 0; i < 5; i++){
            System.out.println(notas[i]+" ");
        }
        System.out.println("}");

        media = soma/5;

        System.out.println("A média aritmética de todas as notas é: " + media);

    }
}
