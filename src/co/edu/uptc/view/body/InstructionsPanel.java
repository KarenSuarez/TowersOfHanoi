package co.edu.uptc.view.body;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.constants.TextConstants;
import co.edu.uptc.view.utilities.RoundedButton;

public class InstructionsPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private JLabel title;
	private JLabel instructions;
	private JButton btnReturn;

	public InstructionsPanel() {
		this.setBackground(ColorConstants.LIGHT_BLUE);
		this.setMinimumSize(new Dimension(700, 600));
		this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
		this.initComponents();
	}

	public void initComponents() {
		JLabel empty = new JLabel(TextConstants.EMPTY_TEXT);
		empty.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_65);
		this.add(empty);
		title = new JLabel(TextConstants.TITLE_INTRUCTIONS_TEXT);
		title.setFont(FontConstants.PUCK_BOLD_BOLD_FONT_45);
		this.add(title);

		instructions = new JLabel(TextConstants.INSTRUCTIONS_TEXT);
		instructions.setFont(FontConstants.PUCK_BOLD_PLAIN_FONT_20);
		this.add(instructions);

		btnReturn = new JButton();
		RoundedButton.makeRounded(btnReturn, TextConstants.RETURN_TEXT, 20, ColorConstants.RED,
				ColorConstants.LIGHT_BLUE, Color.WHITE, FontConstants.PUCK_BOLD_BOLD_FONT_20, 160, 50);
		this.add(btnReturn);
	}

}
