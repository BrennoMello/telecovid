package br.com.fiocruz.cidacs.telecovid.modelo;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_bairro", schema = "public", catalog = "telecovid")
public class TbBairroEntity {
    private UUID uuidBairro;
    private String noBairro;

    @Id
    @Column(name = "uuid_bairro")
    public UUID getUuidBairro() {
        return uuidBairro;
    }

    public void setUuidBairro(UUID uuidBairro) {
        this.uuidBairro = uuidBairro;
    }

    @Basic
    @Column(name = "no_bairro")
    public String getNoBairro() {
        return noBairro;
    }

    public void setNoBairro(String noBairro) {
        this.noBairro = noBairro;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbBairroEntity that = (TbBairroEntity) o;
        return Objects.equals(uuidBairro, that.uuidBairro) &&
                Objects.equals(noBairro, that.noBairro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidBairro, noBairro);
    }
}
