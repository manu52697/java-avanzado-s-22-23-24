package org.manu.javaavanzado.s222324.coche;

import org.manu.javaavanzado.s222324.coche.componentes.motor.TipoMotor;

public class CocheConPasajeros extends Coche{

    private final int numPlazas;
    private int numOcupantes;

    public CocheConPasajeros(TipoMotor tipoMotor) {
        super(tipoMotor);
        this.numPlazas = 4;
    }

    public CocheConPasajeros(TipoMotor tipoMotor, int numPlazas) {
        super(tipoMotor);
        this.numPlazas = numPlazas;
    }

    public int plazasLibres(){
        return numPlazas - numOcupantes;
    }

    public boolean montar(int pasajeros){
        if(plazasLibres() >= pasajeros){
            this.numOcupantes += pasajeros;
            System.out.println("Han montado " + pasajeros + " pasajeros.");
            return true;
        }
        return false;
    }

    /**
     * El conductor se monta al arrancar
     */
    @Override
    public void arrancar() {
        super.arrancar();
        montar(1);
    }

    /**
     * Todos los ocupantes se bajan al parar
     */
    @Override
    public void parar() {
        super.parar();
        bajar(this.numOcupantes);
    }

    public boolean bajar(int pasajeros){
        if(numOcupantes >= pasajeros){
            this.numOcupantes -= pasajeros;
            System.out.println("Se han bajado " + pasajeros + " pasajeros");
            return true;
        }
        return false;
    }
}
