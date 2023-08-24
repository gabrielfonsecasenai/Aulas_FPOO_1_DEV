package classes;

public class Bicicletaria {
    public static void main(String[] args) {
        Bicicleta caloiCross = new Bicicleta(2, true, 18, "Caloi Cross", true, "Preto");
        System.out.println(caloiCross);
        
        caloiCross.andar(10);
        caloiCross.andar(500);
        caloiCross.andar(4);
        caloiCross.andar(1);
        
        System.out.println(caloiCross);
    }
}
