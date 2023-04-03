public class ManipulacaoDeString {
    public static void main(String[] args) {
        String nome = "Bárbara";
        String sobrenome = "Alves";
        String nomeCompleto = nome + " " + sobrenome;
        int tamanho;
        String primeiroNome;

        System.out.println(nome);
        
        System.out.println(nomeCompleto);
        
        tamanho = nomeCompleto.length();
        System.out.println(tamanho);

        primeiroNome = nomeCompleto.substring(0,7);
        System.out.println(primeiroNome);

    }
}
