package br.com.fiocruz.cidacs.telecovid.modelo;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_atendimento", schema = "public", catalog = "telecovid")
public class TbAtendimentoEntity {
    private UUID uuidAtendimento;
    private Integer nuIdade;
    private String dsComentario;
    private Integer nuCpf;
    private String dsTelefones;
    private Timestamp dtCadastro;

    @Id
    @Column(name = "uuid_atendimento")
    public UUID getUuidAtendimento() {
        return uuidAtendimento;
    }

    public void setUuidAtendimento(UUID uuidAtendimento) {
        this.uuidAtendimento = uuidAtendimento;
    }

    @Basic
    @Column(name = "nu_idade")
    public Integer getNuIdade() {
        return nuIdade;
    }

    public void setNuIdade(Integer nuIdade) {
        this.nuIdade = nuIdade;
    }

    @Basic
    @Column(name = "ds_comentario")
    public String getDsComentario() {
        return dsComentario;
    }

    public void setDsComentario(String dsComentario) {
        this.dsComentario = dsComentario;
    }

    @Basic
    @Column(name = "nu_cpf")
    public Integer getNuCpf() {
        return nuCpf;
    }

    public void setNuCpf(Integer nuCpf) {
        this.nuCpf = nuCpf;
    }

    @Basic
    @Column(name = "ds_telefones")
    public String getDsTelefones() {
        return dsTelefones;
    }

    public void setDsTelefones(String dsTelefones) {
        this.dsTelefones = dsTelefones;
    }

    @Basic
    @Column(name = "dt_cadastro")
    public Timestamp getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Timestamp dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbAtendimentoEntity that = (TbAtendimentoEntity) o;
        return Objects.equals(uuidAtendimento, that.uuidAtendimento) &&
                Objects.equals(nuIdade, that.nuIdade) &&
                Objects.equals(dsComentario, that.dsComentario) &&
                Objects.equals(nuCpf, that.nuCpf) &&
                Objects.equals(dsTelefones, that.dsTelefones) &&
                Objects.equals(dtCadastro, that.dtCadastro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidAtendimento, nuIdade, dsComentario, nuCpf, dsTelefones, dtCadastro);
    }
}
