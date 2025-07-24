/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author Student
 */
public class Temporizador extends Tiempo implements Configurable,Controlable {

    @Override
    public void configurar(int h, int m, int s) {
        this.hora=h;
        this.minutos=m;
        this.segundos=s;
    }

    @Override
    public void iniciar() {
        this.activo=true;
    }

    @Override
    public void detener() {
        this.activo=false;
    }

    @Override
    public void correr() {
        if (this.activo) {
            segundos--;
            if (segundos == -1) {
                segundos = 59;
                minutos--;
                if (minutos == -1) {
                    minutos = 59;
                    hora--;
                    if (hora == 0) {
                        hora = 0;
                        minutos = 0;
                        segundos = 0;
                        this.activo = false;
                    }
                }
            }
        }
    }
}
