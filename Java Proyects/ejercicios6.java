import java.util.Scanner;

public class ejercicios6 {

    public static void main(String[] args) {
    Scanner dL = new Scanner(System.in);

        double iva = 0.21;

        System.out.println("Precio del producto: ");
        double precio = dL.nextDouble();

    double  precioIva = (precio * iva);
    double precioTotal = precioIva + precio;
    System.out.println("El precio  con iva es de: " + precioTotal);

    dL.close();
    }
}
