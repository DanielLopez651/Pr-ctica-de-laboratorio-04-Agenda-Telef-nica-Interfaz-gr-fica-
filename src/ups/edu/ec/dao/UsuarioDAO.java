/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import ups.edu.ec.idao.IUsuarioDAO;
import ups.edu.ec.modelo.Usuario;

/**
 *
 * @author user
 */
public class UsuarioDAO implements IUsuarioDAO{
      
    //Diccionario de Usuarios
    private Map<String, Usuario> usuarios;

    //Constructor
    public UsuarioDAO() {
        usuarios = new HashMap<String, Usuario>();
    }

    //Metodos de la Interface IUsuario
    @Override
    public void create(Usuario usuario) {
        usuarios.put(usuario.getCedula(), usuario);
    }

    @Override
    public Usuario read(String cedula) {
        return usuarios.get(cedula);
    }

    @Override
    public void update(Usuario usuario) {
        usuarios.put(usuario.getCedula(), usuario);
    }

    @Override
    public void delete(Usuario usuario) {
        usuarios.remove(usuario.getCedula());
    }

    @Override
    public Collection<Usuario> findAll() {
        Collection<Usuario> usuarios = this.usuarios.values();
        return usuarios;
    }
}
