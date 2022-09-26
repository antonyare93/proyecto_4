public class Main {
    public Main() {
    }

    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente(22, "Isaac", "1234567890", 10000.0);
        cliente.print_cliente();
        System.out.println("__________________________");
        Trabajador trabajador = new Trabajador(31, "Mateo", "2134567890", 5000.0);
        trabajador.print_trabajador();
    }
}

class Persona{
    int edad;
    String nombre;
    String telefono;
    
    public Persona(int edad, String nombre, String telefono) {
        this.edad = edad;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


}

class Cliente extends Persona{
    double credito;

    public Cliente(int edad, String nombre, String telefono, double credito) {
        super(edad, nombre, telefono);
        this.credito = credito;
    }

    public void print_cliente() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Crédito: " + this.credito);
    }
}

class Trabajador extends Persona{
    double salario;

    public Trabajador(int edad, String nombre, String telefono, double salario) {
        super(edad, nombre, telefono);
        this.salario = salario;
    }

    public void print_trabajador() {
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Telefono: " + this.telefono);
        System.out.println("Crédito: " + this.salario);
    }
}

