/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Reloj;

/**
 *
 * @author Student
 */
public abstract class Tiempo {
    protected int hora;
    protected int minutos;
    protected int segundos;

    public Tiempo() {
        this.hora = 0;
        this.minutos = 0;
        this.segundos = 0;
    }
    
    public void correr() {
        segundos++;
        if(segundos==60){
            segundos=0;
            minutos++;
        }
        if(minutos==60){
            minutos=0;
            hora++;
        }
        if(hora==24){
            hora=0;
        }
            
    }
    public String toString(){
        String h,m,s;
        h=String.valueOf(hora);
        if(hora < 10){
            h="0".concat(h);
        }
        m=String.valueOf(minutos);
        if(minutos < 10){
            m="0".concat(m);
        }
        s=String.valueOf(segundos);
        if(segundos < 10){
            s="0".concat(s);
        }
        return h+":"+m+":"+s;
    }
    
}
