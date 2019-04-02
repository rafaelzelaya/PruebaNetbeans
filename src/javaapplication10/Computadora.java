/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication10;

/**
 *
 * @author Rafael
 */
public class Computadora {
    public Computadora(){
        MemoriaRAM = 0;
    }
    public Computadora(int memoriaRam){
        MemoriaRAM = memoriaRam;
    }
    public int MemoriaRAM;
    public static Computadora Sumar(Computadora a, Computadora b){
        Computadora resultado = new Computadora();
        /*if(a.MemoriaRAM > b.MemoriaRAM){
            resultado.MemoriaRAM = a.MemoriaRAM;
        }
        else{
            resultado.MemoriaRAM = b.MemoriaRAM;
        }*/
        resultado.MemoriaRAM = 
                SumarRam(a.MemoriaRAM, b.MemoriaRAM);
        return resultado;
    }
    private static int SumarRam(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
}