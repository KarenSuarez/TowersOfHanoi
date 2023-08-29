package co.edu.uptc.model;

import java.util.Stack;

public class Towers {

    private Stack<Integer> towerOne;
    private Stack<Integer> towerTwo;
    private Stack<Integer> towerThree;

    public Towers() {
        towerOne = new Stack<Integer>();
        towerTwo = new Stack<Integer>();
        towerThree = new Stack<Integer>();
        initializeTowerOneDisks();
    }

    public void initializeTowerOneDisks() {
        towerOne.push(3);
        towerOne.push(2);
        towerOne.push(1);
    }

    public boolean moveDisk(int selectedDisk, int targetTower) {
        Stack<Integer> sourceTower;
        Stack<Integer> targetTowerStack;

        switch (targetTower) {
            case 1:
                sourceTower = towerTwo;
                targetTowerStack = towerOne;
                break;
            case 2:
                sourceTower = towerTwo;
                targetTowerStack = towerTwo;
                break;
            case 3:
                sourceTower = towerThree;
                targetTowerStack = towerThree;
                break;
            default:
                return false;
        }

        if (targetTowerStack.isEmpty() || selectedDisk < targetTowerStack.peek()) {
            targetTowerStack.push(selectedDisk);
            if (!sourceTower.isEmpty() && sourceTower.peek() == selectedDisk) {
                sourceTower.pop();
            }
            return true;
        }
        
        return false;
    }

    public Stack<Integer> getTowerOne() {
        return towerOne;
    }

    public Stack<Integer> getTowerTwo() {
        return towerTwo;
    }

    public Stack<Integer> getTowerThree() {
        return towerThree;
    }
}
