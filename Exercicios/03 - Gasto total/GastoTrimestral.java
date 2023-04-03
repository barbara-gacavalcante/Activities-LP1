public class GastoTrimestral {
    public static void main(String[] args) {
        int jan = 15000;
        int feb = 23000;
        int mar = 17000;
        float despesaTrimestral;
        float mediaMensal;

        despesaTrimestral = jan + feb + mar;
        mediaMensal = despesaTrimestral / 3;

        System.out.println("Despesa total do trimestre: R$ " + despesaTrimestral + "\nMedia mensal de gastos: R$ " + mediaMensal);
    }
}
