import Model.cuadrado;
import Model.tringulo;
import Model.circulo;

public class principal {
    public static void main(String[] args) throws Exception 
    {

        cuadrado cua = new cuadrado();
        cua.setLado(10);
        System.out.printf("El perimetro es: %.2f\n", cua.getPerimeter());
        System.out.printf("El area del cuadrado es: %.2f\n", cua.getArea());

        circulo cir = new circulo();
        cir.setRadio(10);
       System.out.printf("El perimetro del circulo es: %.2f\n", cir.getPerimeter2());
        System.out.printf("El area del circulo es: %.2f\n", cir.getArea2());

        tringulo tri = new tringulo();
        tri.setLado2(10);
        tri.setBase(10);
        tri.setAltura(10);
        System.out.printf("El perimetro del triangulo es: %.2f\n", tri.getPerimeter3());
        System.out.printf("El area del triangulo es: %.2f\n", tri.getArea3());

    }
}
