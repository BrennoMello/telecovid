package br.com.fiocruz.cidacs.telecovid.repositorio;

import br.com.fiocruz.cidacs.telecovid.modelo.TbMunicipioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface MunicipioRepositorio extends JpaRepository<TbMunicipioEntity, Long> {

    TbMunicipioEntity findByNoMunicipio(String nome);
}
