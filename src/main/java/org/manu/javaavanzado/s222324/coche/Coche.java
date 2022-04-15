package org.manu.javaavanzado.s222324.coche;


import org.manu.javaavanzado.s222324.coche.componentes.motor.TipoMotor;


public class Coche {

    boolean arrancado = false;
    int velocidad = 0;
    TipoMotor tipoMotor;

    public Coche(TipoMotor tipoMotor) {
        this.tipoMotor = tipoMotor;
    }

    public void arrancar(){
        this.arrancado = true;
    }

    public void parar(){
        frenar();
        this.arrancado = false;
    }

    public TipoMotor getTipoMotor(){
        return this.tipoMotor;
    }

    public int acelerar(int kmHora){
        if(!this.arrancado) return 0;

        this.velocidad += kmHora;
        return this.velocidad;
    }

    public int decelerar(int kmHora){
        this.velocidad -= kmHora;
        return this.velocidad;
    }

    public void frenar(){
        this.velocidad = 0;
    }
}
