
public class ArrayMeses {
    public static void main(String[] args) {
        String[] meses = new String[] {"janeiro", "fevereiro", "mar�o", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int op;

        op = (int) (Math.random() * 12);

        System.out.println("Numero aleatorio: " + op);

        System.out.printf("%nO m�s correspondente ao n�mero %d � %s;", op, meses[op]);
    }
}
