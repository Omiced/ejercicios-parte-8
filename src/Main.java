public class Main {
    public static void main(String[] args) {
        Persona pipol = new Persona();
        pipol.setEdad(28);
        pipol.setNumeroTel(55202212);
        pipol.setNombre("Josue");

        System.out.println(pipol.getEdad());
        System.out.println(pipol.getNumeroTel());
        System.out.println(pipol.getNombre());
    }
}

class Persona {
    private int edad;
    private int numeroTel;
    private String nombre;

    //sets
    public void setEdad(int edad){
        this.edad = edad;
    }

    public void setNumeroTel(int numeroTel){
        this.numeroTel = numeroTel;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    //gets

    public int getEdad() {
        return edad;
    }

    public int getNumeroTel() {
        return numeroTel;
    }

    public String getNombre() {
        return nombre;
    }
}