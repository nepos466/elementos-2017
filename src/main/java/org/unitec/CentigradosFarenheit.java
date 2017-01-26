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
public class CentigradosFarenheit implements Conversion{

    @Override
    public float convertir(float valor) {
   float farenheit=(valor-32)/1.8f;
   return farenheit;
    }
    
}
