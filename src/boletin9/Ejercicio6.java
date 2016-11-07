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

    ArrayList listaEmpleados=new ArrayList();
    Random r=new Random(50);
    public void NewListaEmpleados(){
        int num=r.nextInt(50);
        System.out.println(num);
        for (num=num;num>=0;num--){
            Empleado e1=new Empleado((String)("Empleado "+num),r.nextFloat());
                listaEmpleados.add(e1);
                System.out.println(num);
        }

        //System.out.println(listaEmpleados.size());
    }
    
    public void ej6(ArrayList e){
        for (int count=e.size();count<=0;count--){
            
        }
    }
    
}
