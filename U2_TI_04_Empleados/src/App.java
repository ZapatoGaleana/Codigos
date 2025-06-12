public class App {
    public static void main(String[] args) throws Exception 
    {
        Empleado EmpleadoPorHoras = new EmpleadoPorHoras("001", "Juan Perez", 20.0, 160);
        System.out.println("ID del empleado por horas: " + EmpleadoPorHoras.getId());
        System.out.println("Nombre del empleado por horas: " + EmpleadoPorHoras.getNombre());
        System.out.println("Salario del empleado por horas: " + EmpleadoPorHoras.calcularSalario());
        System.out.println();

        Empleado EmpleadoTiempoCompleto =new EmpleadoTiempoCompleto("002", "Maria Lopez", 3000.0, 160);
        System.out.println("ID del empleado tiempo completo: " + EmpleadoTiempoCompleto.getId());
        System.out.println("Nombre del empleado tiempo completo: " + EmpleadoTiempoCompleto.getNombre());
        System.out.println("Salario del empleado tiempo completo: " + EmpleadoTiempoCompleto.calcularSalario());
        
    }
}
