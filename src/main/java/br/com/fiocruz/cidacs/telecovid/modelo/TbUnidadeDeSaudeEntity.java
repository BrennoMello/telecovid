package br.com.fiocruz.cidacs.telecovid.modelo;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_unidade_de_saude", schema = "public", catalog = "telecovid")
public class TbUnidadeDeSaudeEntity {
    private UUID uuidUnidadeDeSaude;
    private String noUnidadeDeSaude;
    private String dsEndereco;
    private String dsTelefones;

    @Id
    @Column(name = "uuid_unidade_de_saude")
    public UUID getUuidUnidadeDeSaude() {
        return uuidUnidadeDeSaude;
    }

    public void setUuidUnidadeDeSaude(UUID uuidUnidadeDeSaude) {
        this.uuidUnidadeDeSaude = uuidUnidadeDeSaude;
    }

    @Basic
    @Column(name = "no_unidade_de_saude")
    public String getNoUnidadeDeSaude() {
        return noUnidadeDeSaude;
    }

    public void setNoUnidadeDeSaude(String noUnidadeDeSaude) {
        this.noUnidadeDeSaude = noUnidadeDeSaude;
    }

    @Basic
    @Column(name = "ds_endereco")
    public String getDsEndereco() {
        return dsEndereco;
    }

    public void setDsEndereco(String dsEndereco) {
        this.dsEndereco = dsEndereco;
    }

    @Basic
    @Column(name = "ds_telefones")
    public String getDsTelefones() {
        return dsTelefones;
    }

    public void setDsTelefones(String dsTelefones) {
        this.dsTelefones = dsTelefones;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUnidadeDeSaudeEntity that = (TbUnidadeDeSaudeEntity) o;
        return Objects.equals(uuidUnidadeDeSaude, that.uuidUnidadeDeSaude) &&
                Objects.equals(noUnidadeDeSaude, that.noUnidadeDeSaude) &&
                Objects.equals(dsEndereco, that.dsEndereco) &&
                Objects.equals(dsTelefones, that.dsTelefones);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidUnidadeDeSaude, noUnidadeDeSaude, dsEndereco, dsTelefones);
    }
}
