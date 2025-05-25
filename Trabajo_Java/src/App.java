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
        Estudiante[] estudiante = new Estudiante[5];

        for (int i=0; i<5; i++)
        {
        System.out.println("======= Estudiante " + (i+1) + " =======");
        estudiante[i] = new Estudiante();

        System.out.println("Ingrese el nombre del estudiante:");
        String nombre = scanner.nextLine();
        estudiante[i].setNombre(nombre);
        System.out.println("Ingrese la matricula del estudiante:");
        String matricula = scanner.nextLine();
        estudiante[i].setMatricula(matricula);

        for (int a = 0; a < 5; a++) 
        {
            System.out.println("Ingrese la calificacion " + (a + 1));
            double nota = scanner.nextDouble();
            estudiante[i].setNota(a,nota);
        }
         scanner.nextLine();
        }
       
        for (int i = 0; i < 5; i++) 
        {
        System.out.println("Nombre: " + estudiante[i].getNombre());
        System.out.println("Matricula: "+ estudiante[i].getMatricula());
        System.out.println("Promedio: " + estudiante[i].calcularPromedio());
        if (estudiante[i].aprobado()) 
        {
            System.out.println("Aprobado?: Si");
        } 
        else 
        {
            System.out.println("Aprobado?: No");
        }
        }
        System.out.println();
        scanner.close();
    }
}
