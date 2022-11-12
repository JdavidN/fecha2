package modelo;

public class Fecha
{
    //--------------
    //Atributos
    //--------------
    private int dia;
    private int mes=0;
    private int anio;
    private int dias;


    //--------------
    //metodos
    //--------------

    //Metodos acceso

    public Fecha(int dia, int mes, int anio) 
    {
        
    }

    public Fecha() 
 
    {

	}

    public Fecha(int dias)
    {

    }
    


	//metodos Set
    public void setAnio(int anio) 
    {
        this.anio = anio;
    }

    public void setMes(int mes) 
    {
        this.mes = mes;
    }

    public void setDia(int dia)
     {
        this.dia = dia;
    }
    public void setDias(int dias) 
    {
        this.dias = dias;
    }
    //metodos Get
    public int getAnio()
    {
        return anio;
    }
    public int getMes() 
    {
        return mes;
    }
    
    public int getDia() 
    {
        return dia;
    }
    public int getDias() 
    {
        return dias;
    }
    

    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public String DiastoString()
    {
        return dias + "";
    }

    public boolean equals(Object obj)
    {
        Fecha otra = (Fecha)obj;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }

    public void addDias(int d)
    {
        int suma= fechaToDias()+d;
        diasToFecha(suma);
    }

    private int fechaToDias()
    {
    
        return anio*360+mes*30+dia;
    }

    private void diasToFecha(int i)
    {
    
        anio = (int)(i/360);

        int residuo = i % 360;

        mes = (int) residuo/30;

        dia = residuo % 30;

        if (residuo == 0)
        dia = 30;

        if (mes == 0)
        mes = 12;
        
    }
}