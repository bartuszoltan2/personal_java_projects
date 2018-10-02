package templateMethod;

import java.awt.Graphics;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4047656682823103324L;

	public MyFrame(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		setSize(500, 300);
		this.setResizable(true);
		this.setVisible(true);
	}

	public void paint(Graphics graphics) {
		super.paint(graphics);
		String msg = "I rule!";
		graphics.drawString(msg, 250, 150);
	}

	public static void main(String[] args) {
		MyFrame myFrame = new MyFrame("Head first design pattern");
	}

}
