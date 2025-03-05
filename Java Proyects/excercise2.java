import java.util.Scanner;

public class excercise2 {
    public static void main(String[] args) {

        Scanner dL = new Scanner(System.in);

        System.out.println("Numero del 1 al 7: ");
        int dia = dL.nextInt();

        String semana = "";
        switch (dia) {

            case 1:
                semana = "Monday";
                break;

            case 2:
                semana = "Tuesday";
                break;

            case 3:
                semana = "Wednesday";
                break;

            case 4:
                semana = "Thursday";
                break;

            case 5:
                semana = "Friday";
                break;

            case 6:
                semana = "Saturday";
                break;

            case 7:
                semana = "Sunday";
                break;
            default:
                System.out.printf("Opcion incorrecta");
        }
        System.out.println(semana);
    dL.close();
    }
}
