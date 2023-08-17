package Enumeracao.Atividades.atividade02;

public class Enumeracao {
    public static void main(String[] args) {
        Livros livros = new Livros("Categoria do livro: ", LivrosEnum.ACAO.getCategoria());
        System.out.println(livros);
        
        livros.setLivros(LivrosEnum.AVENTURA.getCategoria());
        System.out.println(livros);
        
        livros.setLivros(LivrosEnum.COMEDIA.getCategoria());
        System.out.println(livros);
        
        livros.setLivros(LivrosEnum.FICCAO.getCategoria());
        System.out.println(livros);
        
        livros.setLivros(LivrosEnum.ROMANCE.getCategoria());
        System.out.println(livros);
    }
}
