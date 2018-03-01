/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


public class JSON extends Formato {
    
  public JSON(Transaccion newTrans) {
		super(newTrans);
		
		System.out.println("Adding JSON Format");
	}
	
	// Returns the result of calling getDescription() for
	// PlainPizza, Mozzarella and then TomatoSauce
	
	
	
	public String getFormato(){
		
		return tempTrans.getFormato() + ", Formato JSON";
		
	}

    public String getProtocolo(){
		
		return tempTrans.getProtocolo() ;
		
	}

   
	
}