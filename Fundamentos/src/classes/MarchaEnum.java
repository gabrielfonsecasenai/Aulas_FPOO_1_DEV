package classes;

public enum MarchaEnum {
    NEUTRO("Nêutro", 0),
    PRIMEIRA_MARCHA("Primeira marcha", 1),
    SEGUNDA_MARCHA("Segunda marcha", 2),
    TERCEIRA_MARCHA("Terceira marcha", 3),
    QUARTA_MARCHA("Quarta marcha", 4),
    QUINTA_MARCHA("Quinta marcha", 5),
    MARCHA_RE("Marcha ré", -1);
    
    private String marcha;
    private int numeroMarcha;

    private MarchaEnum(String marcha, int numeroMarcha) {
        this.marcha = marcha;
        this.numeroMarcha = numeroMarcha;
    }

    public String getMarcha() {
        return marcha;
    }

    public int getNumeroMarcha() {
        return numeroMarcha;
    }
    
}
