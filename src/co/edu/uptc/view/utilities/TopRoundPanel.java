package co.edu.uptc.view.utilities;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JPanel;

public class TopRoundPanel extends JPanel {
	private static final long serialVersionUID = 1L;
	private Color backgroundColor;

	public TopRoundPanel(Color backgroundColor) {
		this.backgroundColor = backgroundColor;
		setOpaque(false);
	}

	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g.create();
		g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g2d.setColor(backgroundColor);
		g2d.fillRoundRect(0, 0, getWidth(), getHeight(), 40, 40);
		g2d.fillRect(0, getHeight() / 2, getWidth(), getHeight() / 2);
		g2d.dispose();
	}

	@Override
	public Insets getInsets() {
		return new Insets(10, 10, 0, 10);
	}
}
