       public class Curso
{
    private String codigo;
    private String nombre;
    private Estudiante[] inscritos;

    public Curso(String codigo,String nombre,int capacidad)
    {
        this.codigo=codigo;
        this.nombre=nombre;
        this.inscritos= new Estudiante[capacidad];
    }

    public String getCodigo() 
    {
        return codigo;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public Estudiante[] getInscritos() 
    {
        return inscritos;
    }

    public boolean inscribir(Estudiante e)
    {
        for(int i=0; i<inscritos.length; i++)
        {
            if (inscritos[i]==null) 
            {
                inscritos[i]=e;
                return true;
            }
        }
        return false;
    }
    public double calularPromedioGrupo()
    {
        double suma=0;
        int cantidad = 0;
        for(int i=0; i<inscritos.length; i++)
        {
            Estudiante e=inscritos[i];
            if (e!=null) 
            {
                suma+= e.getPromedio();
                cantidad++;
            }
            
        }
        return suma/cantidad;
    }
    
}