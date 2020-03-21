package br.com.fiocruz.cidacs.telecovid.modelo;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.*;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_usuario", schema = "public", catalog = "telecovid")
public class TbUsuarioEntity {
    @JsonProperty("idUsuario")
    private UUID idUsuario;
    @JsonProperty("nome")
    private String noUsuario;
    @JsonProperty("email")
    private String dsEmail;
    @JsonProperty("cpf")
    private Integer nuCpf;
    private Timestamp dtCadastro;
    private boolean stAtivo;
    //private String coHash;

    @Id
    @Column(name = "uuid_usuario")
    public UUID getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(UUID idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Basic
    @Column(name = "no_usuario")
    public String getNoUsuario() {
        return noUsuario;
    }

    public void setNoUsuario(String noUsuario) {
        this.noUsuario = noUsuario;
    }

    @Basic
    @Column(name = "ds_email")
    public String getDsEmail() {
        return dsEmail;
    }

    public void setDsEmail(String dsEmail) {
        this.dsEmail = dsEmail;
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
    @Column(name = "dt_cadastro")
    public Timestamp getDtCadastro() {
        return dtCadastro;
    }

    public void setDtCadastro(Timestamp dtCadastro) {
        this.dtCadastro = dtCadastro;
    }

    @Basic
    @Column(name = "st_ativo")
    public boolean isStAtivo() {
        return stAtivo;
    }

    public void setStAtivo(boolean stAtivo) {
        this.stAtivo = stAtivo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUsuarioEntity that = (TbUsuarioEntity) o;
        return stAtivo == that.stAtivo &&
                Objects.equals(idUsuario, that.idUsuario) &&
                Objects.equals(noUsuario, that.noUsuario) &&
                Objects.equals(dsEmail, that.dsEmail) &&
                Objects.equals(getNuCpf(), that.getNuCpf()) &&
                Objects.equals(dtCadastro, that.dtCadastro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, noUsuario, dsEmail, getNuCpf(), dtCadastro, stAtivo);
    }

    /*
    @Transient
    public String getCoHash() {
        return coHash;
    }

    public void setCoHash(String coHash) {
        this.coHash = coHash;
    }
    */
}
