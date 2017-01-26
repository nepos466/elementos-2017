/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

import org.springframework.context.annotation.Configuration;

/**
 *
 * @author campitos
 */
@Configuration
public class ServicioConversion {
    
    Conversion hacerConversion(){
        return new CentigradosFarenheit();
    }
    
}
