import java.awt.event.*;

public class Controller implements ActionListener{
	
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
		//获取按钮名称
		String buttonName = arg0.getActionCommand();
		//不同按钮执行不同功能
		switch (buttonName) {
		case "0" :
			Windows.result += "0";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "1" :
			Windows.result += "1";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "2" :
			Windows.result += "2";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "3" :
			Windows.result += "3";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "4" :
			Windows.result += "4";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "5" :
			Windows.result += "5";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "6" :
			Windows.result += "6";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "7" :
			Windows.result += "7";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "8" :
			Windows.result += "8";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "9" :
			Windows.result += "9";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "." :
			Windows.result += ".";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "+" :
			Windows.result += "+";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "-" :
			Windows.result += "-";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "x" :
			Windows.result += "x";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "/" :
			Windows.result += "/";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "=" :
			Windows.result += "=";
			Windows.result_TextField.setText(Windows.result);
			break;
		case "Clear" :
			Windows.result = "";
			Windows.result_TextField.setText(Windows.result);
		}
			
	}

}
