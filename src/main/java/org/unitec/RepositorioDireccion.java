/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author campitos
 */
public interface RepositorioDireccion extends CrudRepository<Direccion, Long>{
    
}