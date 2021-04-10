
package Punto4;
public class Portatil extends Caracteristica{
    private int peso;
    private String eslogan;
    public Portatil(){
        
    }
    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public String getEslogan() {
        return eslogan;
    }

    public void setEslogan(String eslogan) {
        this.eslogan = eslogan;
    }
    
    public Portatil(int code, int precio, int peso, String eslogan){
        super(code, precio);
        this.peso=peso;
        this.eslogan=eslogan;
        
    }
    @Override
    public String contenido(){
        System.out.println("\nPortatil");
        return("\nCodigo: "+this.code+"\nPrecio: "+this.precio+"\nPeso Portatil:"
                +this.peso+"\n"+this.eslogan+"\n");
        
    }
}
