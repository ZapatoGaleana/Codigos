import Model.Estudiante;
import java.util.Scanner; //Libreria para poder leer los datos ingresados por el teclado

public class App 
{
    public static void main(String[] args) 
    {
        //Intente hacer que las calificaciones se pidieran. Para eso tuve que investigar profe.
        //Digo para que no piense que lo hice con chat jsjsjs
        // Es que la otra vez vi que algunos ya ponian eso de pedir los valores.
        Scanner scanner = new Scanner(System.in);
        Estudiante estudiante = new Estudiante();

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        estudiante.setNombre(nombre);
        System.out.println("Ingrese la matricula del estudiante:");
        String matricula = scanner.nextLine();
        estudiante.setMatricula(matricula);

        for (int i = 0; i < 5; i++) 
        {
            System.out.println("Ingrese la calificacion " + (i + 1));
            double nota = scanner.nextDouble();
            estudiante.setNota(i, nota);
        }

        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Matricula: "+ estudiante.getMatricula());
        System.out.println("Promedio: " + estudiante.calcularPromedio());
        if (estudiante.aprobado()) 
        {
            System.out.println("Aprobado?: Si");
        } 
        else 
        {
            System.out.println("Aprobado?: No");
        }
        scanner.close();
    }
}
