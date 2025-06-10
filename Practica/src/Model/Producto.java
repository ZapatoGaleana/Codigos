package Model;

public class Producto 
{
    private String codigo;
    private String nombre;
    private int cantidad;

    public String getCodigo()
    {
        return codigo;
    }
    public void setCodigo(String codigo)
    {
        if (codigo != null && codigo.length()>0) 
        {
            this.codigo=codigo;   
        }
        else
        {
            System.out.println("El codigo no puede estar vacio");
        }
        
    }

    public String getNombre()
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        this.nombre=nombre;
    }

    public int getCantidad()
    {
        return cantidad;
    }
    public void setCantidad(int cantidad)
    {
        if (cantidad>=0)
        {
            this.cantidad=cantidad;   
        }
        else
        {
            System.out.println("La cantidad no puede ser negativa xd");
        }
    }
}