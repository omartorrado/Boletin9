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
                int checkmethod;
                //Aki nos pide que elijamos como va a obtener los datos de los
                //Empleados
                System.out.println("Para introducir los datos de los empleados a"
                        + " mano pulse 1\nPara generar una lista de empleados "
                        + "con sueldos aleatorios pulse 2");
                checkmethod=sc1.nextInt();
                //el do while comprueba que se ha elegido la opcion 1 o 2 y sino 
                //indica opcion no valida y se queda a la espera de que se elija
                //una correcta
                do{
                if (checkmethod==1){
                    ej6.EscribeListaEmpleados();
                }
                else if (checkmethod==2){
                    ej6.NewListaEmpleados();
                }
                else{
                    System.out.println("Opcion no valida");
                    checkmethod=sc1.nextInt();
                }
                }
                while(checkmethod<1&&checkmethod>2);
                //ejecuta eñ metodo ej6 en la lista generada en el paso anterior
                ej6.ej6(ej6.listaEmpleadosNombre, ej6.listaEmpleadosSalario);
                break;
        }
    
    }
    
}
