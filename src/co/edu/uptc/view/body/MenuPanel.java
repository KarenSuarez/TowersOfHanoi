package co.edu.uptc.view.body;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;

import co.edu.uptc.view.constants.ColorConstants;
import co.edu.uptc.view.constants.FontConstants;

public class MenuPanel extends JPanel {
    private static final long serialVersionUID = 1L;

    private JLabel title;
    private MenuButtonPanel menuButtonPanel;

    public MenuPanel() {
        this.setBackground(ColorConstants.LIGHT_BLUE);
        this.setLayout(new GridBagLayout());
        this.initComponents();
    }

    public void initComponents() {
        GridBagConstraints gbcTitle = new GridBagConstraints();
        gbcTitle.gridx = 0;
        gbcTitle.gridy = 0;
        gbcTitle.weighty = 0.5; 
        gbcTitle.anchor = GridBagConstraints.CENTER;
        title = new JLabel("Towers Of Hanoi");
        title.setFont(FontConstants.PUCK_BOLD_BOLD_FONT_65);
        title.setForeground(Color.WHITE);
        this.add(title, gbcTitle);

        GridBagConstraints gbcButtonPanel = new GridBagConstraints();
        gbcButtonPanel.gridx = 0;
        gbcButtonPanel.gridy = 1;
        gbcButtonPanel.weighty = 0.5;
        gbcButtonPanel.anchor = GridBagConstraints.CENTER;
        menuButtonPanel = new MenuButtonPanel();
        this.add(menuButtonPanel, gbcButtonPanel);
    }
}
