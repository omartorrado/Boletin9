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
public class Ejercicio3 {
    
    public void calcularArea(){
        System.out.println("Vamos a calcular el area de un rectangulo");
        Scanner sc1=new Scanner(System.in);
        System.out.println("Introduce la base");
        float base=sc1.nextFloat();
        while (base<=0){
            System.out.println("No es un valor valido, introduzca un valor positivo");
            base=sc1.nextFloat();
        }
        System.out.println("Introduce la altura");
        float altura=sc1.nextFloat();
        while (altura<=0){
            System.out.println("No es un valor valido, introduzca un valor positivo");
            altura=sc1.nextFloat();
        }
        System.out.println("El area del rectangulo de base "+base+" y altura "+altura+" es de "+(base*altura));
    }
    
}
