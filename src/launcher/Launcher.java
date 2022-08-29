package launcher;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimplePresentationScreen frame = new SimplePresentationScreen(new Student(132735, "Massiris", "Daniel", "danielmassiris10@gmail.com", "https://github.com/ItsMassi", "C:\\Users\\massi\\Documents\\GitHub\\tdp-proyecto-1\\src\\images\\DanielM.jpg"));
                frame.setVisible(true);
            }
        });
    }
}