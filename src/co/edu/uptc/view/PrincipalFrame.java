package co.edu.uptc.view;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import co.edu.uptc.view.body.MenuPanel;
import co.edu.uptc.view.constants.ImagePathConstants;
import co.edu.uptc.view.utilities.SourcesUtilities;

public class PrincipalFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private MenuPanel menuPanel;

    public PrincipalFrame() {
    	
    	super("Towers of Hanoi");
		this.setSize(850,650);
		this.setIconImage(SourcesUtilities.imageResize(ImagePathConstants.TOWER_HANOI_ICON_URL, 200, 200));
        this.setLayout(new GridBagLayout());
        this.initComponents();
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void initComponents() {
        menuPanel = new MenuPanel();
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.weighty = 1.0; 
        gbc.anchor = GridBagConstraints.CENTER;
        this.add(menuPanel, gbc);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new PrincipalFrame();
        });
    }
}
