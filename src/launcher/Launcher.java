package launcher;

import java.io.File;

import javax.swing.ImageIcon;

import entities.Student;
import gui.SimplePresentationScreen;

public class Launcher {
	public static void main(String [] args) {
        //Schedule a job for the event-dispatching thread:
        //creating and showing this application's GUI.
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                SimplePresentationScreen frame = new SimplePresentationScreen(new Student(132735, "Massiris", "Daniel", "danielmassiris10@gmail.com","https://github.com/ItsMassi", "/images/DanielM.jpg")); //buscar como usar la ruta relativa en java para una imagen
                frame.setVisible(true);
            }
        });
    }
}