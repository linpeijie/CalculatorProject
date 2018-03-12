
public class Model {
	private String result;
	
	public Model(String result) {
		this.result = result;
		
	}
	
	public void cal() {
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
	}

}
