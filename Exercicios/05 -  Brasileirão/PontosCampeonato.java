import java.util.Scanner;

public class PontosCampeonato {
    public static void main(String[] args) {
        int leaderPoints;
        int flashlightPoints;
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de pontos do time Líder: ");
        leaderPoints = sc.nextInt();
        System.out.println("Informe a quantidade de pontos do time lanterna: ");
        flashlightPoints = sc.nextInt();

        int victories = (leaderPoints - flashlightPoints)/3;

        System.out.println("Para que o time lanterna alcance ou ultrapasse o líder, serão precisas " + victories + " vitórias.");

        sc.close();
    }
}
