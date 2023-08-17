package Enumeracao.Atividades.atividade01;

public enum MesesEnum {
    JANEIRO("Janeiro, mes 01"),
    FEVEREIRO("Fevereiro, mes 02"),
    MARCO("Marco, mes 03"),
    ABRIL("Abril, mes 04"),
    MAIO("Maio, mes 05"),
    JUNHO("Junho, mes 06"),
    JULHO("Julho, mes 07"),
    AGOSTO("Agosto, mes 08"),
    SETEMBRO("Stembro, mes 09"),
    OUTUBRO("Outubro, mes 10"),
    NOVEMBRO("Novembro, mes 11"),
    DEZEMBRO("Dezembro, mes 12");
    
    private String mes;
    
    private MesesEnum(String mes) {
        this.mes = mes;
    }

    public String getMes() {
        return mes;
    }
    
}
