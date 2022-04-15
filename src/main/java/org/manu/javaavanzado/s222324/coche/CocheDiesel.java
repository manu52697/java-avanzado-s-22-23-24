package org.manu.javaavanzado.s222324.coche;

import org.manu.javaavanzado.s222324.coche.componentes.motor.TipoMotor;

public class CocheDiesel extends Coche{

    public CocheDiesel() {
        super(TipoMotor.DIESEL);
    }

    @Override
    public void arrancar() {
        super.arrancar();
        System.out.println("Empezando a contaminar");
    }

    @Override
    public void parar() {
        super.parar();
        System.out.println("Dejando de contaminar");
    }
}
