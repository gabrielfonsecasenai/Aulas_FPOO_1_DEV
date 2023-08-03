package Atividade4;

class CalcularAumento {
    private double salario;
    private double aumento;
    
    public CalcularAumento(double salario) {
        this.salario = salario;
        calcularAumento();
    }
    
    private void calcularAumento() {
        if (salario > 1350) {
            aumento = salario * 0.10;
        } else {
            aumento = salario * 0.15;
        }
    }
    
    public double getAumento() {
        return aumento;
    }
    
    public double getNovoSalario() {
        return salario + aumento;
    }
}
