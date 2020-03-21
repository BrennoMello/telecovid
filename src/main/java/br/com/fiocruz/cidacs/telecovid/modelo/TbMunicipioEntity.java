package br.com.fiocruz.cidacs.telecovid.modelo;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_municipio", schema = "public", catalog = "telecovid")
public class TbMunicipioEntity {
    private UUID uuidMunicipio;
    private String noMunicipio;

    @Id
    @Column(name = "uuid_municipio")
    public UUID getUuidMunicipio() {
        return uuidMunicipio;
    }

    public void setUuidMunicipio(UUID uuidMunicipio) {
        this.uuidMunicipio = uuidMunicipio;
    }

    @Basic
    @Column(name = "no_municipio")
    public String getNoMunicipio() {
        return noMunicipio;
    }

    public void setNoMunicipio(String noMunicipio) {
        this.noMunicipio = noMunicipio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbMunicipioEntity that = (TbMunicipioEntity) o;
        return Objects.equals(uuidMunicipio, that.uuidMunicipio) &&
                Objects.equals(noMunicipio, that.noMunicipio);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidMunicipio, noMunicipio);
    }
}
