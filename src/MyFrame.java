import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class MyFrame extends JFrame implements KeyListener{

	
	JLabel label;
	ImageIcon icon;
	
	MyFrame(){		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(700,700);
		this.setTitle("FTC_Robo");
		this.setLayout(null);
		this.addKeyListener(this);
		
		icon = new ImageIcon("FTCRobo.gif");
		
		label = new JLabel();
		label.setBounds(0, 0, 50, 50);
		label.setIcon(icon);
		//label.setBackground(Color.red);
		//label.setOpaque(true);
		this.getContentPane().setBackground(Color.white);
		this.add(label);
		this.setVisible(true);
	}

	@Override
	public void keyTyped(KeyEvent e) {
		//keyTyped = Invoked when a key is typed. Uses KeyChar, char output
		switch(e.getKeyChar()) {
			case 'a': label.setLocation(label.getX()-10, label.getY());
				break;
			case 'w': label.setLocation(label.getX(), label.getY()-10);
				break;
			case 's': label.setLocation(label.getX(), label.getY()+10);
				break;
			case 'd': label.setLocation(label.getX()+10, label.getY());
				break;

		}
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		//keyPressed = Invoked when a physical key is pressed down. Uses KeyCode, int output
		/*switch(e.getKeyChar()) {
		case 'a': label.setLocation(label.getX()-10, label.getY()+90);
			break;
		case 'w': label.setLocation(label.getX(), label.getY()-10);
			break;
		case 's': label.setLocation(label.getX(), label.getY()+10);
			break;
		case 'd': label.setLocation(label.getX()+10, label.getY());
			break;
	}*/
	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		//keyReleased = called whenever a button is released
	}
}