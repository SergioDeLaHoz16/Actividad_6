
package empresa;
import modelo. *;
public class Empresa {
    public static void main(String[] args) {
        Empleado e1 = new Empleado("Rafa");
        System.out.println(e1.datos());
        Directivo D1 = new Directivo("Mario"); 
        System.out.println(D1.datos());
        Operario op1 = new Operario("Alfonso");
        System.out.println(op1.datos());
        Oficial of1 = new Oficial("Luis");
        System.out.println(of1.datos());
        Tecnico tec1 = new Tecnico("Pablo");
        System.out.println(tec1.datos());
    }
}
