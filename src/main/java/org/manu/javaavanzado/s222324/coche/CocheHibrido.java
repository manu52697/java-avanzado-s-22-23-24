package org.manu.javaavanzado.s222324.coche;

import org.manu.javaavanzado.s222324.coche.componentes.motor.TipoMotor;

public class CocheHibrido extends Coche{

    public CocheHibrido() {
        super(TipoMotor.HIBRIDO);
    }

    @Override
    public void arrancar() {
        super.arrancar();
        System.out.println("Empezando a contaminar un poquito");
    }

    @Override
    public void parar() {
        super.parar();
        System.out.println("Dejando de contaminar");
    }
}
