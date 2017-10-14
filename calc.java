import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import javax.swing.event.*;
public class SimpleCal
{
    
    
    public SimpleCal()
    {
    JFrame f=new JFrame("Calc");
    f.setLocation(500,350);
    //east
    JLabel jcalc=new JLabel("Calculator");
    JPanel jpcalc=new JPanel();
    //center
    JLabel jfirstN=new JLabel("First Number:");
    JLabel jSecondN=new JLabel("Second Number:");
    JLabel jresult=new JLabel("Result:");
    final JTextField jtext=new JTextField(5);
    final JTextField jtext1=new JTextField(5);
    final JTextField jresult1=new JTextField(10);
    
    JPanel jpcenter=new JPanel();
    JButton jbAdd =new JButton("Add");
    JButton jbMul =new JButton("Multiple");
    JButton jbSub =new JButton("Subtract");
    JButton jbDiv =new JButton("Divide");
    JPanel jbButons=new JPanel();
    
    
    jpcalc.setLayout(new FlowLayout(FlowLayout.LEFT));
    jpcenter.setLayout(new GridLayout(3,2,1,4));
    
    jpcalc.add(jcalc);
    
    jpcenter.add(jfirstN);
    jpcenter.add(jtext);
    jpcenter.add(jSecondN);
    jpcenter.add(jtext1);
    jpcenter.add(jresult);
    jpcenter.add(jresult1);
    jbButons.add(jbAdd);
    jbButons.add(jbMul);
    jbButons.add(jbSub);
    jbButons.add(jbDiv);
    Container c=f.getContentPane();
    c.add(jpcalc,BorderLayout.NORTH);
    c.add(jpcenter,BorderLayout.CENTER);
    c.add(jbButons,BorderLayout.SOUTH);
    f.pack();
    f.setVisible(true);
    jbSub.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent ae){
        int x=Integer.parseInt(jtext.getText());
        int y=Integer.parseInt(jtext1.getText());
        jresult1.setText(String.valueOf(x-y));
    }});
        
    jbAdd.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent ae){
        int x=Integer.parseInt(jtext.getText());
        int y=Integer.parseInt(jtext1.getText());
        jresult1.setText(String.valueOf(x+y));
    }});
        
    jbMul.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent ae){
        int x=Integer.parseInt(jtext.getText());
        int y=Integer.parseInt(jtext1.getText());
        jresult1.setText(String.valueOf(x*y));
    }});
        
    jbDiv.addActionListener(new ActionListener(){ 
        public void actionPerformed(ActionEvent ae){
        int x=Integer.parseInt(jtext.getText());
        int y=Integer.parseInt(jtext1.getText());
        jresult1.setText(String.valueOf(x/y));
    }});
    
    
public static void main(String[] args)
{
new SimpleCal();
}
}
