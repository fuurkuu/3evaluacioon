package encapsulacion;

public class ManejaEncapsulacion {
    public static void main(String[] args) {
 
        Encapsulacion persona1 = new Encapsulacion("Juan", 30, 'M');

        System.out.println("Nombre: " + persona1.getNombre());
        System.out.println("Edad: " + persona1.getEdad());
        System.out.println("Género: " + persona1.getGenero());

        persona1.setEdad(31);

        persona1.imprimirDetalles();
    }
}
