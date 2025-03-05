import java.util.Scanner;

public class excercise6 {
    public static void main(String[] args) {

        Scanner dL = new Scanner(System.in);

        System.out.println("Numero: ");
        int n = dL.nextInt();

        System.out.println("Exponente: ");
        int e = dL.nextInt();
        int p = 1/-e;
        double result = 0.0;

        if (n > 0) {
            result = Math.pow(n, e);

        } else if (n == 0) {
            result = Math.pow(n, 1);

        } else {
            result = Math.pow(n, p);
        }

        System.out.println("El resultado es: " + result);
    }
}
