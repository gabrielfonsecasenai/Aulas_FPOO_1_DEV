package classes;

public class Concessionaria {
    public static void main(String[] args) {
        Carro hondaCivic = new Carro("Civic", "Honda1", "Cinza", 2022, true);
        System.out.println(hondaCivic);
        
        hondaCivic.andar(120);
        System.out.println(hondaCivic);
        
        hondaCivic.freiar();
        System.out.println(hondaCivic);
    }
}
