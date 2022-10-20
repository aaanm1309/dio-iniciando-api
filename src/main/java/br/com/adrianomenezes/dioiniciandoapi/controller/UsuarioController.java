package br.com.adrianomenezes.dioiniciandoapi.controller;

import br.com.adrianomenezes.dioiniciandoapi.model.Usuario;
import br.com.adrianomenezes.dioiniciandoapi.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @PostMapping
    public Usuario salvaUsuario(@RequestBody Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    @GetMapping
    public List<Usuario>  getUser(){
        return usuarioRepository.findAll();
    }

    @GetMapping("/{username}")
    public Usuario getOne(@PathVariable("username") String username){
        return usuarioRepository.findByUserName(username);
    }

    @GetMapping("/id/{id}")
    public Usuario getOneById(@PathVariable("id") Integer id){
        return usuarioRepository.findById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteOneById(@PathVariable("id") Integer id){
        usuarioRepository.deleteById(id);
    }
}
