package folha;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FuncionarioTest {

    @Test
    public void testDescontoCLT() {
        Funcionario clt = new FuncionarioCLT();
        clt.setSalarioBruto(3000.0);
        assertEquals(2445.0, clt.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testEstagiarioSemDesconto() {
        Funcionario estagiario = new Estagiario();
        estagiario.setSalarioBruto(1500.0);
        assertEquals(1500.0, estagiario.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testDescontoPJ() {
        Funcionario pj = new FuncionarioPJ();
        pj.setSalarioBruto(5000.0);
        assertEquals(4700.0, pj.calcularSalarioLiquido(), 0.001);
    }

    @Test
    public void testGetTipo() {
        assertEquals("CLT", new FuncionarioCLT().getTipo());
        assertEquals("Estagiario", new Estagiario().getTipo());
        assertEquals("PJ", new FuncionarioPJ().getTipo());
    }

    @Test
    public void testGetInfoUsaTipoEliquido() {
        Funcionario clt = new FuncionarioCLT();
        clt.setNome("Marcos");
        clt.setSalarioBruto(3000.0);
        String info = clt.getInfo();
        assertTrue(info.contains("CLT"));
        assertTrue(info.contains("Marcos"));
        assertTrue(info.contains("2445.0"));
    }
}
