import javax.swing.JOptionPane;

public class calificaciones
{
    public static void main(String[] args) throws Exception
    {
        String num1 = JOptionPane.showInputDialog("Ingresa la primera calificacion");
        String num2 = JOptionPane.showInputDialog("Ingresa la segunda calificacion");
        String num3 = JOptionPane.showInputDialog("Ingresa la tercera calificacion");
        float total = ( Integer.parseInt(num1) + Integer.parseInt(num2) + Integer.parseInt(num3) ) /3;
        System.out.println("El promedio es: " + total);
    }
}