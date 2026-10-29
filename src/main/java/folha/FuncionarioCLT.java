package folha;

public class FuncionarioCLT extends Funcionario {

    public double calcularDescontos() {
        double inss = this.salarioBruto * 0.11;
        double ir = this.salarioBruto * 0.075;
        return inss + ir;
    }

    @Override
    public String getTipo() {
        return "CLT";
    }
}
