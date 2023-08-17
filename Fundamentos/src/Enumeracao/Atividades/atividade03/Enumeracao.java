package Enumeracao.Atividades.atividade03;

public class Enumeracao {
    public static void main(String[] args) {
        Produtos produtos = new Produtos("Produto: ", ProdutoEnum.AGUA.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.REFRIGERANTE.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.SUCO.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.CHOCOLATE.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.COXINHA.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.SALGADO_CARNE.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.SALGADO_CATUPIRY.getProduto());
        System.out.println(produtos);
        
        produtos.setProduto(ProdutoEnum.SALGADO_FRANGO.getProduto());
        System.out.println(produtos);
    }
        
}
