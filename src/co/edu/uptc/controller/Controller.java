package co.edu.uptc.controller;

import co.edu.uptc.view.PrincipalFrame;

public class Controller {
	private PrincipalFrame frontend;
	
	 public Controller() {
	     frontend = new PrincipalFrame();
	    }
	
	public PrincipalFrame getFrontend() {
		return frontend;
	}


	public static void main(String[] args) {
		new Controller();
	}
	
}
