package gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	public static MainFrame main;
	
	public static MainFrame getMainFrame(){
		
		if(main == null){
			
			return new MainFrame();
		}
		
		return main;
	}
	
	private MainFrame(){
		
		
	}

}
