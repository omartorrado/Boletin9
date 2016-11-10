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
public class Ejercicio5 {
    Scanner sc1=new Scanner(System.in);
    
    public void Ej5(){
        System.out.println("Escoja la serie a mostrar\n1:2+4+6+8+10...\n"
                + "2:-1+2-3+4-5+6\n3:0,1,1,2,3,5,8,13,21...");
        int serie=sc1.nextInt();
        System.out.println("Escoja cuantos numeros mostrar");
        int veces=sc1.nextInt();
        switch(serie){
            case 1:
                int counter=1;
                while (counter<=veces){
                    System.out.print("+"+counter*2);
                    counter++;
                }
                break;
            case 2:
                int counter2=1;
                while (counter2<=veces){
                if ((counter2%2)!=0){
                    System.out.print("-"+counter2);
                }
                else {
                    System.out.print("+"+counter2);
                }
                counter2++;
                }
                break;
            case 3:
                int counter3=0;
                long numlast=0;
                long numnext=0;
                while (counter3<=veces){
                    if (numnext==0){
                    System.out.print(numnext+",");
                    numnext=1;
                    counter3++;
                    //incluimos el 0 y el primer 1 manualmente pq no cumplen 
                    //la condicion del metodo del else
                    System.out.print(numnext+",");
                    }
                    else{
                        //coje los dos ultimos valores y los suma para calcular
                        //el siguiente valor
                        System.out.print((numnext+numlast)+",");
                        long numtemp=numnext+numlast;
                        numlast=numnext;
                        numnext=numtemp;
                        counter3++;
                    }
                }
                break;
        }
    }
    
}
