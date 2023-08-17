package Enumeracao.Atividades.atividade01;

public class Enumeracao {
    public static void main(String[] args) {
        Meses meses = new Meses("Mes:", MesesEnum.JANEIRO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.FEVEREIRO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.MARCO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.ABRIL.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.MAIO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.JUNHO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.JULHO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.AGOSTO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.SETEMBRO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.OUTUBRO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.NOVEMBRO.getMes());
        System.out.println(meses);
        
        meses.setMes(MesesEnum.DEZEMBRO.getMes());
        System.out.println(meses);
    }
}
