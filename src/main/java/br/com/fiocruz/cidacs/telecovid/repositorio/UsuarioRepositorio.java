package br.com.fiocruz.cidacs.telecovid.repositorio;

import br.com.fiocruz.cidacs.telecovid.modelo.TbUsuarioEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UsuarioRepositorio extends JpaRepository<TbUsuarioEntity, Long> {

    TbUsuarioEntity findByIdUsuario(UUID uuid);

    TbUsuarioEntity findByNuCpf(Integer cpf);
}
