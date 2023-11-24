import org.junit.jupiter.api.Test;

import main.java.Academia;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlunoTest {

    @Test
    public void testNotificacaoCliente() {
        Academia academia = new Academia ("Academia  A");
        Aluno  aluno1 = new Aluno("Aluno 1");
        Aluno aluno2 = new Aluno("Aluno 2");

        aluno1.cadastrar(academia);
        aluno2.cadastrar(academia);

        academia.cadastrarAluno();

        assertEquals("Aluno 1, cadastrado na Loja A", aluno1.getUltimaNotificacao());
        assertEquals("Aluno 2, cadastrado na Loja A", aluno2.getUltimaNotificacao());
    }


}