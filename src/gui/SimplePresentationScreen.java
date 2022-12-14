package gui;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import entities.Student;
import javax.swing.JTabbedPane;
import javax.swing.*;
import java.awt.Color;
import java.awt.SystemColor;

@SuppressWarnings("serial")
public class SimplePresentationScreen extends JFrame {

	private JPanel contentPane;
	private JPanel tabInformation;
	private JTabbedPane tabbedPane;
	private Student studentData;


	public SimplePresentationScreen( Student studentData ) {
		setResizable(false);
		this.studentData = studentData;
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		
		setIconImage(new ImageIcon(getClass().getResource("/images/tdp.png")).getImage());
		setTitle("TdP-DCIC-UNS 2021 :: Pantalla de presentacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(new Dimension(615, 250));
		setContentPane(contentPane);
		
		init();
	}
	
	private void init() {
		contentPane.setLayout(null);
		// Tabbed Pane to student personal data
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(5, 5, 430, 174);
		tabInformation = new JPanel();
		tabInformation.setPreferredSize(new Dimension(425, 275));
		tabbedPane.addTab("Informacion del alumno", null, tabInformation, "Muestra la informacion declarada por el alumno");
		tabInformation.setLayout(null);
		
		JLabel labelLU = new JLabel("LU:");
		labelLU.setBounds(10, 22, 70, 14);
		tabInformation.add(labelLU);
		
		JLabel labelApellido = new JLabel("Apellido: ");
		labelApellido.setBounds(10, 47, 70, 14);
		tabInformation.add(labelApellido);
		
		JLabel labelNombre = new JLabel("Nombre:");
		labelNombre.setBounds(10, 72, 70, 14);
		tabInformation.add(labelNombre);
		
		JLabel labelEmail = new JLabel("Email:");
		labelEmail.setBounds(10, 97, 70, 14);
		tabInformation.add(labelEmail);
		
		JLabel labelGithub = new JLabel("Github URL:");
		labelGithub.setBounds(10, 122, 70, 14);
		tabInformation.add(labelGithub);
		
		JTextPane studentID = new JTextPane();
		studentID .setText(String.valueOf(studentData.getId()));
		studentID .setBounds(90, 16, 325, 20);
		tabInformation.add(studentID);
		
		JTextPane studentLastname = new JTextPane();
		studentLastname.setText(studentData.getLastName());
		studentLastname.setBounds(90, 41, 325, 20);
		tabInformation.add(studentLastname);
		
		JTextPane studentName = new JTextPane();
		studentName.setText(studentData.getFirstName());
		studentName.setBounds(90, 66, 325, 20);
		tabInformation.add(studentName);
		
		JTextPane emailinfo = new JTextPane();
		emailinfo.setText(studentData.getMail());
		emailinfo.setBounds(90, 91, 325, 20);
		tabInformation.add(emailinfo);
		
		JTextPane github = new JTextPane();
		github.setText(studentData.getGithubURL());
		github.setBounds(90, 116, 325, 20);
		tabInformation.add(github);
		contentPane.add(tabbedPane);
		
		JLabel lblNewLabel_5 = new JLabel(new ImageIcon(getClass().getResource(studentData.getPathPhoto())));
		lblNewLabel_5.setBounds(445, 26, 144, 174);
		contentPane.add(lblNewLabel_5);
		
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println(dtf.format(now));  
		
		JTextPane curretHour = new JTextPane();
		curretHour.setBackground(SystemColor.menu);
		curretHour.setText("Esta ventana fue generada en esta fecha: "+dtf.format(now));
		curretHour.setBounds(5, 191, 430, 20);
		contentPane.add(curretHour);
	}
}
