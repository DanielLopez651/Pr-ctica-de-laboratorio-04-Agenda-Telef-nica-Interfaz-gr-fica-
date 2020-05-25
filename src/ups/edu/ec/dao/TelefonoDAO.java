/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ups.edu.ec.dao;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import ups.edu.ec.idao.ITelefonoDAO;
import ups.edu.ec.modelo.Telefono;

/**
 *
 * @author user
 */
public class TelefonoDAO implements ITelefonoDAO{
       //Diccionario de Telefonos
    private Map<String, Telefono> telefonos;

    //Constructor
    public TelefonoDAO() {
        telefonos = new HashMap<String, Telefono>();
    }

    //Metodos de la Interface ITelefono
    @Override
    public void create(Telefono telefono) {
        telefonos.put(telefono.getCodigo(), telefono);
    }

    @Override
    public void update(Telefono telefono) {
        telefonos.put(telefono.getCodigo(), telefono);
    }

    @Override
    public void delete(Telefono telefono) {
        telefonos.remove(telefono.getCodigo());
    }

    @Override
    public Collection<Telefono> findAll() {
        Collection<Telefono> telefonosC = this.telefonos.values();
        return telefonosC;
    }

    @Override
    public Telefono read(String codigo) {
        return telefonos.get(codigo);
    }
    
}
