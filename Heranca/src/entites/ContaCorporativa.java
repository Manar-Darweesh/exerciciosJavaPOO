package entites;

public class ContaCorporativa extends Conta{
    private Double limiteEmpr;

    public ContaCorporativa(){
    }

    public ContaCorporativa(Integer numeroConta, String titular, Double saldo, Double limiteEmpr) {
        super(numeroConta, titular, saldo);
        this.limiteEmpr = limiteEmpr;
    }

    public Double getLimiteEmpr() {
        return limiteEmpr;
    }

    public void setLimiteEmpr(Double limiteEmpr) {
        this.limiteEmpr = limiteEmpr;
    }

    public void emprestimo(double valor){
        if (valor <= limiteEmpr) {
            saldo += valor - 10.0;
        }
    }
}
