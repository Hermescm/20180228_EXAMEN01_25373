/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


public class FTP extends Protocolo {
  public FTP(Transaccion newTrans) {
		super(newTrans);
		
		System.out.println("Adding TCP Protocol");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza, Mozzarella and then TomatoSauce
	
	
	
	public String getProtocolo(){
		
		return tempTrans.getProtocolo() + ", Protocolo FTP";
		
	}

    public String getFormato(){
		
		return tempTrans.getFormato();
		
	}
	
}