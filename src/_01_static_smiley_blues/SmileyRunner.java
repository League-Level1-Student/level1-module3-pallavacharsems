package _01_static_smiley_blues;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class SmileyRunner {
	public static void main(String[] args) {
		// 1. Make a new JFrame and set it to be visible
		JFrame frame = new JFrame();
		frame.setVisible(true);
		// Set your frame's default close operation to JFrame.EXIT_ON_CLOSE
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 2. Make a new JPanel
		JPanel panel = new JPanel();
		// 3. Add your panel to your frame
		frame.add(panel);
		// 7. Set the Smiley class's color variable to Smiley.YELLOW (NOT a specific
		// smiley object's!)
		// Run it again; are your Smileys all yellow now? Also try changing them to red
		// or green!
		Smiley.color = Smiley.YELLOW;
		// 4. Make three Smiley objects and add them to your panel
		Smiley smiley = new Smiley();
		Smiley bob = new Smiley();
		Smiley Zadliut = new Smiley();
		panel.add(Zadliut);
		panel.add(bob);
		panel.add(smiley);
		// 5. Pack your frame
		frame.pack();
		// 6. Run the program and make sure you see three blue Smileys!
	}
}
