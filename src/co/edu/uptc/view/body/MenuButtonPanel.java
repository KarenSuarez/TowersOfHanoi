package co.edu.uptc.view.body;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;
import co.edu.uptc.view.utilities.RoundedButton;

public class MenuButtonPanel extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

    private JButton btnPlay;
    private JButton btnInstructions;
    private JButton btnAboutUs;

    public MenuButtonPanel() {
		this.setBackground(ColorConstants.LIGHT_BLUE);
        this.setLayout(new GridBagLayout());
        this.initComponents();
    }

    public void initComponents() {
        btnPlay = new JButton();
        btnInstructions = new JButton();
        btnAboutUs = new JButton(); 
        
		RoundedButton.makeRounded(btnPlay, "     Play     ", 20, ColorConstants.RED, ColorConstants.LIGHT_BLUE, Color.WHITE,
				FontConstants.PUCK_BOLD_BOLD_FONT_30, 450, 80);

		RoundedButton.makeRounded(btnInstructions, "     Instructions     ", 20, ColorConstants.YELLOW, ColorConstants.LIGHT_BLUE,
				Color.WHITE, FontConstants.PUCK_BOLD_BOLD_FONT_30, 600, 80);
		
		RoundedButton.makeRounded(btnAboutUs, "           About Us            ", 20, ColorConstants.PURPLE, ColorConstants.LIGHT_BLUE,
				Color.WHITE, FontConstants.PUCK_BOLD_BOLD_FONT_30, 800, 80);


        GridBagConstraints gbcPlay = new GridBagConstraints();
        gbcPlay.gridx = 0;
        gbcPlay.gridy = 0;
        gbcPlay.anchor = GridBagConstraints.PAGE_START;
        this.add(btnPlay, gbcPlay);

        GridBagConstraints gbcInstructions = new GridBagConstraints();
        gbcInstructions.gridx = 0;
        gbcInstructions.gridy = 2;
        gbcInstructions.insets.top = 2;
        this.add(btnInstructions, gbcInstructions);
        
        GridBagConstraints gbcAboutUs = new GridBagConstraints();
        gbcAboutUs.gridx = 0;
        gbcAboutUs.gridy = 4;
        gbcAboutUs.insets.top = 2;
        this.add(btnAboutUs, gbcAboutUs);
    }

}
