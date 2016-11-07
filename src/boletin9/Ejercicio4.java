/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio4 {
    Scanner sc1=new Scanner(System.in);
    
    public void Ej4(){
        int count=0;
        while (count<=10){
        System.out.println("Introduce un numero entero para ver su tabla de multiplicar.\nPulse 0 para finalizar.");
        int num=sc1.nextInt();
        if (num!=0){

//        boolean stop=false;
        do{
            System.out.println(num+"x"+count+"="+(num*count));
            count++;
        }
        while (count<=10);
        count=0;
        }
        else break;
        }
    }
}
