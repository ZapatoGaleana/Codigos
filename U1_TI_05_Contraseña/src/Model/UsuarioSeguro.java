package Model;
public class UsuarioSeguro 
{
    private String nombreUsuario;
    private String password;

    public void setNombreUsuario(String nombreUsuario)
    {
        if (nombreUsuario !=null && nombreUsuario.length() >0) 
        {
            this.nombreUsuario=nombreUsuario;
            System.out.println("El nombre se ingreso correctamente");
        }
        else
        {
            System.out.println("El nombre contiene cadena vacia");
        }

    }

    public void setPassword(String password)
    {
        if (password.length() < 8) 
        {
            System.out.println("La contraseña no contiene 8 caracteres");    
        }

    boolean mayuscula = false;
    boolean minuscula = false;
    boolean digito = false;

    for (int i = 0; i < password.length(); i++) 
    {
        char g = password.charAt(i);

        if (Character.isUpperCase(g)) 
        {
            mayuscula = true;
        } 
        else
        if (Character.isLowerCase(g)) 
        {
            minuscula = true;    
        } 
        else 
        if (Character.isDigit(g)) 
        {
            digito = true;    
        }
    }

    if (!mayuscula) 
    {
        System.out.println("No ingreso MAYUSCULAS");
        return;
    }
    if (!minuscula) 
    {
        System.out.println("No ingreso minusculas");
        return;
    }
    if (!digito) 
    {
        System.out.println("No ingreso ningun digito");
        return;
    }

    this.password = password;
    System.out.println("El password se ingreso correctamente");
    }

    public boolean autenticar(String intentPassword) 
    {
        if (this.password == intentPassword) 
        {
        return true;
        } 
        else 
        {
        return false;
        }
    }
}
