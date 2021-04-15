import Exception.Saldo_Insuficiente;
public class Corrente extends Conta
{
        public double limite;
        public double max;

        public Corrente(double saldo, double max)
        {
            super(saldo);
            this.setLimite(max);
        }

        public void Saque(double valor) throws Saldo_Insuficiente
        {
            if(valor<0)
            {
                throw new IllegalAccessError("Valor inválido");
            }

            else
            {
                if (this.getSaldo() + this.getLimite() - valor < 0.0D)
                {
                    throw new Saldo_Insuficiente("Saldo insuficiente!");
                }
                else
                {
                    if (this.getSaldo() > 0.0D)
                    {
                        if (this.getSaldo() - valor > 0.0D)
                        {
                            this.saldo -= valor;
                        }
                        else
                        {
                            this.saldo -= valor;
                            this.limite += this.getSaldo();
                            this.setSaldo(0.0D);
                        }
                    }
                    else if (this.getLimite() > 0.0D)
                    {
                        if (this.getLimite() - valor < 0.0D)
                        {
                            System.out.println("Valor maior que o limite.");
                        }
                        else
                        {
                            this.limite -= valor;
                        }
                    }

                }
            }


        }

        public void Deposito(double valor)
        {
            if(valor<0)
            {
                throw new IllegalArgumentException("Valor inválido");
            }
            else
            {
                if (this.getLimite() == this.max)
                {
                    this.saldo += valor;
                }
                else
                {
                    this.limite += valor;
                    if (this.getLimite() > this.max)
                    {
                        this.setSaldo(this.getLimite() - this.max);
                        this.setLimite(this.max);
                    }
                }
            }



        }

        public double getSaldo()
        {
            return this.saldo;
        }

        public void setSaldo(double saldo)
        {
            this.saldo = saldo;
        }

        public double getLimite()
        {
            return this.limite;
        }

        public void setLimite(double limite)
        {
            this.limite = limite;
        }

        public String toString()
        {
            return "Corrente{nroConta=" + this.getNumConta() + ", Limite=" + this.getLimite() + ", Saldo=" + this.getSaldo() + "}";
        }


}
