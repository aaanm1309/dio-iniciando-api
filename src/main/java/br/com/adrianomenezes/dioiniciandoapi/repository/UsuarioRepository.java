package br.com.adrianomenezes.dioiniciandoapi.repository;

import br.com.adrianomenezes.dioiniciandoapi.handler.BusinessException;
import br.com.adrianomenezes.dioiniciandoapi.handler.CampoObrigatorioException;
import br.com.adrianomenezes.dioiniciandoapi.model.Usuario;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UsuarioRepository {
    public Usuario save(Usuario usuario) {
        if (usuario.getLogin()==null){
            throw new BusinessException("o campo login é obrigatório");
        }
        if (usuario.getPassword()==null){
            throw new CampoObrigatorioException("password");
        }

        if (usuario.getId() == null) {
            System.out.println("SAVE - Salvando usuario " + usuario.getLogin());
        } else {
            System.out.println("UPDATE - Alterando usuario " + usuario.getLogin());
        }
        usuario.setId(99574);
        return usuario;
    }

    public void deleteById(Integer id) {
        System.out.println(String.format("DELETE/ID - Recebendo o id: %d e apagando o mesmo",id));
        System.out.println(id);
    }

    public List<Usuario> findAll(){
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("jajao","senha1"));
        usuarios.add(new Usuario("LALA","senha2"));
        return usuarios;
    }

    public Usuario findById(Integer id){
        Usuario usuario = new Usuario();
        usuario.setLogin("jajao");
        usuario.setPassword("senha1");
        System.out.println(String.format("FIND/ID - Recebendo o id: %d e apagando o mesmo",id));
//        System.out.println(id);
        return usuario;
    }

    public Usuario findByUserName(String login){
        Usuario usuario = new Usuario();
        usuario.setLogin("Banana");
        usuario.setPassword("senha123");
        System.out.println(String.format("FIND/UserName - Recebendo o login: %s e buscando o mesmo",login));
//        System.out.println(login);
        return usuario;
    }


}
