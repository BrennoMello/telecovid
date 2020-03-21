package br.com.fiocruz.cidacs.telecovid.controlador;

import br.com.fiocruz.cidacs.telecovid.modelo.TbMunicipioEntity;
import br.com.fiocruz.cidacs.telecovid.modelo.TbUsuarioEntity;
import br.com.fiocruz.cidacs.telecovid.repositorio.BairroRepositorio;
import br.com.fiocruz.cidacs.telecovid.repositorio.MunicipioRepositorio;
import br.com.fiocruz.cidacs.telecovid.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.time.OffsetTime;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@RestController
public class TeleCovidControlador {

    @Autowired
    private UsuarioRepositorio usuarioRepositorio;
    @Autowired
    private MunicipioRepositorio municipioRepositorio;
    @Autowired
    private BairroRepositorio bairroRepositorio;
    //perguntar sobre o adm


    //cadastrar voluntario e mandar email
    @RequestMapping(value = "/voluntario", method = {RequestMethod.POST})
    public boolean addVoluntario(@RequestBody TbUsuarioEntity usuario){
        TbUsuarioEntity usuarioEntity = usuarioRepositorio.findByNuCpf(usuario.getNuCpf());
        if(usuarioEntity == null) {
            usuario.setIdUsuario(UUID.randomUUID());
            ZonedDateTime now = ZonedDateTime.now();
            Timestamp timestamp = Timestamp.from(now.toInstant());
            usuario.setDtCadastro(timestamp);
            usuarioRepositorio.save(usuario);
            return true;
        }

        return false;
    }

    //altera o status, mandar o hash adm
    @RequestMapping(value = "/voluntario/status", method = {RequestMethod.POST})
    public TbUsuarioEntity alterarStatusVoluntario(@RequestBody TbUsuarioEntity usuario){
        TbUsuarioEntity usuarioGet = usuarioRepositorio.findByIdUsuario(usuario.getIdUsuario());
        if(usuarioGet.isStAtivo())
            usuarioGet.setStAtivo(false);
        else
            usuarioGet.setStAtivo(true);

        usuarioRepositorio.save(usuarioGet);
        return usuarioGet;
    }

    //lista todos voluntarios, mandar o hash adm
    @RequestMapping(value = "/adm", method = {RequestMethod.GET})
    public List<TbUsuarioEntity> getVoluntarios(){
        return usuarioRepositorio.findAll();
    }

    @RequestMapping(value = "/voluntario/{id}", method = {RequestMethod.GET})
    public ResponseEntity<TbUsuarioEntity> getVoluntario(@PathVariable String id){
        TbUsuarioEntity usuarioGet = usuarioRepositorio.findByIdUsuario(java.util.UUID.fromString(id));
        if(usuarioGet != null)
            return  ResponseEntity.ok().body(usuarioGet);
        else
            return ResponseEntity.notFound().build();
    }


    //listar todas as cidades
    @RequestMapping(value = "/cidades", method = {RequestMethod.GET})
    public List<TbMunicipioEntity> getMunicipios(){
        return municipioRepositorio.findAll();
    }


    //pela cidade pegar o bairro
    @RequestMapping(value = "/bairros/{+municipio}", method = {RequestMethod.GET})
    public boolean getBairros(@PathVariable String municipio){
        TbMunicipioEntity tbMunicipioEntity = municipioRepositorio.findByNoMunicipio(municipio);
        return true;
    }

    /*
    //pela classificacao pegar a unidade de saude
    @RequestMapping(value = "/bairros", method = {RequestMethod.GET})
    public boolean getVoluntarios(@RequestBody TbUsuarioEntity usuario){
        usuario.setIdUsuario(UUID.randomUUID());
        usuarioRepositorio.save(usuario);
        return true;
    }

    //realizar post do atendimento e gerar numero de atendimento
    @RequestMapping(value = "/registroatendimento", method = {RequestMethod.POST})
    public boolean getVoluntarios(@RequestBody TbUsuarioEntity usuario){
        usuario.setIdUsuario(UUID.randomUUID());
        usuarioRepositorio.save(usuario);
        return true;
    }
    */
}
