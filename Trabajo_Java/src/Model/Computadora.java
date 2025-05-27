package Model;
<<<<<<< HEAD
=======

>>>>>>> eebd6c99c80840043fce964917585a8fd6243dca
public class Computadora
{
    private String marca;
    private String modelo;
    private boolean encendida;

<<<<<<< HEAD

    public void encender(boolean encendida)
    {
        this.encendida=encendida;
        if( !encendida ){
            encendida = true;
            System.out.println("Encendiendo");
        }

    }

    public void apagar(boolean encendida ){
      this.encendida = encendida;
        if(!encendida){
            encendida = false;
            System.out.println("Apagando");
        }

    }

    public String getMarca(String marca){
   this.marca = marca;
   return marca;

    }

    public String getModelo(String modelo){
        this.modelo = modelo;
        return modelo;

    }

    // public String getEncendida(boolean encendida){
    //     this.encendida = encendida;
    //     return encendida;

    // }

    public void setModelo(){


    }






}
=======
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
>>>>>>> eebd6c99c80840043fce964917585a8fd6243dca
