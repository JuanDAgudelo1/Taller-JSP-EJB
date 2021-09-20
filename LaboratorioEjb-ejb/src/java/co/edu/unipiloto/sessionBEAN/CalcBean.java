/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.sessionBEAN;

import javax.ejb.Stateless;

/**
 *
 * @author JuanD Agudelo
 */
@Stateless
public class CalcBean implements CalcBeanLocal {

    @Override
    public Integer sumar(int val1, int val2) {
        return (val1 + val2);
    }
    
    @Override
    public Integer restar(int val1, int val2) {
        return (val1 - val2);
    }
      
    @Override
    public Integer multiplicar(int val1, int val2) {
        return (val1 * val2);
    }
    
    @Override
    public Integer dividir(int val1, int val2) {
        return (val1 / val2);
    }
    
    @Override
    public Integer modulo(int val1, int val2) {
        return (val1 % val2);
    }
    
    @Override
    public Integer potencia(int val1, int val2) {
        return (int) Math.pow(val1, val2);
    }
    
    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")

    
   
    
    
}
