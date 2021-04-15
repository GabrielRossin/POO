import Exception.Saldo_Insuficiente;
public abstract class Conta implements ContaBanco
{
    protected int numConta;
    double saldo;
    static int prox = 1;

    public Conta(double saldo)
    {
        this.setSaldo(saldo);
        this.setNumConta(prox++);
    }

    public void setNumConta(int numConta)
    {
        this.numConta = numConta;
    }

    public int getNumConta()
    {
        return numConta;
    }

    public void setSaldo(double saldo)
    {
        this.saldo = saldo;
    }

    public double getSaldo()
    {
        return saldo;
    }

    public abstract void Saque(double var1) throws Saldo_Insuficiente;

    public abstract void Deposito(double var1);

}
