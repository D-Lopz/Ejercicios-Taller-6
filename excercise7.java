import java.util.Scanner;

public class excercise7 {
    public static void main(String[] args) {
        int [] arr = new int[5];

        Scanner dL = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print("Ingresa un número para la posición " + i + ": ");
            arr[i] = dL.nextInt();
        }

        System.out.println("Indice y valores");
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Indice: " + i + ", numero: " + arr[i]);
        }
        dL.close();
    }
}
