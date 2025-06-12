public class EmpleadoTiempoCompleto extends Empleado
{
    private String beneficios;
public EmpleadoTiempoCompleto(String id, String nombre, double salarioBase, int horasTrabajadas) 
{
    super(id, nombre, salarioBase);
}
public String getBeneficios() {
    return beneficios;
}
@Override
public double calcularSalario() 
{
    return salarioBase;
}
}
