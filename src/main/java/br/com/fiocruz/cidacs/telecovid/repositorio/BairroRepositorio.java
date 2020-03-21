package br.com.fiocruz.cidacs.telecovid.repositorio;

import br.com.fiocruz.cidacs.telecovid.modelo.TbBairroEntity;
import br.com.fiocruz.cidacs.telecovid.modelo.TbMunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.UUID;

public interface BairroRepositorio extends JpaRepository<TbBairroEntity, Long> {
    //@Query("select bairro from tb_bairro bairro where bairro.uuid_municipio = :municipio.uuidMunicipio")
    //List<TbBairroEntity> findAllByUuidMunicipio(TbMunicipioEntity municipio);

}
