/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaMVC.control;

import sistemaMVC.model.dao.ClienteDao;
import sistemaMVC.model.domain.Cliente;

/**
 *
 * @author carlo
 */
public class ClienteControl {
    
    private Cliente cliente;
    
    private ClienteDao dao;
    
    public ClienteControl(){
     novo();
     dao = new ClienteDao();
    }
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void novo() {
        cliente = new Cliente();
    }

    public void excluir() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void salvar() {
        dao.salvar(cliente);
    }

    public void pesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
    
}
