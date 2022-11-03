package modelo;

public class Fecha
{
    //--------------
    //Atributos
    //--------------
    private int dia;
    private int mes=0;
    private int anio;


    //--------------
    //metodos
    //--------------

    //Metodos acceso

    public Fecha(int dia, int mes, int anio) 
    {
        
    }

    public Fecha() {
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

    

    public String toString()
    {
        return dia + "/" + mes + "/" + anio;
    }

    public boolean equals(Object obj)
    {
        Fecha otra = (Fecha)obj;
        return (dia==otra.dia) && (mes==otra.mes) && (anio==otra.anio);
    }
}