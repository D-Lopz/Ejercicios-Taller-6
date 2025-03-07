import java.util.Scanner;

public class excercise9 {
    public static void main(String[] args) {
        Scanner dL = new Scanner(System.in);

        int[] arr = new int[50];
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            sum += arr[i];
        }

        System.out.println("Los números del 1 al 50 sumados dan: " + sum);
    }
}
