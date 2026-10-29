package folha;

public class Estagiario extends Funcionario {

    public double calcularDescontos() {
        return 0.0;
    }

    @Override
    public String getTipo() {
        return "Estagiario";
    }
}
