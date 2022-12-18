//Herencia Y  encapsulamiento
class Main {
    public static void main(String[] args) {

        // Crea  objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito
        Cliente fulanito = new Cliente();
// tienes que darles valor
        fulanito.setEdad(30);
        fulanito.setNombre("Franco");
        fulanito.setTelefono(9458432);
        fulanito.setCredito(500);
        //  mostrarlas por pantalla.
        System.out.println(" Cliente ");
        System.out.println("  Nombre: " +fulanito.getNombre());
        System.out.println("  Edad: "+ fulanito.getEdad());
        System.out.println("  Nro. de Tel: "+fulanito.getTelefono());
        System.out.println("  Credito: $"+fulanito.getCredito());
        System.out.println("---------");
        // Crea  objeto de la clase Trabajador que debe tener como propiedades la edad, el telefono, el nombre y el Salario
        Trabajador tutano = new Trabajador();
// tienes que darles valor
        tutano.setEdad(40);
        tutano.setNombre("Jose");
        tutano.setTelefono(345646);
        tutano.setSalario(1000);
// mostrarlas por pantalla
        System.out.println(" Trabajador: ");
        System.out.println("  Nombre: "+tutano.getNombre());
        System.out.println("  Edad: "+tutano.getEdad());
        System.out.println("  Nro. de Tel: "+tutano.getTelefono());
        System.out.println("  Salario: $"+tutano.getSalario());
        System.out.println("");
        System.out.println("    --FIN--");
    }
}
//  Crea una clase Persona con las siguientes variables: La edad,El nombre,El teléfono

class Persona {
    // propiedades
    private int edad;
    private String nombre;
    private int telefono;
    // constructor
    public Persona (){
        System.out.println("");
        System.out.println("Estoy en el constructor De Persona");
        System.out.println("");

    }
    // funcion setter y getter

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad(){
        return this.edad;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setTelefono(int telefono){
        this.telefono = telefono;
    }
    public int getTelefono(){
        return this.telefono;
    }

}
// crea una nueva clase Cliente que herede de Persona que tendra propiedad credito solo para esta clase

class Cliente extends Persona{
    // propiedades de la clase

    private int credito;
    // constructor

    public Cliente(){
        System.out.println("Estas en el constructor de Cliente");
        System.out.println("");


    }
    // funciones setter y getter

    public void setCredito(int credito){
        this.credito = credito;
    }
    public int getCredito(){
        return this.credito;
    }

}
// crea una clase Trabajador que herede de Persona, y con una variable salario solo para esta clase

class Trabajador extends Persona {
    // propiedades de la clase

    private int salario;
    // constructor

    public Trabajador(){
        System.out.println("Estas en el constructor de Trabajador");
        System.out.println("");
    }

    // funciones getter y setter
    public void setSalario(int salario){
        this.salario = salario;

    }
    public int getSalario(){
        return this.salario;

    }



}