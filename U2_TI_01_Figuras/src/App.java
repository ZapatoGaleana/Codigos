import Model.Circle;
import Model.FigureAbs;
import Model.Square;
import Model.Triangle;
import Model.Right_Triangle;
import Model.Equilateral_Triangle;

public class App {
    public static void main(String[] args) throws Exception 
    {

        FigureAbs sq = new Square(10);
        FigureAbs cir = new Circle(10);
        FigureAbs triangle = new Triangle(20, 25, 20);
        FigureAbs right = new Right_Triangle(12, 15);
        FigureAbs Equilateral = new Equilateral_Triangle(3);

        FigureAbs[] figures = { sq, cir, triangle, right,Equilateral };

        for (FigureAbs figureAbs : figures) {
            System.out.println("La clase es: " + figureAbs.getClass().getSimpleName());
            System.out.println("El area es: " + figureAbs.getArea());
            System.out.println("El perimetro es: " + figureAbs.getPerimeter());
            System.out.println("----------------------------------------------------");
            System.out.println();
        }

    }
}
