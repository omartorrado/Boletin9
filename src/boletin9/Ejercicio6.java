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
public class Ejercicio6 {

    ArrayList listaEmpleadosNombre=new ArrayList();
    ArrayList listaEmpleadosSalario=new ArrayList();
    Random r=new Random();
    public void NewListaEmpleados(){
        int num=r.nextInt(30);
        System.out.println(num);
        for (num=num;num>=1;num--){
            Empleado e1=new Empleado((String)("Empleado "+num),r.nextInt(5000));
                listaEmpleadosNombre.add(e1.nombre);
                listaEmpleadosSalario.add(e1.salario);
                System.out.println(e1.nombre+":"+e1.salario+"€   ");
        }
    }
    
    public void ej6(ArrayList a, ArrayList b){
        int menosDe1000=0;
        int entre1000y1750=0;
        System.out.println(a.size()+" "+b.size());
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
