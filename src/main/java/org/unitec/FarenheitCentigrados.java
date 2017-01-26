/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.unitec;

/**
 *
 * @author campitos
 */
public  class FarenheitCentigrados implements Conversion{

    @Override
    public float convertir(float valor) {
      float centigrados=valor*1.8f+32;
      return centigrados;
    }
    
}
