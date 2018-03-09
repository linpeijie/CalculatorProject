import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 8978037719568897634L;

	//定义容器和组件
	private JPanel panel;
	private JPanel pan;
	private JPanel pan2;
	JTextField result_TextField;
	String result;
	
    public Windows() {
        super();  //引用父类成分
        
   	    //为JFrame设置属性
   	    this.setSize(350,250);
   	    this.setLayout(new BorderLayout());
        this.setTitle("Calculate");
        //添加容器到FRame里
        this.getContentPane().add(getPanel());
        
    }
    
    public JPanel getPanel() {
    	    if(panel == null) {
    	    	    //大容器，布局用
    	    	    panel = new JPanel();
    	    	    
    	    	    if(pan2 == null) {
    	    	    	    //放置文本框和按钮的容器
        	    	    pan2 = new JPanel();
        	    	    //设置容器属性
        	        pan2.setLayout(new BorderLayout());
        	    }
    	    	    
    	    	    if (pan == null) {
        	    	    //放置按钮的容器
    	    	        pan = new JPanel();
    	    	        //设置该容器的布局 4行4列间隔为5像素
    	    	        pan.setLayout(new GridLayout(4,4,5,5));
    	            //设置pan对象的边距
    	            pan.setBorder(BorderFactory.createEmptyBorder(5,5,5,5));
    	            
        	    }
    	    	    
    	        //调用按钮方法
    	    	    setButton();
    	    	    setTextField();
    	    	    //添加小容器到顶层容器中，完成布局
    	    	    panel.add(pan2,BorderLayout.NORTH);
    	        panel.add(pan,BorderLayout.SOUTH); 	        
    	    }
    	    return panel;
    }
    
    public void setButton() {
       	//数字按钮
        JButton button0 = new JButton("0");
        button0.addActionListener(new ActionListener() {  //设置点击事件
        	    public void actionPerformed(ActionEvent e) {
        	    	    result += "0"; 
        	    	    result_TextField.setText(result);
        	    }
        });
        
        JButton button1 = new JButton("1");
        button1.addActionListener(new ActionListener() {
    	        public void actionPerformed(ActionEvent e) {
    	        	    result += "1";
    	    	        result_TextField.setText(result);
    	        }
        });
        
        JButton button2 = new JButton("2");
        button2.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "2";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button3 = new JButton("3");
        button3.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "3";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button4 = new JButton("4");
        button4.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "4";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button5 = new JButton("5");
        button5.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "5";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button6 = new JButton("6");
        button6.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "6";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button7 = new JButton("7");
        button7.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "7";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button8 = new JButton("8");
        button8.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "8";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton button9 = new JButton("9");   
        button9.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "9";
	    	        result_TextField.setText(result);
	        }
        });
        
        //加减乘除按键
        JButton buttonDot = new JButton(".");
        buttonDot.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += ".";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton buttonPlus = new JButton("+");
        buttonPlus.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "+";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton buttonMinus = new JButton("-");
        buttonMinus.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "-";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton buttonMultiply = new JButton("x");
        buttonMultiply.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "x";
	    	        result_TextField.setText(result);
	        }
        });
        
        JButton buttonDivide = new JButton("/");
        buttonDivide.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "/";
	    	        result_TextField.setText(result);
	        }
        });
        
        //计算按键
        JButton buttonResult = new JButton("=");
        buttonResult.addActionListener(new ActionListener() {
	        public void actionPerformed(ActionEvent e) {
	        	    result += "=";
	    	        result_TextField.setText(result);
	        }
        });
        
        //clear 按键
        JButton clear_Button = new JButton("Clear");
        
        //添加组件到容器里，网格布局
        pan2.add(clear_Button,BorderLayout.EAST);
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
        
    }
    
    public void setTextField() {
       	//文本框和按钮
        result = "";
        //设置文本框的初始值和长度
        result_TextField = new JTextField(result,19);
        //添加文本框到pan2容器中
        pan2.add(result_TextField,BorderLayout.WEST);
    }
}
