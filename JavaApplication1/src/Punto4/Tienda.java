package Punto4;

import java.util.Scanner;

public class Tienda {
    public static void main(String[] args) {
        Caracteristica carac = new Caracteristica(000000, 1250000);
        
        System.out.println(carac.contenido());
        int code=100, precio=1000, peso;
        code=(int) (Math.random()*1000000000);
        precio=(int) (Math.random()*1000000+1000000);
        peso=(int) (Math.random()*100);
        
        
        Portatil porta1= new Portatil(code, precio, peso, "Ideal para sus "
                + "viajes");
        System.out.println(porta1.contenido());
        PcMesa pc1 = new PcMesa(code, precio, "E-ATX", "Es el que más pesa, "
                + "pero el que menos cuesta");
        System.out.println(pc1.contenido());
    }
}
