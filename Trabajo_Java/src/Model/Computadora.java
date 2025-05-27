package Model;

public class Computadora
{
    private String marca;
    private String modelo;
    private boolean encendida;

    public void encendida()
    {
        if (!encendida) 
        {
            encendida=true;
            System.out.println("===== Encendido =====");            
        }
    }
    public void apagada()
    {
        if (encendida) 
        {
            encendida=false;
            System.out.println("===== Apagando =====");    
        }
    }
    public String getMarca()
    {
        return marca;
    }
    public String getModelo()
    {
        return modelo;
    }
    public void setModelo(String modelo)
    {
        this.modelo=modelo;
    }

    public boolean getEncendida()
    {
        return encendida;
    }

    public void setEncendida(boolean encendida)
    {
        this.encendida=encendida;
    }
}
