
public class App {
    public static void main(String[] args) throws Exception 
    {
      Curso curso = new Curso("CS101", "Introduccion a la Programacion", 3);
       Estudiante alumno1 = new Estudiante("Emiliano", "galeana@gmail.com", 8.5);
       Estudiante alumno2 = new Estudiante("Yahir", "campuzano@gmail.com", 9);
       Estudiante alumno3 = new Estudiante("Charbel", "charbel3@gmail.com", 9.3);

        curso.inscribir(alumno1);
        curso.inscribir(alumno2); 
        curso.inscribir(alumno3);

        System.out.println("Inscribiendo estudiantes al curso: " + curso.getNombre());
        
        System.out.printf("Promedio del grupo: %.1f" , curso.calularPromedioGrupo()); 
        /*agregue el printf para poner nada mas un decimal, no sabia como se quitaba xd*/

    }
}