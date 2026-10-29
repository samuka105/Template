package folha;

public class Main {

    public static void main(String[] args) {
        Funcionario clt = new FuncionarioCLT();
        clt.setNome("Marcos");
        clt.setSalarioBruto(3000.0);

        Funcionario estagiario = new Estagiario();
        estagiario.setNome("Julia");
        estagiario.setSalarioBruto(1500.0);

        Funcionario pj = new FuncionarioPJ();
        pj.setNome("Renata");
        pj.setSalarioBruto(5000.0);

        System.out.println(clt.getInfo());
        System.out.println(estagiario.getInfo());
        System.out.println(pj.getInfo());
    }
}
