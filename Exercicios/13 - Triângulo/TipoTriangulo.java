import java.util.Scanner;

public class TipoTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int A, B, C;

        System.out.println("Informe a medida do lado: ");
        A = sc.nextInt();
        System.out.println("Informe a medida do lado: ");
        B = sc.nextInt();
        System.out.println("Informe a medida do lado: ");
        C = sc.nextInt();

        if((A < (B + C)) && (A > (B - C))){
            if(A == B && B == C){
                System.out.println("� um tri�ngulo equil�tero.");
            } else  if (A == B || B == C || A == C){
                System.out.println("� um tri�ngulo is�sceles.");
            } else {
                System.out.println("� um tri�ngulo escaleno.");
            }
        } else{
            System.out.println("N�o � um tri�ngulo.");
        }

        
        sc.close();
    }
}
