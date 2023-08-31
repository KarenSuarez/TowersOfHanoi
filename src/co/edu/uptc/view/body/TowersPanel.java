package co.edu.uptc.view.body;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Stack;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import co.edu.uptc.model.Towers;

public class TowersPanel extends JPanel {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Towers game;
    private JButton moveButton;
    private JComboBox<String> levelComboBox;
    private JComboBox<String> sourceComboBox;
    private JComboBox<String> destinationComboBox;
    private JTextArea towersTextArea;

    public TowersPanel() {
    	this.setMinimumSize(new Dimension(500, 400));
    	initComponents();
    }

    private void initComponents() {
        moveButton = new JButton("Mover disco");
        levelComboBox = new JComboBox<>(new String[]{
            "Beginners", "Novice", "Intermediate", "Advanced", "Expert", "Master"
        });
        sourceComboBox = new JComboBox<>(new String[]{"A", "B", "C"});
        destinationComboBox = new JComboBox<>(new String[]{"A", "B", "C"});

        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Nivel: "));
        controlPanel.add(levelComboBox);
        controlPanel.add(new JLabel("Desde: "));
        controlPanel.add(sourceComboBox);
        controlPanel.add(new JLabel("a"));
        controlPanel.add(destinationComboBox);
        controlPanel.add(moveButton);
        add(controlPanel, BorderLayout.NORTH);

        towersTextArea = new JTextArea();
        towersTextArea.setEditable(false);
        add(new JScrollPane(towersTextArea), BorderLayout.CENTER);

        levelComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedLevel = levelComboBox.getSelectedItem().toString();
                int numDiscs = getNumDiscsForLevel(selectedLevel);
                game = new Towers(numDiscs);
                updateTowersTextArea();
            }
        });

        moveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String source = sourceComboBox.getSelectedItem().toString();
                String destination = destinationComboBox.getSelectedItem().toString();

                if (game.moveDisk(getTowerFromLetter(source), getTowerFromLetter(destination))) {
                    updateTowersTextArea();
                    if (game.won()) {
                        JOptionPane.showMessageDialog(TowersPanel.this, "¡Has ganado!");
                    }
                } else {
                    JOptionPane.showMessageDialog(TowersPanel.this, "Movimiento no válido.");
                }
            }
        });
    }

    private void updateTowersTextArea() {
        towersTextArea.setText(
                "Torre A: " + game.getTowerA() + "\n" +
                        "Torre B: " + game.getTowerB() + "\n" +
                        "Torre C: " + game.getTowerC()
        );
    }

    private Stack<Integer> getTowerFromLetter(String letter) {
        switch (letter) {
            case "A":
                return game.getTowerA();
            case "B":
                return game.getTowerB();
            case "C":
                return game.getTowerC();
            default:
                throw new IllegalArgumentException("Letra de torre no válida: " + letter);
        }
    }

    private int getNumDiscsForLevel(String level) {
        switch (level) {
            case "Beginners":
                return 3;
            case "Novice":
                return 4;
            case "Intermediate":
                return 6;
            case "Advanced":
                return 7;
            case "Expert":
                return 9;
            case "Master":
                return 10;
            default:
                throw new IllegalArgumentException("Nivel no válido: " + level);
        }
    }
}
