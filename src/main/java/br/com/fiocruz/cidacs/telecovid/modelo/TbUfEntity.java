package br.com.fiocruz.cidacs.telecovid.modelo;

import javax.persistence.*;
import java.util.Objects;
import java.util.UUID;

@Entity
@Table(name = "tb_uf", schema = "public", catalog = "telecovid")
public class TbUfEntity {
    private UUID uuidUf;
    private String sgUf;
    private String noUf;

    @Id
    @Column(name = "uuid_uf")
    public UUID getUuidUf() {
        return uuidUf;
    }

    public void setUuidUf(UUID uuidUf) {
        this.uuidUf = uuidUf;
    }

    @Basic
    @Column(name = "sg_uf")
    public String getSgUf() {
        return sgUf;
    }

    public void setSgUf(String sgUf) {
        this.sgUf = sgUf;
    }

    @Basic
    @Column(name = "no_uf")
    public String getNoUf() {
        return noUf;
    }

    public void setNoUf(String noUf) {
        this.noUf = noUf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TbUfEntity that = (TbUfEntity) o;
        return Objects.equals(uuidUf, that.uuidUf) &&
                Objects.equals(sgUf, that.sgUf) &&
                Objects.equals(noUf, that.noUf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uuidUf, sgUf, noUf);
    }
}
