package ejecutable;

import modelo.Fecha;

public class Test 
{
 public static void main(String[] args) 
 {
    Fecha f= new Fecha();
    f.setDia(3);
    f.setMes(12);
    f.setAnio(1980);

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
        System.out.println("Las fechas son Diferentes" );
    }
    

    f.addDias(180);
    System.out.println(f.toString());

    f2.addDias(360);
    System.out.println(f2.toString());

    
 }    
}
