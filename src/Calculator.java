import javax.swing.UIManager;

public class Calculator {	
    public static void main(String[] args) {       
    		try {
    			UIManager.setLookAndFeel("com.sun.java.swing.plaf.mac.MacLookAndFeel");
    		} catch(Exception e) {
    			e.printStackTrace();
    		}
    		
    	 	Windows windows = new Windows();
            //运行窗体
            
        windows.setVisible(true);
   
    }   
}
