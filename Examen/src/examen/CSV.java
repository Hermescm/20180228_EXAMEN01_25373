/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


public class CSV extends Formato {
    
  public CSV(Transaccion newTrans) {
		super(newTrans);
		
		System.out.println("Adding CSV Format");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza, Mozzarella and then TomatoSauce
	
	
	
	public String getFormato(){
		
		return tempTrans.getFormato() + ", Formato CSV";
		
	}

    public String getProtocolo(){
		
		return tempTrans.getProtocolo() ;
		
	}

   
	
}