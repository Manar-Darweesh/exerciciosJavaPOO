package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ProdutoUsado extends Produto{
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    private Date dataFabricacao;

    public ProdutoUsado(String nome, Double preco, Date dataFabricacao) {
        super(nome, preco);
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }

    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Double etiquetaDePreco(){
        return getPreco();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()  + " (Usado)" +
                " Preço: $" + etiquetaDePreco() +
                " (Data de fabicação:" + getDataFabricacao() + ")";
    }
}
