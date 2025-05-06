package application.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import application.record.QuestaoDTO;
import application.service.QuestaoService;

@RestController
@RequestMapping("/questoes")
public class QuestaoController {
    @Autowired
    private QuestaoService questaoService;

    @GetMapping
    public Iterable<QuestaoDTO> getAll() {
        return QuestaoService.getAll();
    }

    @PostMapping
    public QuestaoDTO insert(@RequestBody QuestaoDTO questao) {
        return questaoService.insert(questao);
    }
}
