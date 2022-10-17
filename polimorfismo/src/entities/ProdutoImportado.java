package entities;

public class ProdutoImportado extends Produto{
    private Double taxaAlfandega;

    public ProdutoImportado(String nome, Double preco, Double taxaAlfandega) {
        super(nome, preco);
        this.taxaAlfandega = taxaAlfandega;
    }

    public Double getTaxaAlfandega() {
        return taxaAlfandega;
    }

    public void setTaxaAlfandega(Double taxaAlfandega) {
        this.taxaAlfandega = taxaAlfandega;
    }

    @Override
    public Double etiquetaDePreco(){
        return getPreco() + getTaxaAlfandega();
    }

    @Override
    public String toString() {
        return "Nome: " + getNome()  +
                " Preço: " + etiquetaDePreco() +
                " (Taxa alfandegaria: $" + getTaxaAlfandega() + ")";
    }
}
