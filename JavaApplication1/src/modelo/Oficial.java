
package modelo;
public class Oficial extends Operario{
    public Oficial(){
    }
    public Oficial(String nom){
        super(nom);
    }
    @Override
    public String datos(){
        return "Empleado "+nom+" -> Oficial";   
    }
}
