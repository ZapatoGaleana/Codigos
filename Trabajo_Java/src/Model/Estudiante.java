package Model;

public class Estudiante 
{
    private String nombre;
    private String matricula;
    private double[] notas = new double[5];

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) 
    {
        this.matricula = matricula;
    }

    public double getNota(int i) 
    {
        return notas[i];
    }

    public void setNota(int i, double n) 
    {
        notas[i] = n;
    }

    public double calcularPromedio() 
    {
        double suma = 0;
        for (int i = 0; i < 5; i++) 
        {
            suma += notas[i];
        }
        return suma / 5;
    }

    public boolean aprobado() 
    {
        return calcularPromedio() >= 7;
    }
}
