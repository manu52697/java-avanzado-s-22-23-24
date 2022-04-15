package org.manu.javaavanzado.s222324;

import org.manu.javaavanzado.s222324.coche.*;
import org.manu.javaavanzado.s222324.coche.componentes.motor.TipoMotor;

public class Main {

    public static void main(String[] args) {


        probarCoche(new Coche(TipoMotor.GASOLINA));
        probarCoche(new CocheConPasajeros(TipoMotor.GASOLINA,2));

        probarCoche(new CocheDiesel());
        probarCoche(new CocheElectrico());
        probarCoche(new CocheHibrido());

    }

    public static void probarCoche(Coche coche){

        System.out.println("#".repeat(20));
        System.out.println("Coche con motor: " + coche.getTipoMotor());

        System.out.println("-".repeat(20));
        coche.arrancar();
        coche.acelerar(20);
        coche.decelerar(10);
        coche.frenar();
        coche.parar();

        System.out.println("\r\n");

    }
}
