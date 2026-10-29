package folha;

public class FuncionarioPJ extends Funcionario {

    public double calcularDescontos() {
        return this.salarioBruto * 0.06;
    }

    @Override
    public String getTipo() {
        return "PJ";
    }
}
