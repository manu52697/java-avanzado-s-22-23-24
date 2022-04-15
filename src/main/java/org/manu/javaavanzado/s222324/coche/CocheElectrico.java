package org.manu.javaavanzado.s222324.coche;

import org.manu.javaavanzado.s222324.coche.componentes.motor.TipoMotor;

public class CocheElectrico extends Coche{

    public CocheElectrico() {
        super(TipoMotor.ELECTRICO);
    }

    @Override
    public void arrancar() {
        super.arrancar();
        System.out.println("Hmmm, no oigo el motor, lo habré arrancado bien? ");
    }

    @Override
    public void parar() {
        super.parar();
    }
}
