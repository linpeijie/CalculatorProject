import java.awt.event.*;

public class Controller implements ActionListener{
	
	static String result = "0";
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
				
		Model model = new Model(null);					//调用Model层
		
		String buttonName = arg0.getActionCommand();		//获取按钮名称

		if( buttonName.equals("=") ) {					//向Model层传送数据
			model.cal(result);
		} else {
			model.printTextField(buttonName);
		}
			
	}

}
