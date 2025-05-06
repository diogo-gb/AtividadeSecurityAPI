package application.service;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import application.model.Questao;
import application.record.OpcaoDTO;
import application.repository.OpcaoRepository;
import application.repository.QuestaoRepository;

@Service
public class OpcaoService {

    @Autowired
    private OpcaoRepository opcaoRepository;

    @Autowired
    private QuestaoRepository questaoRepository;


    public OpcaoDTO salvar(OpcaoDTO dto) {
        Questao questao = questaoRepository.findById(dto.getQuestaoId())
                .orElseThrow(() -> new RuntimeException("Questao não encontrada"));

        Opcao opcao = new Opcao();
        opcao.setDescricao(dto.getDescricao());
        opcao.setIsCorreta(dto.isCorreta());
        opcao.setQuestao(questao);

        return toDTO(opcaoRepository.save(opcao));
    }

    public Optional<OpcaoDTO> buscarPorId(Long id) {
        return opcaoRepository.findById(id).map(this::toDTO);
    }

    public void deletar(Long id) {
        opcaoRepository.deleteById(id);
    }

    private OpcaoDTO toDTO(Opcao opcao) {
        OpcaoDTO dto = new OpcaoDTO();
        dto.setId(opcao.getId());
        dto.setDescricao(opcao.getDescricao());
        dto.setIsCorreta(opcao.isCorreta());
        dto.setQuestaoId(opcao.getQuestao().getId());
        return dto;
    }

    public static Iterable<OpcaoDTO> getAll() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAll'");
    }

    public OpcaoDTO insert(OpcaoDTO opcao) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'insert'");
    }
}