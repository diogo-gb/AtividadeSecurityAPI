package application.model;

import application.record.QuestaoDTO;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "questões")
@Getter
@Setter
@NoArgsConstructor

public class Questao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String enunciado;
    @Column(nullable = false, unique = true)
    private Opcao opcao;
    @Column(nullable = false, unique = true)
    private Questao questao;

    public Questao(QuestaoDTO dto) {
        this.id = dto.id();
        this.enunciado = dto.enunciado();
        this.opcao = dto.opcao();
        this.questao = dto.questao();
    }

    public Categoria getCategoria() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCategoria'");
    }
}
