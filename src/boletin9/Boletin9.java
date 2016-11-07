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
public class Boletin9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Escoje el numero de ejercicio");
        Scanner sc1=new Scanner(System.in);
        int n=sc1.nextInt();
        switch (n){
            case 1:
                Ejercicio1 ej1=new Ejercicio1();
                ej1.calcular();
                break;
            case 2:
                Ejercicio2 ej2=new Ejercicio2();
                ej2.ej2();
                break;
            case 3:
                Ejercicio3 ej3=new Ejercicio3();
                ej3.calcularArea();
                break;
            case 4:
                Ejercicio4 ej4=new Ejercicio4();
                ej4.Ej4();
                break;
            case 5:
                Ejercicio5 ej5=new Ejercicio5();
                ej5.Ej5();
                break;
            case 6:
                Ejercicio6 ej6=new Ejercicio6();
                ej6.NewListaEmpleados();
                ej6.ej6(ej6.listaEmpleadosNombre, ej6.listaEmpleadosSalario);
                break;
        }
    
    }
    
}
