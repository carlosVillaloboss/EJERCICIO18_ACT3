package ejercicio18_cap3;

public class Empleado {
    private int codigoEmp;
    private String nombres;
    private double horasmes;
    private double valorhora;
    private double retencion;
    
    public Empleado(int codigoEmp, String nombres, double horasmes, double valorhora, double retencion) {
        this.codigoEmp = codigoEmp;
        this.nombres = nombres;
        this.horasmes = horasmes;
        this.valorhora = valorhora;
        this.retencion = retencion;
    }
    
    public double SalarioBruto() {
        return horasmes * valorhora;
    }
    
    public double SalarioNeto() {
        double sb = SalarioBruto();
        double desc = retencion / 100.0;
        return sb - (sb * desc);
    }
    
    public String MostrarDatos() {
        double salarioBruto = SalarioBruto();
        double salarioNeto = SalarioNeto();
        return String.format("Código del empleado: %d\nNombres: %s\nSalario bruto: %.2f\nSalario neto: %.2f",
                             codigoEmp, nombres, salarioBruto, salarioNeto);
    }
}
