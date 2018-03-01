/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

/**
 *
 * @author Hermes
 */
public abstract class Formato implements Transaccion {
    protected Transaccion tempTrans;
    
    public Formato(Transaccion newTransaccion){
		
		tempTrans = newTransaccion;
		
	}
	
	public String getFormato() {
		
		return tempTrans.getFormato();
	}

	
	
}
    

