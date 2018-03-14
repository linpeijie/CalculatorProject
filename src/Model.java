
public class Model {	
	
	public Model(String result) {
		
	}
	
	/**
	 * 将计算结果打印到文本框内
	 * @param buttonName
	 */
	public void printTextField(String buttonName) {
		if(buttonName.equals("Clear")) {
			Controller.result = "0";
		} else {
			if(Controller.result.charAt(0) == '0' && Controller.result.length() == 1) //判断第一个数字是否是0
				Controller.result = "";
			
			Controller.result += buttonName;
		}	
		
		Windows.result_TextField.setText(Controller.result);
	}
	
	/**
	 * 进行算术运算
	 * @param result
	 */
	@SuppressWarnings("static-access")
	public void cal(String result) {
		
		Calculate calculate = new Calculate();
		
		float cResult = calculate.evaluate(result);
		
		String s = "";
		s += cResult;
		
		Windows.result_TextField.setText(s);
		Controller.result = "0";
	}
	
}
