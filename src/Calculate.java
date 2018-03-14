import java.util.Stack;

public class Calculate {  
	/** 
     * 计算后缀表达式
     */ 
    public static float evaluate(String expression) {  
    		char[] tokens = expression.toCharArray();  
  
    		Stack<Float> stackOfNum = new Stack<Float>();  
  
    		Stack<Character> stackOfOps = new Stack<Character>();  
  
    		for (int i = 0; i < tokens.length; i++) {  
  
    			if (tokens[i] == ' ')  
    				continue;  
  
    			if (tokens[i] >= '0' && tokens[i] <= '9') {  
    				StringBuffer sbuf = new StringBuffer();  
  
    				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') {  
    					sbuf.append(tokens[i++]);  
    				}  
    				
    				i--; // 回退一位  
    				
    				stackOfNum.push(Float.parseFloat(sbuf.toString()));  
    				
    			} else if (tokens[i] == '(' ) {
    				
    				stackOfOps.push(tokens[i]);
    				
    			} else if (tokens[i] == ')') { 
    				
    				while (stackOfOps.peek() != '(')  
    					stackOfNum.push(caculate(stackOfOps.pop(), stackOfNum.pop(), stackOfNum.pop())); 
    				
    				stackOfOps.pop();  
    				
    			} else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/') { 
    				
    				while (!stackOfOps.empty() && hasPrecedence(tokens[i], stackOfOps.peek()))  
    					stackOfNum.push(caculate(stackOfOps.pop(), stackOfNum.pop(), stackOfNum.pop()));  
    				
    				stackOfOps.push(tokens[i]);  
    			}  
    		}  
  
    		while (!stackOfOps.empty())  
    			stackOfNum.push(caculate(stackOfOps.pop(), stackOfNum.pop(), stackOfNum.pop()));  
  
    		return stackOfNum.pop();  
    }  
  
    /** 
     * 比较运算符等级 
     */ 
    public static boolean hasPrecedence(char op1, char op2) {  
    		if (op2 == '(' || op2 == ')')  
    			return false;  
    		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))  
    			return false;  
    		else  
    			return true;  
    }  

    /** 
     * 四则运算 
     */ 
    public static float caculate(char op, float b, float a) {  
    		switch (op) {  
    		
    		case '+':  
    			return a + b;  	
    		case '-':  
    			return a - b;  
    		case '*':  
    			return a * b;  
    		case '/':  
    			if (b == 0) {  
    				throw new UnsupportedOperationException("Cannot divide by zero");  
    			}
    			return a / b;  
    		}  
    		
    		return 0;  
    }  
}  