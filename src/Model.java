
public class Model {
	//判断是否重复输入‘＝’
	private String pre;			
	
	public Model(String result) {
		
	}
	
	public void printTextField(String buttonName) {
		//将计算结果打印到文本框内
		if(buttonName.equals("Clear")) {
			Controller.result = "";
		} else {
			int t = Controller.result.length();
			
			//判断是否重复输入运算符号
			if( t > 1) {
				pre = Controller.result;	
				char ch1 = Controller.result.charAt(t-1);
				char ch2 = buttonName.charAt(0);
				
				//重复输入运算符号则不做处理
				if((ch1 >= '0' && ch1 <= '9') || (ch2 >= '0' && ch2 <= '9'))
					Controller.result += buttonName;
				
				//若没有计算就输入'='，则原式不变
				if(ch2 == '=' && ch2 == Controller.result.charAt(t-3))
					Controller.result = pre;
				
			} else {
				Controller.result += buttonName;
			}
		}	
		
		Windows.result_TextField.setText(Controller.result);
	}
	
	public void cal(String result) {
		//进行算术运算
		if(!result.equals(pre)) {								
			char[] ch = new char[20];
			int sum = 0;
			
			for(int i = 0; i < result.length(); i++) {
				ch[i] = result.charAt(i);
			}
			
			sum = ch[0] - '0';
			for(int i = 1; i < result.length(); i++) {
				switch(ch[i]) {
				case '+':
					sum += ch[i+1]-'0';
					break;
				case '-':
					sum -= ch[i+1]-'0';
					break;
				case 'x':
					sum *= ch[i+1]-'0';
					break;
				case '/':
					sum /= ch[i+1]-'0';
					break;
				case '=':
					break;
				}
			}
			
			result += sum;
			Windows.result_TextField.setText(result);
			Controller.result += sum;

		}
	
	}

}
