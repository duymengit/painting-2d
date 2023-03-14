package com.menes.project.painting.view;

import java.awt.BorderLayout;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
	
import East.EastFunction;
import North.MenuBar;
import North.ToolBar;

public class Application extends JFrame {
	public static void main(String[] args) {
		new Application();
	}
	ImageIcon icon = new ImageIcon("paint-brush.png"); // creat icon for my program
	MenuBar bar; // creat MenuBar set for Frame
	StatusBar command; // show progress activities status in texts
	DrawingBoard painting; // Area display whatever you drawing
	ToolBar toolBar; // ToolBar of program
	EastFunction colorControl; // show image status 

	// Constructor
	public miniCAD() {
		super("painting-2d"); // set title for program
		
		
		command = new StatusBar();
		painting = new DrawingBoard(command);
		colorControl = new EastFunction(painting); 
		toolBar = new ToolBar(colorControl);
		/*
		 * where add components into frame :
		 * + toolbar
		 * + status image
		 * + status text (command)
		 * + drawing board
		 */
		bar = new MenuBar(toolBar,colorControl);
		setJMenuBar(bar); 
		getContentPane().setLayout(new BorderLayout(1,1));
		getContentPane().add(painting, BorderLayout.CENTER);
		getContentPane().add(colorControl, BorderLayout.EAST);
		getContentPane().add(command, BorderLayout.SOUTH);
		getContentPane().add(toolBar, BorderLayout.NORTH);
		
		
		// set icon for frame title
		setIconImage(icon.getImage());
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		// set size
		setSize(1100, 750);
		//Align program center screen
		setLocationRelativeTo(null);
		// Power

		setVisible(true);
	}

}
