/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin9;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author otorradomiguez
 */
public class Ejercicio6 {

    ArrayList listaEmpleadosNombre=new ArrayList();
    ArrayList listaEmpleadosSalario=new ArrayList();
    Random r=new Random();
    //Genero 2 arraylist de tamaño aleatorio (1-30), una con los nombres de los 
    //empleados y otra con los salarios con cantidades aleatorias
    public void NewListaEmpleados(){
        int num=r.nextInt(30);
        //System.out.println(num);
        for (num=num;num>=1;num--){
            Empleado e1=new Empleado((String)("Empleado "+num),r.nextInt(3000));
                listaEmpleadosNombre.add(e1.nombre);
                listaEmpleadosSalario.add(e1.salario);
                System.out.println(e1.nombre+":"+e1.salario+"€");
        }
    }
    
    //metodo para que pida nombre y a continuacion salario y los vaya almacenando
    //en las correspondoientes listas
    public void EscribeListaEmpleados(){
        int salario=1;
        System.out.println("Indica un salario 0 para que deje de pedir datos\n(El empleado con salario 0 no se incluye en las operaciones");
        do{
        Scanner sc1=new Scanner(System.in);
        System.out.println("Escribe el nombre del empleado");
        listaEmpleadosNombre.add(sc1.next());
        System.out.println("Indica su salario");
        salario=sc1.nextInt();
        //si el salario es negativo vuelve a pedirlo
            if (salario<0){
                do{
                System.out.println("Indica su salario (No puede ser negativo)");
                salario=sc1.nextInt();
                }
                while (salario<0);
                //una vez recibimos un salario positivo continua y sale del bucle
                listaEmpleadosSalario.add(salario);
            }
            else{
            listaEmpleadosSalario.add(salario);
            }
        }
        //si el salario es 0 sale del bucle
        while(salario!=0);
        //elimina la ultima entrada de ambos arraylists, la que se corresponde con el 
        //empleado de salario 0
        listaEmpleadosNombre.remove(listaEmpleadosNombre.size()-1);
        listaEmpleadosSalario.remove(listaEmpleadosSalario.size()-1);
        System.out.println(listaEmpleadosNombre);
        System.out.println(listaEmpleadosSalario);
    }
    
    public void ej6(ArrayList a, ArrayList b){
        int menosDe1000=0;
        int entre1000y1750=0;
        //System.out.println(a.size()+" "+b.size());
        //Toma la longitud del arraylist y ejecuta las operaciones para cada 
        //elemento de las listas nombre y salario
        for (int count=a.size();count>0;count--){
            if ((int)b.get(count-1)<1000){
                menosDe1000++;
            }
            if (((int)b.get(count-1)>=1000)&&((int)b.get(count-1)<=1750)){
                entre1000y1750++;
            }
            
        }
        System.out.println("Hay "+entre1000y1750+" trabajadores que ganan entre 1000 y 1750€");
        System.out.println("El "+(menosDe1000*100/a.size())+"% de los "+a.size()+" trabajadores gana menos de 1000€");
    }
    
}
