package co.edu.uptc;

import co.edu.uptc.model.Towers;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Towers towers = new Towers();
        Scanner scanner = new Scanner(System.in);

        while (!isGameFinished(towers)) {
            displayTowers(towers);
            System.out.print("Enter source tower (1, 2, 3) or 0 to quit: ");
            int sourceTower = scanner.nextInt();

            if (sourceTower == 0) {
                System.out.println("Game over. Goodbye!");
                break;
            }

            System.out.print("Enter target tower (1, 2, 3): ");
            int targetTower = scanner.nextInt();

            if (towers.moveDisk(getTopDisk(towers, sourceTower), targetTower)) {
                System.out.println("Disk moved successfully.");
            } else {
                System.out.println("Invalid move. Try again.");
            }
        }
    }

    private static void displayTowers(Towers towers) {
        System.out.println("Tower 1: " + towers.getTowerOne());
        System.out.println("Tower 2: " + towers.getTowerTwo());
        System.out.println("Tower 3: " + towers.getTowerThree());
    }

    private static int getTopDisk(Towers towers, int towerNumber) {
        Stack<Integer> tower = null;
        switch (towerNumber) {
            case 1:
                tower = towers.getTowerOne();
                break;
            case 2:
                tower = towers.getTowerTwo();
                break;
            case 3:
                tower = towers.getTowerThree();
                break;
        }
        return tower != null && !tower.isEmpty() ? tower.peek() : -1;
    }

    private static boolean isGameFinished(Towers towers) {
        return towers.getTowerOne().isEmpty() && towers.getTowerTwo().isEmpty();
    }
}
