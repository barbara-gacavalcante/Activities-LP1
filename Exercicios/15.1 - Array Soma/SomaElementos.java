public class SomaElementos {
    public static void main(String[] args) {
        int[] a = new int[] {10, 23, 45, 60, 5, 8, 23};
        int soma = 0;

        for(int i = 0; i < a.length; i++) {
            soma += a[i];
        }

        System.out.println("Resultado da soma: " + soma);
    }
}
