import java.util.Scanner;

public class excercise5 {
    public static void main(String[] args) {

        Scanner dL = new Scanner(System.in);

        System.out.println("Dia de la semana");
        String dia = dL.next();

        String semana = "";
        switch (dia.toLowerCase().trim()) {

            case "lunes":
                semana = "Laboral";
                break;

            case "martes":
                semana = "Laboral";
                break;

            case "miercoles":
                semana = "Laboral";
                break;

            case "jueves":
                semana = "Laboral";
                break;

            case "viernes":
                semana = "Laboral";
                break;

            case "sabado":
                semana = "No laboral";
                break;

            case "domingo":
                semana = "No laboral";
                break;

            default:
                System.out.printf("Opcion incorrecta");
        }
        System.out.println(semana);
        dL.close();
    }
}
