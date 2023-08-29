package co.edu.uptc.controller;

import java.util.Scanner;
import java.util.Stack;

import co.edu.uptc.model.Towers;
import co.edu.uptc.view.PrincipalFrame;

public class Controller {
	private PrincipalFrame frontend;
	
	 public Controller() {
	        towers = new Towers();
	        towerOneController = towers.getTowerOne(); // Initialize towerOneController
	        towerTwoController = towers.getTowerTwo(); // Initialize towerTwoController
	        towerThreeController = towers.getTowerThree(); // Initialize towerThreeController
	       // frontend = new PrincipalFrame(); // Pass the controller instance to the frame
	    }
	
	public PrincipalFrame getFrontend() {
		return frontend;
	}
	
	private Stack<Integer> towerOneController; 
	private Stack<Integer> towerTwoController;
	private Stack<Integer> towerThreeController;
	private Towers towers;

	

	public boolean compareDisks(int selectedDisk, int numberTower) {
		return towers.moveDisk(selectedDisk, numberTower);
	}

	public Stack<Integer> getTowerOneController() {
		return towerOneController;
	}

	public Stack<Integer> getTowerTwoController() {
		return towerTwoController;
	}

	public Stack<Integer> getTowerThreeController() {
		return towerThreeController;
	}

	public static void main(String[] args) {
		new Controller();
	}
	
}
