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
public class JavaApplication10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        Computadora compu1 = new Computadora(4000);
        Computadora compu2 = new Computadora(8000);
        Computadora resultado = Computadora.Sumar(compu1, compu2);
        System.out.println("RAM resultante:"
                +resultado.MemoriaRAM);
        //
        Punto p = new Punto(100,375);
        System.out.println("x:"+p.X);
        System.out.println("x:"+p.Y);
    }
}
