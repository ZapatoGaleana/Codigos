//Profesor yo lo entregue asi porque por lo que me dijo nada mas tenia que salir encendido y apagado.
import Model.Computadora;
import java.util.Scanner;
public class Compu
{
    public static void main(String[] args) throws Exception
    {
        Scanner scanner = new Scanner(System.in);
        Computadora compu = new Computadora();

        compu.encendida();
        System.out.println("Ingrese el Modelo:");
        String modelo = scanner.nextLine();
        compu.setModelo(modelo);
        System.out.println();

        System.out.println("Modelo: "+ compu.getModelo());
        System.out.println();

        compu.apagada();

        scanner.close();

    }
}
