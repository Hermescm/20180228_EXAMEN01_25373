/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;

// Implements the Pizza interface with only the required
// methods from the interface

// Every Pizza made will start as a PlainPizza

public class TransaccionProceso implements Transaccion {
 
	public String getDescription() {
		
		return "Thin dough";
	
	}

	public double getCost() {

		System.out.println("Cost of Dough: " + 4.00);
		
		return 4.00;
	
	}

    @Override
    public String getFormato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getProtocolo() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
}