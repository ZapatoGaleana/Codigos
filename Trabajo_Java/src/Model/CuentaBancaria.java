package Model;

public class CuentaBancaria 
{
    private String titular;
    private double saldo;


    public void depositar(double monto)
    {
        if (monto>0)
        {
                this.saldo+=monto;
        }
    }
    
    public boolean retirar(double monto)
    {
        if (monto >0 && saldo>=monto) 
        {
            saldo-=monto;
            System.out.println("Operacion exitosa");
            System.out.println();
            System.out.println("Saldo actual: "+ getSaldo());
            return true;
        }
        else
        {
            System.out.println("No cuentas con el saldo suficiente xd");
            return false;
        }
    }

    public double getSaldo()
    {
        return saldo;
    }

    public String getTitular()
    {
        return titular;
    }

    public void setTitular(String titular)
    {
        this.titular=titular;
    }
}
