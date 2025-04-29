package application.model;

import application.record.OpcaoDTO;
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
@Table(name = "opções")
@Getter
@Setter
@NoArgsConstructor
public class Opcao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false, unique = true)
    private String descricao;
    @Column(nullable = false, unique = true)
    private boolean isCorreta;
    @Column(nullable = false, unique = true)
    private Questao questao;

    public Opcao(OpcaoDTO dto) {
        this.id = dto.id();
        this.descricao = dto.descricao();
        this.isCorreta = dto.isCorreta();
        this.questao = dto.questao();
    }
}
