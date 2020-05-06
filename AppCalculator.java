import java.awt.*;
import java.applet.*;
import java.awt.event.*;		
/*<applet code="AppCalculator.class" width="300" height="300"> </applet>*/ 
public class AppCalculator extends Applet implements ActionListener
{
    private TextField first, second,output;
    private Button b1,b2,b3,b4,b5;
    private double a,b;
    public void init ()
    {
        Label p=new Label("First Number");
        Label q=new Label("Second Number");
        Label s=new Label ("Operation");
        Label r=new Label("Result");
        Label t=new Label ("Reset");
        
        first=new TextField(10);
        second=new TextField(10);
        output=new TextField(10);
        
        b1=new Button("+");
        b2=new Button("-");
        b3=new Button("*");
        b4=new Button("/");
        b5=new Button("Reset");
        
        add(p);
        add(first);
        add(q);
        add(second);
        add(s);
        add(b1);
        add(b2);
        add(b3);
        add(b4);
        add(r);
        add(output);
        add(t);
        add(b5);

		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		
        p.setBounds(20,20,90,20);
        first.setBounds(150,20,40,20);
        q.setBounds(20,55,96,20);
        second.setBounds(150,55,40,20);
        s.setBounds(20,90,90,20);
        b1.setBounds(120,90,20,20);
        b2.setBounds(150,90,20,20);
        b3.setBounds(180,90,20,20);
        b4.setBounds(210,90,20,20);
		r.setBounds(20, 120, 40, 20); 
		output.setBounds(150,120,40,20);
		t.setBounds(20,150,60,20);
		b5.setBounds(150,150,40,20);

        setLayout(null);
    }
    public void actionPerformed(ActionEvent e)
    {
     	       
        if(e.getSource()==b1)
        {
        	a=Double.parseDouble(first.getText());
        	b=Double.parseDouble(second.getText());
            double c=a+b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        
        else if(e.getSource()==b2)
        {
        	a=Double.parseDouble(first.getText());
        	b=Double.parseDouble(second.getText());
            double c=a-b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        
        else if(e.getSource()==b3)
        {
        	a=Double.parseDouble(first.getText());
        	b=Double.parseDouble(second.getText());
            double  c=a*b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        
        else if(e.getSource()==b4)
        {
        	a=Double.parseDouble(first.getText());
        	b=Double.parseDouble(second.getText());
           	double c=a/b;
           	String s= String.valueOf(c);
           	output.setText(s);
        }
        else if(e.getSource()==b5)
        {
        	first.setText("");
        	second.setText("");
        	output.setText("");
        }
    }
    
}
