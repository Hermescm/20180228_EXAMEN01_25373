/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen;


import java.util.ArrayList;
import java.util.Observer;

// Uses the Subject interface to update all Observers

public class Cuenta implements IBanco{
	
	private ArrayList<Observer> observers;
	private double Transaccion;
	private double Disposicion;
	
	public Cuenta(){
		
		// Creates an ArrayList to hold all observers
		
		observers = new ArrayList<Observer>();
	}
	
	

    @Override
    public void update(double ibmPrice, double aaplPrice, double googPrice) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	
}