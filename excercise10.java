import jdk.jshell.execution.JdiDefaultExecutionControl;

import java.util.Scanner;

public class excercise10 {
    public static void main(String[] args) {
        Scanner dL = new Scanner(System.in);


        String[] articles = {"Plancha", "Licuadora", "Lavadora", "Cocina"};
        double[] precio = new double[4];
        double total = 0;

        System.out.println("Ingrese el nombre del cliente: ");
        String user = dL.nextLine();

        for (int i = 0; i < articles.length; i++) {
            System.out.println("Ingrese el precio de " + articles[i]);
            precio[i] = dL.nextDouble();

            total += precio[i];
        }

        System.out.println("La factura del cliente: " + user);
        for (int i = 0; i < articles.length; i++) {
            System.out.println(articles[i] + ": $" + precio[i]);
        }

        if (total > 1200) {
            double discount = total * 0.17;
            double totalFinal = total - discount;

            System.out.println("Total: $" + total);
            System.out.println("Descuento: $" + discount);
            System.out.println("Total a pagar: $" + totalFinal);
        } else {

            System.out.println("Total a pagar: $" + total);
        }

        dL.close();

    }

}

