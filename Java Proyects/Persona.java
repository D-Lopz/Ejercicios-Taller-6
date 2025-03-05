public class Persona {
     
    //Atributos
    public String nombre;
    private String apellido;
    public int edad;
    //metodos
    public void inicializar (
        String nombreParametro,
        String apellidoParametro,
        int edadParametro
    ) {
        this.nombre= nombreParametro;
        this.apellido=apellidoParametro;
        this.edad= edadParametro;
    }

    public void write(){

        System.out.println("Nombre: " + nombre + ", Apellido: " + apellido + ", y su edad es: " + edad);
    }

    public void esMayor(){
        if (edad >= 18) {
            System.out.println("Nombre: " + nombre + " es mayor de edad, tiene: " + edad + ".");
            
        }else{
            System.out.println("Nombre: " + nombre + " NO es mayor de edad, tiene: " + edad + ".");

        }
    }

}
