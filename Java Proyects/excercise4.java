import java.util.Scanner;

public class excercise4 {
    public static void main(String[] args) {

        Scanner dL = new Scanner(System.in);

        System.out.println("Numero: ");
        int n = dL.nextInt();

        int acumulator = 0;

        for (int i = 0; i <= n; i++) {
            acumulator += i;
        }



        System.out.printf("" +  acumulator);
    }
}
