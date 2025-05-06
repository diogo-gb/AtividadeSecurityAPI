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

    public Object getId() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getId'");
    }

    public void setCategoriaId(long id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setCategoriaId'");
    }

    public void setEnunciado(String enunciado2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setEnunciado'");
    }

    public void setId(Object id2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setId'");
    }
}
