
public class ArrayMeses {
    public static void main(String[] args) {
        String[] meses = new String[] {"janeiro", "fevereiro", "março", "abril", "maio", "junho", "julho", "agosto", "setembro", "outubro", "novembro", "dezembro"};
        int op;

        op = (int) (Math.random() * 12);

        System.out.println("Numero aleatorio: " + op);

        System.out.printf("%nO mês correspondente ao número %d é %s;", op, meses[op]);
    }
}
