/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entities;

import java.io.Serializable;
import javax.persistence.Entity;

/**
 *
 * @author Lucas
 */
@Entity
public class Administrador  extends User implements Serializable {
    private String cargo;
    private String email;

    public Administrador() {
    }

    public Administrador(String cargo, String name, String username, String password, String email) {
        super(name, username, password);
        this.cargo = cargo;
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
        
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    
}
