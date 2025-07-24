/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author Braya
 */
public class Reloj  extends Tiempo implements Configurable{

    public Reloj() {
        super();
        this.activo=true;
    }

    @Override
    public void configurar(int h, int m, int s) {
        this.hora=h;
        this.minutos=m;
        this.segundos=s;
    }
}
