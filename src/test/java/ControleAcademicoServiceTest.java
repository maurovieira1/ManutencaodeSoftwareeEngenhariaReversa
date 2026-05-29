import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ControleAcademicoServiceTest {

    ControleAcademicoService service = new ControleAcademicoService();

    @Test
    public void testReprovadoPorFrequencia() {
        assertEquals("Reprovado", service.verificarSituacao(8.0, 70));
    }

    @Test
    public void testProvaFinal() {
        assertEquals("Prova Final", service.verificarSituacao(5.0, 80));
    }

    @Test
    public void testFrequenciaInvalidaNegativa() {
        assertFalse(service.frequenciaValida(-5));
    }

    // TESTE NOVO (Criado por você): Validando o Chamado 2
    @Test
    public void testCalcularMediaCorreta() {
        assertEquals(8.0, service.calcularMedia(7.0, 9.0), 0.001);
    }
}