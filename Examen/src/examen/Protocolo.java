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
public abstract class Protocolo implements Transaccion {
    protected Transaccion tempTrans;
    
    public Protocolo(Transaccion newTransaccion){
		
		tempTrans = newTransaccion;
		
	}
	
	

	public String getProtocolo() {
		
		return tempTrans.getProtocolo();
		
	}
	
}
    

