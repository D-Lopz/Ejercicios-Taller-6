import java.util.Scanner;

public class excercise8 {
    public static void main(String[] args) {
        Scanner dL = new Scanner(System.in);
        int [] arr = new int[10];
        int positives = 0, negatives = 0, zeros = 0;
        
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Ingresa los numeros");
            arr[i] = dL.nextInt();

            if (arr[i] > 0) {
                positives++;

            } else if (arr[i] == 0) {
                zeros++;

            } else {
                negatives++;
            }
        }

        System.out.println("El arreglo tiene " + positives + " números positivos, " + negatives + " números negativos, y " + zeros + " ceros.");
        dL.close();
    }
}
