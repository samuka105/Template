package folha;

public abstract class Funcionario {

    private String nome;
    protected double salarioBruto;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSalarioBruto() {
        return salarioBruto;
    }

    public void setSalarioBruto(double salarioBruto) {
        this.salarioBruto = salarioBruto;
    }

    public double calcularSalarioLiquido() {
        return this.salarioBruto - this.calcularDescontos();
    }

    public abstract double calcularDescontos();

    public String getTipo() {
        return "Funcionario";
    }

    public String getInfo() {
        return getTipo() + "{" +
                "nome='" + this.nome + '\'' +
                ", bruto=" + this.salarioBruto +
                ", liquido=" + this.calcularSalarioLiquido() +
                '}';
    }
}
