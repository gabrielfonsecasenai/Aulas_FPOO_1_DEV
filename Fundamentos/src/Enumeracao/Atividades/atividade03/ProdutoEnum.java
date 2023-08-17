package Enumeracao.Atividades.atividade03;

public enum ProdutoEnum {
    SALGADO_CARNE("Salgado de carne"),
    SALGADO_FRANGO("Salgado de frango"),
    SALGADO_CATUPIRY("Salgado de catupiry"),
    COXINHA("Coxinha"),
    CHOCOLATE("Chocolate"),
    REFRIGERANTE("Refrigerante"),
    SUCO("Suco"),
    AGUA("Agua");
    
    private String produto;

    private ProdutoEnum(String produto) {
        this.produto = produto;
    }

    public String getProduto() {
        return produto;
    }
    
}
