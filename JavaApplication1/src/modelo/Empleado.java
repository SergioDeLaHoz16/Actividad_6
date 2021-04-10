package modelo;
public class Empleado {
    protected String nom;
    public Empleado(){
    }
    public Empleado(String nom) {
        this.nom = nom;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String  datos(){ //datos = toString
        return "Empleado "+nom ;
    }
}


