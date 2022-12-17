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
    private int Edad;
    private String Nombre;
    private int Telefono;



    // Crear gets y sets de cada propiedad.

    public void setEdad(int Edad){
        this.Edad = Edad;
    }

    public int getEdad(){
        return Edad;
    }


    public void setNombre(String Nombre){
        this.Nombre = Nombre;

    }

    public String getNombre(){
        return Nombre;
    }

    public void setTelefono(int Telefono){
        this.Telefono = Telefono;

    }
    public int getTelefono(){
        return Telefono;
    }




}