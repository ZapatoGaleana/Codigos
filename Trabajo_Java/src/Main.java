import Model.CuentaBancaria;
public class Main 
{    public static void main(String[] args) throws Exception
    {
        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.setTitular("Emiliano");
        System.out.println("Usuario: "+ cuenta.getTitular());
    
        cuenta.depositar(1000);
        System.out.println("Saldo inicial:"+ cuenta.getSaldo());
        System.out.println();
        cuenta.retirar(200);
        cuenta.retirar(10000);

        

        
        
    }
}

