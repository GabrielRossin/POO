import Exception.Saldo_Insuficiente;
public class Poupanca extends  Conta
{
    public Poupanca(double saldo)
    {
        super(saldo);
    }

    public void Saque(double valor) throws Saldo_Insuficiente
    {
        if(valor < 0)
        {
            throw new IllegalArgumentException("Valor inválido");
        }
        if(getSaldo() - valor < 0)
        {
            throw new Saldo_Insuficiente("Saldo insuficiente");
        }
        else
        {
            this.saldo -= valor;
        }

    }

    public void Deposito(double valor)
    {
        if(valor<0)
        {
            throw new IllegalArgumentException("Valor inválido!");
        }
        else
        {
            this.saldo += valor;
        }

    }

    public String toString()
    {
        return "Poupanca{numConta=" + this.getNumConta() + ", saldo=" + this.getSaldo() + "}";
    }

    public double getSaldo()
    {
        return this.saldo;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }
}

