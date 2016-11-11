/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio1 {
    
    ArrayList ar1=new ArrayList();
    //Scanner sc1=new Scanner(System.in);
    Random r1=new Random();
    
    public void calcular(){
        for (int e=0;e<10;e++){
            //introduciendo los valores con un scanner
            //int n=sc1.nextInt();
            int n=r1.nextInt();
            ar1.add(n);
        }
        System.out.println(ar1.size());
        int positivos=0,negativos=0,ceros=0,errores=0;
        for (int e=0;e<ar1.size();e++){
            if ((int)ar1.get(e)>0){
                positivos++;
            }
            else if ((int)ar1.get(e)==0){
                ceros++;
            }
            else if ((int)ar1.get(e)<0){
                negativos++;
            }
//      ver como se manejan exceptions y modificar esto en el futuro
//            else if (Exception){
//                System.out.println("el "+e+"º valor no es un numero entero");
//                errores++;
//            }
        }
        System.out.println("En estos diez valores"+ar1+" hay:\n"+positivos+" numeros positos\n"
                +negativos+" numeros negativos\n"+ceros+" ceros ");
                //+ "y "+errores+" errores");
        }
    
}

    
