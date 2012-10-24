package gui;

import javax.swing.JFrame;

public class MainFrame extends JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
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
