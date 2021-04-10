package modelo;
public class Tecnico extends Operario{
    public Tecnico(){
    }
    public Tecnico(String nom){
        super( nom );
    }
    @Override
    public String datos(){
      return "Empleado "+nom+" -> Tecnico";
    }
}
