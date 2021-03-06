import javax.swing.*;
import java.awt.*;

public class Windows extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8978037719568897634L;

	//定义容器和组件
	private JPanel panel;
	private JPanel pan;
	private JPanel pan2;
	private JPanel pan3;
	static JTextField result_TextField;
	
	/**
	 * 窗口
	 */
    public Windows() {
        super();  //引用父类成分
        
   	    //为JFrame设置属性
   	    this.setSize(350,250);
   	    this.setLayout(new BorderLayout());
        this.setTitle("Calculate");
        //添加容器到FRame里
        this.getContentPane().add(getPanel());
        
    }
    
    /**
     *  容器，布局用
     * @return
     */
    public JPanel getPanel() {
    	    if(panel == null) {
    	    	   
    	    	    panel = new JPanel();
    	    	    
    	    	    if(pan2 == null) {
    	    	    	    //放置文本框和按钮的容器
        	    	    pan2 = new JPanel();
        	    	    //设置容器属性
        	        pan2.setLayout(new BorderLayout());
        	    }
    	    	    
    	    	    if (pan == null) {
        	    	    
    	    	        pan = new JPanel();
    	    	        
    	    	        //设置该容器的布局 4行4列间隔为5像素,pan对象的边距
    	    	        pan.setLayout(new GridLayout(4,4,5,5));
    	            pan.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    	            
        	    }
    	    	    
    	    	    if(pan3 == null) {
    	    	    		pan3 = new JPanel();
    	    	    		
    	    	    		pan3.setLayout(new GridLayout(1,2,5,5));
    	    	    }
    	    	    
    	        
    	    	    setButton();								//调用按钮方法
    	    	    setTextField();
    	    	    
    	    	    panel.add(pan2,BorderLayout.NORTH);		//添加小容器到顶层容器中，完成布局
    	        panel.add(pan,BorderLayout.SOUTH); 
    	        panel.add(pan3,BorderLayout.SOUTH); 
    	    }
    	    return panel;
    }
    
    /**
     * 创建按钮事件对象，对事件进行统一管理
     */
    public void setButton() {
       	
    	    Controller buttonHandler = new Controller();
    	    
    	    //创建按钮，并添加事件
        JButton button0 = new JButton("0");
        button0.addActionListener(buttonHandler);     //添加事件  
        JButton button1 = new JButton("1");
        button1.addActionListener(buttonHandler);        
        JButton button2 = new JButton("2");
        button2.addActionListener(buttonHandler);        
        JButton button3 = new JButton("3");
        button3.addActionListener(buttonHandler);        
        JButton button4 = new JButton("4");
        button4.addActionListener(buttonHandler);       
        JButton button5 = new JButton("5");
        button5.addActionListener(buttonHandler);        
        JButton button6 = new JButton("6");
        button6.addActionListener(buttonHandler);        
        JButton button7 = new JButton("7");
        button7.addActionListener(buttonHandler);        
        JButton button8 = new JButton("8");
        button8.addActionListener(buttonHandler);
        JButton button9 = new JButton("9");   
        button9.addActionListener(buttonHandler);
        
        JButton buttonDot = new JButton(".");
        buttonDot.addActionListener(buttonHandler);        
        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(buttonHandler);        
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(buttonHandler);        
        JButton buttonMultiply = new JButton("*");
        buttonMultiply.addActionListener(buttonHandler);
        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(buttonHandler);
        JButton buttonLeftBracket = new JButton("(");
        buttonLeftBracket.addActionListener(buttonHandler);
        JButton buttonRightBracket = new JButton(")");
        buttonRightBracket.addActionListener(buttonHandler);
        
        //计算按键
        JButton buttonResult = new JButton("=");
        buttonResult.addActionListener(buttonHandler);
        
        //clear 按键
        JButton clearButton = new JButton("Clear");
        clearButton.addActionListener(buttonHandler);
        
        //添加组件到容器里，网格布局
        pan2.add(clearButton,BorderLayout.EAST);
	    pan.add(button7);
        pan.add(button8);
        pan.add(button9);
        pan.add(buttonDivide);
        pan.add(button4);
        pan.add(button5);
        pan.add(button6);
        pan.add(buttonMultiply);
        pan.add(button1);
        pan.add(button2);
        pan.add(button3);
        pan.add(buttonMinus);
        pan.add(buttonDot);
        pan.add(button0);
        pan.add(buttonResult);
        pan.add(buttonPlus);
        
        pan3.add(buttonLeftBracket);
        pan3.add(buttonRightBracket);
    }
    
    /**
     * pan2
     */
    public void setTextField() {
        
        result_TextField = new JTextField("0",19);				//设置文本框的初始值和长度
        result_TextField.setHorizontalAlignment(JTextField.RIGHT);
        
        pan2.add(result_TextField,BorderLayout.WEST);				//添加文本框到pan2容器中
    }
}
