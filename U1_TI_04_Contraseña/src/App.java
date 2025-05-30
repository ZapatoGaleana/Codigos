import Model.UsuarioSeguro;
import java.util.Scanner;
/*Profe ya me rindo :"v ya intente que se compare la contraseña si modifico algo ingreso la misma contraseña
y me sale que esta denegado, pero si no es la misma me sale que es correcto. Asi que asi se lo entrego. :"v
*/
public class App {
    public static void main(String[] args) throws Exception 
    {
        Scanner scanner = new Scanner(System.in);
        UsuarioSeguro usuario = new UsuarioSeguro();

        System.out.println("Ingrese un nombre:");
        String nombreusuario = scanner.nextLine();
        usuario.setNombreUsuario(nombreusuario);

        System.out.println("Ingrese su password: ");
        String password = scanner.nextLine();
        usuario.setPassword(password);
        System.out.println();
        usuario.setPassword("holayadiosjsjs");        
        usuario.setPassword("hola12345678");
        usuario.setPassword("HOLABUENAS"); 

        System.out.print("Ingrese su password para autenticar: ");
        String intento = scanner.nextLine();
        if (usuario.autenticar(intento)) 
        {
            System.out.println("Acceso concedido");
        } else 
        {
            System.out.println("Acceso denegado");
        }

    }
}