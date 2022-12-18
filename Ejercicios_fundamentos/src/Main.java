// Para practicar la encapsulación:
class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        // Crear un objeto persona en el main.
        Persona cristian = new Persona();
        // Utiliza los gets y sets para darle valores a las propiedades edad, nombre
        cristian.setEdad(27);
        cristian.setNombre("Cristian");
        cristian.setTelefono(32345445);
        // telefono, por último muéstralas por consola.
        System.out.println(cristian.getEdad());
        System.out.println(cristian.getNombre());
        System.out.println(cristian.getTelefono());


    }
}
//  Crear clase Persona.
class Persona{
    // Crear variables las privadas edad, nombre y telefono
    private int edad;
    private String nombre;
    private int telefono;



    // Crear gets y sets de cada propiedad.
// el nombre de la funcion getter y setter debe ser con get y primera letra con Mayuscula de la propiedad  ej edad setEdad(){}
    public void setEdad(int edad){
        this.edad = edad;
    }

    public int getEdad(){
        return edad;
    }


    public void setNombre(String nombre){
        this.nombre = nombre;

    }

    public String getNombre(){
        return nombre;
    }

    public void setTelefono(int telefono){
        this.telefono = telefono;

    }
    public int getTelefono(){
        return telefono;
    }




}