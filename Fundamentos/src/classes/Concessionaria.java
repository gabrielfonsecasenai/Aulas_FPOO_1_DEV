package classes;

public class Concessionaria {
    public static void main(String[] args) {
        Carro hondaCivic = new Carro("Civic", "Honda", CorEnum.PRATA, 2022, true);
        System.out.println(hondaCivic);
        
        hondaCivic.andar(700000000);
        System.out.println(hondaCivic);
        
        hondaCivic.freiar();
        hondaCivic.trocarMarcha(MarchaEnum.PRIMEIRA_MARCHA);
        System.out.println(hondaCivic);
        
    }
}
