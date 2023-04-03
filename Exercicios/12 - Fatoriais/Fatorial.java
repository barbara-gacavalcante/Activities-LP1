public class Fatorial {
    public static void main(String[] args) {
        for(int i = 10; i > 0; i--){
            int fat = 1;
            for(int j = 1; j <= i; j++){
                fat *= j;
            }
            System.out.printf("%nFatorial de %d é: %d", i, fat);
        }
    }
}
