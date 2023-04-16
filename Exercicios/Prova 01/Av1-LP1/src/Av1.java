/* Bárbara Geovanna Alves Cavalcante - nº matrícula: 20220055021
 * Samuel da Silva Ferreira - nº matrícula: 20220054946
 */

import java.util.Arrays;
import java.util.Scanner;

public class Av1 {

    private static final int N = 5;
    private static final Scanner sc = new Scanner(System.in);
    private static final Av1[] pessoa = new Av1[N];
    private String firstName;
    private String lastName;
    private String name;
    private int age;
    private float IMC;
    private float height;
    private float weight;

    public static void main(String[] args) throws Exception {
        showUI();
    }

    public static int showUI() {
        int op = 0;
        boolean flag = false;
        try{
            do {
                System.out.println("Digite uma das opções: ");
                System.out.println("1 - Cadastrar \n2 - Listar pessoas \n3 - Análise da média dos dados \n4 - Valores IMC \n5 - Valores das idades \n6 - Valores das alturas \n7- Dados da pessoa \n8 - Sair ");
                op = sc.nextInt();
        
                switch (op) {
                    case 1: 
                    if (flag == false)  {
                        flag = true;
                        cadastrar();
                    }
                    else System.out.println("Você já cadastrou uma vez!!");
                    showUI();
                    break;
                    case 2:
                    listar(pessoa);
                    showUI();
                    break;
                    case 3:
                    analisar(pessoa);
                    showUI();
                    break;
                    case 4:
                    IMC(pessoa);
                    showUI();
                    break;
                    case 5:
                    idades(pessoa);
                    showUI();
                    break;
                    case 6:
                    alturas(pessoa);
                    showUI();
                    break;
                    case 7:
                    dados(pessoa);
                    showUI();
                    break;
                    default:
                        System.out.println("Finalizando o programa");
                }
            } while (op != 8 && (op < 1 || op > 8));
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        return op;
        
    }


    public static void cadastrar() {
        String a;
        int b;
        float c;
        String firstName1 = new String();
        String lastName1 = new String();
        String name1 = new String();
        int age1 = 0;
        float IMC1 = 0;
        float height1 = 0;
        float weight1 = 0;
        try {
            for (int i = 0; i < N; i++) {
                System.out.println("Digite seu primeiro nome: ");
                firstName1 = sc.next();
                System.out.println("Digite seu sobrenome:");
                lastName1 = sc.next();
                do {
                    System.out.println("Digite sua idade: ");
                    age1 = sc.nextInt();
                } while (age1 < 16);
                System.out.println("Digite seu peso:");
                weight1 = sc.nextFloat();
                System.out.println("Digite seu altura (com vírgula):");
                height1 = sc.nextFloat();
                IMC1 = calculateIMC(weight1, height1);
                name1 = firstName1 + " " + lastName1;
                pessoa[i] = new Av1(firstName1, lastName1, name1, age1, IMC1, weight1, height1);
                System.out.println("============================================");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static void listar(Av1[] pessoa) {
        if(checkIfValid(pessoa) == false) {
            return;
        }
        for (int i = 0; i < N; i++) {
            System.out.println("Nome sobrenome: "+ pessoa[i].name + "\nIdade: " + pessoa[i].age + "\nPeso: " + pessoa[i].weight + "\nAltura: " + pessoa[i].height);
            System.out.println("========================================================================");
        }
    }

    public static void analisar(Av1[] pessoa) {
        if (checkIfValid(pessoa) == false) {
            return;
        }
        int totalAge = 0;
        float totalWeight = 0;
        float totalHeight = 0;
        float totalIMC = 0;
        for (int i = 0; i < N; i++) {
            totalAge += pessoa[i].age;
            totalWeight += pessoa[i].weight;
            totalHeight += pessoa[i].height;
            totalIMC += pessoa[i].IMC;
        }
        System.out.println("A média das idades é: " + (totalAge/N));
        System.out.println("A média dos pesos é: " + (totalWeight/N));
        System.out.println("A média das alturas é: " + (totalHeight/N));
        System.out.println("A média do IMC é: " + (totalIMC/N));
    }


    public static float calculateIMC(float weight, float height) {
        float IMC = 0;
        IMC = weight / (float) Math.pow(height, 2);
        return IMC;
    }

    public static void IMC(Av1[] pessoa) {
        if (checkIfValid(pessoa) == false) {
            return;
        }
        for (int i = 0; i < N; i++) {
            System.out.println(pessoa[i].name + " tem o IMC: " + pessoa[i].IMC);
            if(pessoa[i].IMC <= 18.5){
                System.out.println("Está abaixo do peso.");
            } else if (pessoa[i].IMC >= 18.6 && pessoa[i].IMC <= 24.9){
                System.out.println("Peso ideal (parabéns).");
            } else if (pessoa[i].IMC >= 25.0 && pessoa[i].IMC <= 29.9){
                System.out.println("Levemente acima do peso.");
            } else if (pessoa[i].IMC >= 30.0 && pessoa[i].IMC <= 34.9){
                System.out.println("Obesidade grau 1.");
            } else if (pessoa[i].IMC >= 35.0 && pessoa[i].IMC <= 39.9){
                System.out.println("Obesidade grau 2 (severa).");
            } else if (pessoa[i].IMC >= 40.0){
                System.out.println("Obesidade grau 3 (mórbida).");
            }
        }
    }

    public static void idades(Av1[] pessoa) {
        if (checkIfValid(pessoa) == false) {
            return;
        }
        String oldest = new String();
        String youngest =  new String();
        int oldestAge = 0;
        int youngestAge = 2147483647;
        for (int i = 0; i < N; i++) {
            System.out.println(pessoa[i].name + " tem " + pessoa[i].age + " anos.");
            if (oldestAge < pessoa[i].age) {
                oldestAge = pessoa[i].age;
                oldest = pessoa[i].name;
            }
            if (youngestAge > pessoa[i].age) {
                youngestAge = pessoa[i].age;
                youngest = pessoa[i].name;
            }
        }

        System.out.println("A pessoa mais velha é " + oldest + " com " + oldestAge + " anos");
        
        System.out.println("A pessoa mais jovem é " + youngest + " com " + youngestAge + " anos");
    }

    public static void alturas(Av1[] pessoa) {
        if (checkIfValid(pessoa) == false) {
            return;
        }

        float[] allHeight = new float[N];
        for ( int i = 0; i < N; i++) {
            allHeight[i] = pessoa[i].height;
        }

        Arrays.sort(allHeight);

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (allHeight[i] == pessoa[j].height) {
                    System.out.println(pessoa[j].name + ": " + pessoa[j].height + "m");
                }
            }
        }

        String tallest = new String();
        String smallest =  new String();
        float tallestHeight = 0;
        float smallestHeight = 2147483647;
        for (int i = 0; i < N; i++) {
            System.out.println(pessoa[i].name + " tem " + pessoa[i].height + "m de altura.");
            if (tallestHeight < pessoa[i].height) {
                tallestHeight = pessoa[i].height;
                tallest = pessoa[i].name;
            }
            if (smallestHeight > pessoa[i].height) {
                smallestHeight = pessoa[i].height;
                smallest = pessoa[i].name;
            }
        }

        System.out.println("A pessoa mais alta é " + tallest + " com " + tallestHeight + "m de altura.");
        
        System.out.println("A pessoa mais baixa é " + smallest + " com " + smallestHeight + "m de altura.");
    }

    public static void dados(Av1[] pessoa) {
        if (checkIfValid(pessoa) == false) {
            return;
        }

        String sobrenome = new String();
        System.out.println("Digite o sobrenome a ser pesquisado: ");
        sobrenome = sc.next();
        boolean check = false;

        for (int i = 0; i < N; i++) {
            System.out.println(pessoa[i].lastName);
            if (sobrenome.equals(pessoa[i].lastName)) {
                System.out.println("Nome sobrenome: "+ pessoa[i].name + "\nIdade: " + pessoa[i].age + "\nPeso: " + pessoa[i].weight + "\nAltura: " + pessoa[i].height + "\nIMC e classificação: " + pessoa[i].IMC + ", " + showIMC(pessoa[i].IMC));
                System.out.println("========================================================================");
                check = true;
            }            
        }

        if (check == false){
            System.out.println("Não há ninguém com esse sobrenome.");
        }
    }

    public static String showIMC(float IMC) {
        if(IMC <= 18.5){
            return ("Está abaixo do peso.");
        } else if (IMC >= 18.6 && IMC <= 24.9){
            return ("Peso ideal (parabéns).");
        } else if (IMC >= 25.0 && IMC <= 29.9){
            return ("Levemente acima do peso.");
        } else if (IMC >= 30.0 && IMC <= 34.9){
            return ("Obesidade grau 1.");
        } else if (IMC >= 35.0 && IMC <= 39.9){
            return ("Obesidade grau 2 (severa).");
        } else if (IMC >= 40.0){
            return ("Obesidade grau 3 (mórbida).");
        }
        return "";
    }

    public static boolean checkIfValid(Av1[] pessoa) {
        if (pessoa[0].name == null) {
            System.out.println("Não há pessoas cadastradas!!");
            return false;
        }
        return true;
    }

    public Av1(String firstName, String lastName, String name, int age, float IMC, float weight, float height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.name = name;
        this.age = age;
        this.IMC = IMC;
        this.height = height;
        this.weight = weight;
    }
}
