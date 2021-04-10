
package Punto4;
public class Caracteristica {
    //Atributos
    protected int code;
    protected int precio;
    public Caracteristica(){
    }
    public Caracteristica(int code, int precio) {
        this.code = code;
        this.precio = precio;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
    public String contenido(){
        
        return("\nCodigo: "+this.code+"\nPrecio: "+this.precio);
        
    }
            
}
