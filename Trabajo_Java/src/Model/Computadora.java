package Model;
public class Computadora
{
    private String marca;
    private String modelo;
    private boolean encendida;


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