package pj;


import java.awt.*;  
import javax.swing.*;



import java.awt.event.*;  
public class Puzzle_H extends JFrame implements ActionListener{  
JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,next;
JLabel CounterLabel;

Timer timer;
int second;
int minute;
Font font1 = new Font("Arial", Font.PLAIN,30);
public Puzzle_H(){  

super("Puzzle Game - JavaTpoint");  
 b1=new JButton("1");  
 b2=new JButton(" ");  
 b3=new JButton("3");  
 b4=new JButton("4");  
 b5=new JButton("5");  
 b6=new JButton("6");  
 b7=new JButton("7");  
 b8=new JButton("8");  
 b9=new JButton("9");
 b10=new JButton("10");
 b11=new JButton("11");
 b12=new JButton("12");
 b13=new JButton("13");
 b14=new JButton("14");
 b15=new JButton("15");
 b16=new JButton("2");

 next=new JButton("next");  
  
b1.setBounds(10,30,50,40);  
b2.setBounds(70,30,50,40);  
b3.setBounds(130,30,50,40);  
b4.setBounds(190,30,50,40);

b5.setBounds(10,80,50,40);  
b6.setBounds(70,80,50,40);  
b7.setBounds(130,80,50,40);  
b8.setBounds(190,80,50,40); 

b9.setBounds(10,130,50,40); 
b10.setBounds(70,130,50,40);  
b11.setBounds(130,130,50,40); 
b12.setBounds (190,130,50,40);

b13.setBounds(10,180,50,40);  
b14.setBounds (70,180,50,40); 
b15.setBounds(130,180,50,40); 
b16.setBounds(190,180,50,40);  


next.setBounds(70,250,100,40);  
    
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);
add(b11);add(b12);add(b13);add(b14);add(b15);add(b15);add(b16);add(next);  
b1.addActionListener(this);  
b2.addActionListener(this);  
b3.addActionListener(this);  
b4.addActionListener(this);  
b5.addActionListener(this);  
b6.addActionListener(this);  
b7.addActionListener(this);  
b8.addActionListener(this);  
b9.addActionListener(this);  
b10.addActionListener(this);
b11.addActionListener(this);
b12.addActionListener(this);
b13.addActionListener(this);
b14.addActionListener(this);
b15.addActionListener(this);
b16.addActionListener(this);
next.addActionListener(this);  
  
next.setBackground(Color.black);  
next.setForeground(Color.green);  

setSize(450,550);  
setLayout(null);  
setVisible(true);  
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  

}//end of constructor  
  

public void actionPerformed(ActionEvent e){  
	
if(e.getSource()==next){ 
second=0;
String

s=b1.getLabel();  
b1.setLabel(b5.getLabel());  
b5.setLabel(s);  

s=b2.getLabel();
b2.setLabel(b7.getLabel());  
b7.setLabel(s);

s=b15.getLabel();  
b15.setLabel(b9.getLabel());  
b9.setLabel(s); 

s=b12.getLabel();  
b12.setLabel(b11.getLabel());  
b11.setLabel(s); 

s=b3.getLabel();  
b3.setLabel(b13.getLabel());  
b13.setLabel(s);

s=b8.getLabel();  
b8.setLabel(b6.getLabel());  
b6.setLabel(s);
timer.start();
} 

if(e.getSource()==b1){  
String s=b1.getLabel();  
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b1.setLabel(" ");}  
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b1.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b2){  
String s=b2.getLabel();  
if(b1.getLabel().equals(" ")){ b1.setLabel(s); b2.setLabel(" ");}  
else if(b3.getLabel().equals(" ")){ b3.setLabel(s); b2.setLabel(" ");}  
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b2.setLabel(" ");}
}
if(e.getSource()==b3){  
String s=b3.getLabel();  
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b3.setLabel(" ");}
else if(b4.getLabel().equals(" ")){ b4.setLabel(s); b3.setLabel(" ");}
else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b3.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b4){  
String s=b4.getLabel();  
if(b3.getLabel().equals(" ")){ b3.setLabel(s); b4.setLabel(" ");}    
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b4.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b5){  
String s=b5.getLabel();  
if(b1.getLabel().equals(" ")){ b1.setLabel(s); b5.setLabel(" ");}  
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b5.setLabel(" ");}  
else if(b9.getLabel().equals(" ")){ b9.setLabel(s); b5.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b6){  
String s=b6.getLabel();  
if(b2.getLabel().equals(" ")){ b2.setLabel(s); b6.setLabel(" ");}  
else if(b5.getLabel().equals(" ")){ b5.setLabel(s); b6.setLabel(" ");}  
else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b6.setLabel(" ");}  
else if(b10.getLabel().equals(" ")){ b10.setLabel(s); b6.setLabel(" ");}  

 }//end of if  
  
