package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;

import co.edu.uptc.view.body.InstructionsPanel;
import co.edu.uptc.view.body.MenuPanel;
import co.edu.uptc.view.body.TowersPanel;
import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.ImagePathConstants;
import co.edu.uptc.view.constants.TextConstants;
import co.edu.uptc.view.utilities.SourcesUtilities;

public class PrincipalFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MenuPanel menuPanel;

    public PrincipalFrame() {
    	
    	super(TextConstants.TITLE_TEXT);
		this.setSize(850,650);
		this.getContentPane().setBackground(ColorConstants.LIGHT_BLUE);
		this.setIconImage(SourcesUtilities.imageResize(ImagePathConstants.TOWER_HANOI_ICON_URL, 200, 200));
        this.initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initComponents() {
    	this.setLayout(new GridBagLayout());
        menuPanel = new MenuPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0; 
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(menuPanel, gbc);
    }
    
    public void showTowersPanel() {
        this.getContentPane().removeAll();
        TowersPanel towersPanel = new TowersPanel();
        this.add(towersPanel);
        this.revalidate(); 
        this.repaint(); 
    }

	public void showInstructionsPanel() {
		this.getContentPane().removeAll();
        InstructionsPanel instructionsPanel = new InstructionsPanel();
        this.add(instructionsPanel);
        this.revalidate(); 
        this.repaint(); 
	}

}
