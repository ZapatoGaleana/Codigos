package Model;

public class Equilateral_Triangle extends FigureAbs
{
    private double side;

    public Equilateral_Triangle(double side)
    {
        this.side=side;
    }

    public double getSide()
    {
        return side;
    }

    public void setSide(double side)
    {
        this.side=side;
    }

    @Override
    public double getArea()
    {
        return (Math.sqrt(3)/4) * Math.pow(side, 2);
    }

    @Override
    public double getPerimeter()
    {
        return 3*side;
    }
}
