package application.record;

import application.model.Opcao;
import application.model.Questao;

public record OpcaoDTO (long id, String descricao, boolean isCorreta,Questao questao ) {
    public OpcaoDTO(Opcao model){
        this(model.getId(), model.getDescricao(), model.isCorreta(), model.getQuestao());
    }
}
