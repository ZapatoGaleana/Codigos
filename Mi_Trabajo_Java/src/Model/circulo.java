package Model;

public class circulo 
{
    private double radio;

    public double getPerimeter2()
    {
        return 2*3.1416*radio;
    }

    public double getArea2()
    {
        return 3.1416*(radio*radio);
    }

    public void setRadio(double radio)
    {
        this.radio=radio;
    }


}
