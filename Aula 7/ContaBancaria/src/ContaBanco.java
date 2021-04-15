import Exception.Saldo_Insuficiente;
public interface ContaBanco
{
    void Saque(double var1) throws Saldo_Insuficiente;

    void Deposito(double var1);
}
