package br.com.fiocruz.cidacs.telecovid.modelo;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_classificacao", schema = "public", catalog = "telecovid")
public class TbClassificacaoEntity {
    private UUID uuidClassificacao;
    private String noClassificacao;

    @Id
    @Column(name = "uuid_classificacao")
    public UUID getUuidClassificacao() {
        return uuidClassificacao;
    }

    public void setUuidClassificacao(UUID uuidClassificacao) {
        this.uuidClassificacao = uuidClassificacao;
    }

    @Basic
    @Column(name = "no_classificacao")
    public String getNoClassificacao() {
        return noClassificacao;
    }

    public void setNoClassificacao(String noClassificacao) {
        this.noClassificacao = noClassificacao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbClassificacaoEntity that = (TbClassificacaoEntity) o;
        return Objects.equals(uuidClassificacao, that.uuidClassificacao) &&
                Objects.equals(noClassificacao, that.noClassificacao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidClassificacao, noClassificacao);
    }
}