if(e.getSource()==b7){  
String s=b7.getLabel();  
if(b3.getLabel().equals(" ")){ b3.setLabel(s); b7.setLabel(" ");}  
else if(b6.getLabel().equals(" ")){ b6.setLabel(s); b7.setLabel(" ");}  
else if(b8.getLabel().equals(" ")){ b8.setLabel(s); b7.setLabel(" ");}  
else if(b11.getLabel().equals(" ")){ b11.setLabel(s); b7.setLabel(" ");}  
 }//end of if  
  
if(e.getSource()==b8){  
String s=b8.getLabel();  
if(b4.getLabel().equals(" ")){ b4.setLabel(s); b8.setLabel(" ");}  
else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b8.setLabel(" ");}  
else if(b12.getLabel().equals(" ")){ b12.setLabel(s); b8.setLabel(" ");}  

 }//end of if  
  
if(e.getSource()==b9){  
String s=b9.getLabel();  
if(b5.getLabel().equals(" ")){ b5.setLabel(s); b9.setLabel(" ");}  
else if(b10.getLabel().equals(" ")){ b10.setLabel(s); b9.setLabel(" ");}
else if(b13.getLabel().equals(" ")){ b13.setLabel(s); b9.setLabel(" ");}  
}

if(e.getSource()==b10){  
String s=b10.getLabel();  
if(b6.getLabel().equals(" ")){ b6.setLabel(s); b10.setLabel(" ");}
else if(b9.getLabel().equals(" ")){ b9.setLabel(s); b10.setLabel(" ");}  
else if(b11.getLabel().equals(" ")){ b11.setLabel(s); b10.setLabel(" ");}  
else if(b14.getLabel().equals(" ")){ b14.setLabel(s); b10.setLabel(" ");}  
 }//end of if  

if(e.getSource()==b11){  
String s=b11.getLabel();  
if(b10.getLabel().equals(" ")){ b10.setLabel(s); b11.setLabel(" ");}
else if(b7.getLabel().equals(" ")){ b7.setLabel(s); b11.setLabel(" ");}  
else if(b10.getLabel().equals(" ")){ b10.setLabel(s); b11.setLabel(" ");} 
else if(b12.getLabel().equals(" ")){ b12.setLabel(s); b11.setLabel(" ");} 
else if(b15.getLabel().equals(" ")){ b15.setLabel(s); b11.setLabel(" ");} 
}

if(e.getSource()==b12){  
String s=b12.getLabel();  
if(b8.getLabel().equals(" ")){ b8.setLabel(s); b12.setLabel(" ");}
else if(b11.getLabel().equals(" ")){ b11.setLabel(s); b12.setLabel(" ");}  
else if(b16.getLabel().equals(" ")){ b16.setLabel(s); b12.setLabel(" ");}   
}//end of if  
  
if(e.getSource()==b13){  
String s=b13.getLabel();  
if(b9.getLabel().equals(" ")){ b9.setLabel(s); b13.setLabel(" ");}
else if(b14.getLabel().equals(" ")){ b14.setLabel(s); b13.setLabel(" ");}  
}//end of if 

if(e.getSource()==b14){  
String s=b14.getLabel();  
if(b10.getLabel().equals(" ")){ b10.setLabel(s); b14.setLabel(" ");}
else if(b13.getLabel().equals(" ")){ b13.setLabel(s); b14.setLabel(" ");}  
else if(b15.getLabel().equals(" ")){ b15.setLabel(s); b14.setLabel(" ");}   
}//end of if 

if(e.getSource()==b15){  
String s=b15.getLabel();  
if(b11.getLabel().equals(" ")){ b11.setLabel(s); b15.setLabel(" ");}
else if(b14.getLabel().equals(" ")){ b14.setLabel(s); b15.setLabel(" ");}  
else if(b16.getLabel().equals(" ")){ b16.setLabel(s); b15.setLabel(" ");}   
}//end of if 

if(e.getSource()==b16){  
String s=b16.getLabel();  
if(b12.getLabel().equals(" ")){ b12.setLabel(s); b16.setLabel(" ");}
else if(b15.getLabel().equals(" ")){ b15.setLabel(s); b16.setLabel(" ");}  

}//end of if 



if(b1.getLabel().equals("1")&&b2.getLabel().equals("2")&&b3.getLabel()  
.equals("3")&&b4.getLabel().equals("4")&&b5.getLabel().equals("5")  
&&b6.getLabel().equals("6")&&b7.getLabel().equals("7")&&b8.getLabel()  
.equals("8")&&b9.getLabel().equals("9")&&b10.getLabel().equals("10")&&b11.getLabel().equals("11")
&&b12.getLabel().equals("12")&&b13.getLabel().equals("13")
&&b14.getLabel().equals("14")&&b15.getLabel().equals("15")&&b16.getLabel()
.equals(" "))

{   
	timer.stop();
	JOptionPane.showMessageDialog(Puzzle_H.this,"!!!you won!!! your time new score for today is:	" + (minute+":"+second));
	 
}  
 }//end of if   
  
  
}//end of class  
