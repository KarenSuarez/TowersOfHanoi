package co.edu.uptc.model;

import java.util.Stack;

public class Towers {
    private Stack<Integer> towerA = new Stack<>();
    private Stack<Integer> towerB = new Stack<>();
    private Stack<Integer> towerC = new Stack<>();
    private int numDiscs;

    public Towers(int numDiscs) {
        this.numDiscs = numDiscs;
        for (int i = numDiscs; i > 0; i--) {
            towerA.push(i);
        }
    }

    public Stack<Integer> getTowerA() {
        return towerA;
    }

    public Stack<Integer> getTowerB() {
        return towerB;
    }

    public Stack<Integer> getTowerC() {
        return towerC;
    }

    public boolean moveDisk(Stack<Integer> source, Stack<Integer> destination) {
        if (source.isEmpty() || (!destination.isEmpty() && source.peek() > destination.peek())) {
            return false;
        }
        
        destination.push(source.pop());
        return true;
    }

    public boolean won() {
        return towerA.isEmpty() && towerB.isEmpty() && towerC.size() == numDiscs;
    }
    
    
}