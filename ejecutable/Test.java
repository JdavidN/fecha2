package ejecutable;

import modelo.Fecha;

public class Test 
{
 public static void main(String[] args) 
 {
    Fecha f= new Fecha();
    f.setDia(2);
    f.setMes(10);
    f.setAnio(1970);

    //mostrar en consola

    System.out.println("Dia: " + f.getDia());
    System.out.println("Mes: " + f.getMes());
    System.out.println("Año: " + f.getAnio());
    System.out.println(f.toString());

    Fecha f2 = new Fecha(8, 10, 2020);
    System.out.println(f2.toString());


    


    if(f.equals(f2))
    {
        System.out.println("Las fechas son iguales");
    }
    else
    {
        System.out.println("Las fechas son Diferentes");
    }
    
    
 }    
}
