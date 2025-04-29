package application.record;

import java.util.List;

import application.model.Categoria;
import application.model.Opcao;
import application.model.Questao;

public record QuestaoDTO(long id, String enunciado, List<Opcao> opcao, Categoria categoria) {
    public QuestaoDTO(Questao model) {
        this(model.getId(), model.getEnunciado(), model.getOpcao(), model.getCategoria());
    }

    public Questao questao() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'questao'");
    }
}
