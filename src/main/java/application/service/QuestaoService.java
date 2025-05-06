package application.service;

import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import application.model.Questao;
import application.record.CategoriaDTO;
import application.record.OpcaoDTO;
import application.record.QuestaoDTO;
import application.repository.CategoriaRepository;
import application.repository.QuestaoRepository;

@Service
public class QuestaoService {
    Autowired
    private static final QuestaoRepository QuestaoRepository = null;
    private QuestaoRepository questaoRepositoryRepo;

    public List<QuestaoDTO> listar() {
        return questaoRepository.findAll().stream()
                .map(this::toDTO)
                .collect(Collectors.toList());
    }

    public void setCategoriaRepo(QuestaoRepository categoriaRepo) {
        this.questaoRepository = questaoRepositoryRepo;
    }

    public Iterable<QuestaoDTO> getAll() {
        return QuestaoRepository.findAll().stream().map(QuestaoDTO::new).toList();
    }

    public QuestaoDTO insert(QuestaoDTO questao) {

        QuestaoDTO dto = new QuestaoDTO(null);
        dto.setId(questao.getId());
        dto.setEnunciado(questao.enunciado());
        dto.setCategoriaId(questao.categoria().getId());

        return new questaoDTO(questaoRepo.save(new Questao(Questao)));
    }

    public QuestaoRepository getQuestaoRepository() {
        return QuestaoRepository;
    }

    public void setQuestaoRepository(QuestaoRepository questaoRepositoryRepo) {
        this.questaoRepository = questaoRepository;
    }

    public static QuestaoRepository getQuestaorepository() {
        return QuestaoRepository;
    }

    public QuestaoRepository getQuestaoRepositoryRepo() {
        return questaoRepositoryRepo;
    }

    public void setQuestaoRepositoryRepo(QuestaoRepository questaoRepositoryRepo) {
        this.questaoRepositoryRepo = questaoRepositoryRepo;
    }
}
