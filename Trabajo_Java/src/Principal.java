import Model.Computadora;
import java.util.Scanner;

public class Principal 
{
    public static void main(String[] args) 
    {
        Computadora compu = new Computadora();


     compu.encender(false);
        
        System.out.println(" GT09 " + compu.getMarca(null));

        System.out.println(" hp " + compu.getModelo(null));
        System.out.println(" ");
        

        compu.apagar(false);
        
        
    }
}
