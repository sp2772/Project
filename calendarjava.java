import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;

class Calendar
{
    JFrame f;
    JPanel p1,p2;
    JLabel l1;
    JButton b[];
    JComboBox cb1;
    
    Calendar()
    {
        f= new JFrame("Calendar");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(1000,1000);

        p1= new JPanel();
        
        p1.setBounds(0,0,1000,100);
        f.add(p1);

        l1= new JLabel("Month");
        p1.add(l1);

        p2= new JPanel(new GridLayout(7,7));
    
        p2.setBounds(100,100,700,500);

        f.add(p2);
        b= new JButton[32];
        for(int i=1; i<32;i++)
        {
            b[i]= new JButton(String.valueOf(i));
            b[i].setSize(100, 71);
            p2.add(b[i]);        
        }
        
        cb1 = new JComboBox(new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"});
        cb1.setBounds(100,100,100,100);
        p1.add(cb1);
 
        cb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s= (String)cb1.getSelectedItem();
                if(s.equals("January"))
                {
                    for(int i=1;i<32;i++)
                    {
                        b[i].setText(String.valueOf(i));
                    }
                }
                else if(s.equals("February"))
                {
                    for(int i=1;i<=29;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==30 || i==31)
                        {
                            b[i].setVisible(false);
                        }
                    }
                }
                else if(s.equals("March"))
                {
                  for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                       
                    }  
                }
                else if(s.equals("April"))
                {
                  for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                       
                    }  
                }
                
                

            }       
        });
    }
}




public class calendarjava {
    public static void main(String args[])
    {
        new Calendar();
    }
}
