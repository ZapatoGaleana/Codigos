package Model;

public class cuadrado
{
    public double lado;

    public double getPerimeter()
    {
        return lado*4;
    }

    public double getArea()
    {
        return lado*lado;
    }

    public void setLado(double lado)
    {
        this.lado=lado;
    }

}