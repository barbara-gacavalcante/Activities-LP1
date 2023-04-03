public class Dado {
    public static void main(String[] args) {
        int[] dado = new int[3];
        int soma = 0;

        for(int i = 0; i < dado.length; i++){
            dado[i] = (int) (1 + (Math.random() * 6));
            System.out.println(dado[i]);
            soma += dado[i];
        }

        System.out.println("Resultado: " + soma);
    }
}
