package Model;

public class Right_Triangle extends FigureAbs
{
    private double base;
    private double height;

    public Right_Triangle(double base, double height)
    {
        this.base=base;
        this.height=height;
    }

    public double getBase()
    {
        return base;
    }

    public void setBase(double base)
    {
        this.base=base;
    }

    public double getHeight() 
    {
        return height;
    }

    public void setHeight(double height) 
    {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }

    @Override
    public double getPerimeter() {
    return base + height + Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
}



}
