import java.awt.event.*;

public class Controller implements ActionListener{
	
	static String result = "";
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//调用Model层
		Model model = new Model(null);
		
		//获取按钮名称
		String buttonName = arg0.getActionCommand();
		
		//向Model层传送数据
		if( buttonName.equals("=") ) {
			model.printTextField(buttonName);
			model.cal(result);
		} else {
			model.printTextField(buttonName);
		}
			
	}

}
