
package Punto4;

public class PcMesa extends Caracteristica {
    private String descripcion;
    private String eslogan;
    public PcMesa(){
        
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
    
    public PcMesa(int code, int precio, String descripcion, String eslogan){
        super(code, precio);
        this.descripcion=descripcion;
        this.eslogan=eslogan;
    }
     @Override
    public String contenido(){
        System.out.println("Computador de Mesa");
        return("\nCodigo: "+this.code+"\nPrecio: "+this.precio+"\nDescripcion: "
                +this.descripcion+"\n"+this.eslogan+"\n");
        
    }
}
