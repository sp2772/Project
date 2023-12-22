import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.*;
import javax.swing.event.*;


class Calendar
{
    JFrame f;
    JPanel p1,p2;
    JLabel l1,l2;
    JButton b[], val;
    JComboBox cb1;
    JTextField t1;
    
    public static boolean isLeapYear(int year) {

        return (year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0));
    }

    public static int getmonthint(String month)
    {
    if(month.equals("January"))
    {
        return 0;
    }
    else if(month.equals("February"))
    {
        return 1;
    }
    else if(month.equals("March"))
    {
        return 2;
    }
    else if(month.equals("April"))
    {
        return 3;
    }
    else if(month.equals("May"))
    {
        return 4;
    }
    else if(month.equals("June"))
    {
        return 5;
    }
    else if(month.equals("July"))
    {
        return 6;
    }
    else if(month.equals("August"))
    {
        return 7;
    }
    else if(month.equals("September"))
    {
        return 8;
    }
    else if(month.equals("October"))
    {
        return 9;
    }
    else if(month.equals("November"))
    {
        return 10;
    }
    else if(month.equals("December"))
    {
        return 11;
    }
    return -1;
    }

    public static String getmonth(String month)
    {
    if(month.equals("January"))
    {
        return "01";
    }
    else if(month.equals("February"))
    {
        return "02";
    }
    else if(month.equals("March"))
    {
        return "03";
    }
    else if(month.equals("April"))
    {
        return "04";
    }
    else if(month.equals("May"))
    {
        return "05";
    }
    else if(month.equals("June"))
    {
        return "06";
    }
    else if(month.equals("July"))
    {
        return "07";
    }
    else if(month.equals("August"))
    {
        return "08";
    }
    else if(month.equals("September"))
    {
        return "09";
    }
    else if(month.equals("October"))
    {
        return "10";
    }
    else if(month.equals("November"))
    {
        return "11";
    }
    else if(month.equals("December"))
    {
        return "12";
    }
    return "01";
    }



    Calendar() throws IOException
    {
        class Mon
            {
                ArrayList<Integer> day= new ArrayList<Integer>();
            }
            Mon[] mon= new Mon[12];
            for(int j=0;j<12;j++)
            {
                mon[j]= new Mon();
            }
         class storeyear
            {
                String year;
                storeyear()
                {
                    
                }
                void addyear(String year)
                {
                    this.year=year;
                }
            }
        storeyear storey= new storeyear();


        f= new JFrame("Calendar");
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setSize(1000,1000);

        p1= new JPanel();
        
        p1.setBounds(0,0,1000,100);
        f.add(p1);
        l2= new JLabel("Year");
        p1.add(l2);
        t1= new JTextField(4);
        p1.add(t1);
        val = new JButton("show");
        p1.add(val);

        l1= new JLabel("Month");
        p1.add(l1);

        p2= new JPanel(new GridLayout(7,7));
    
        p2.setBounds(100,100,700,500);

        f.add(p2);
        b= new JButton[32];
        for(int i=1; i<32;i++)
        {
            b[i]= new JButton(String.valueOf(i));
            b[i].setBackground(Color.white);
            b[i].setSize(100, 71);
            p2.add(b[i]);        
        }
        
        cb1 = new JComboBox(new String[]{"January","February","March","April","May","June","July","August","September","October","November","December"});
        cb1.setBounds(100,100,100,100);
        p1.add(cb1);

        val.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s= t1.getText();
                storey.addyear(s);
                cb1.setSelectedIndex(cb1.getSelectedIndex());
                
            }
        });
 
        cb1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e)
            {
                String s= (String)cb1.getSelectedItem();

                if(s.equals("January"))
                {
                    for(int i=1;i<32;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31 || i==30)                        {
                            b[i].setVisible(true);
                            
                        }
                        b[i].setBackground(Color.white);
                    
                    }


                    for(Integer buttno: mon[0].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                    
                }
                else if(s.equals("February"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(isLeapYear(Integer.valueOf(t1.getText())))
                        {
                        if(i==30 || i==31)
                        {
                            b[i].setVisible(false);
                            
                        }
                        if(i==29)
                        {
                            b[i].setVisible(true);
                        }
                        }
                        else
                        {
                            if(i==29 || i==30 || i==31)
                        {
                            b[i].setVisible(false);
                            
                        }
                        }
                        b[i].setBackground(Color.white);
                        
                    }
                    for(Integer buttno: mon[1].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("March"))
                {
                  for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31 || i==30 || i==29)                        {
                            b[i].setVisible(true);
                            
                        }
                        b[i].setBackground(Color.white);
                                              
                    } 
                   for(Integer buttno: mon[2].day)
                    {
                        b[buttno].setBackground(Color.red);
                    } 
                }
                else if(s.equals("April"))
                {
                  for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31 )
                        {
                            b[i].setVisible(false);
                        }
                        if(i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                       
                    }  
                    for(Integer buttno: mon[3].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("May"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31 || i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    } 
                    for(Integer buttno: mon[4].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("June"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31 )
                        {
                            b[i].setVisible(false);
                        }
                        if(i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    } 
                    for(Integer buttno: mon[5].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("July"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                         if(i==31 || i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    }
                    for(Integer buttno: mon[6].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
         
                }
                else if(s.equals("August"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                         if(i==31 || i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white); 
                       
                    } 
                    for(Integer buttno: mon[7].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("September"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31)
                        {
                            b[i].setVisible(false);
                        }
                        if(i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    } 
                    for(Integer buttno: mon[8].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("October"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                         if(i==31 || i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    } 
                    for(Integer buttno: mon[9].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("November"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                        if(i==31)
                        {
                            b[i].setVisible(false);
                        }
                        if(i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    } 
                    for(Integer buttno: mon[10].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
                else if(s.equals("December"))
                {
                    for(int i=1;i<=31;i++)
                    {
                        b[i].setText(String.valueOf(i));
                         if(i==31 || i==30 || i==29)
                        {
                            b[i].setVisible(true);
                        }
                        b[i].setBackground(Color.white);
                    } 
                    for(Integer buttno: mon[11].day)
                    {
                        b[buttno].setBackground(Color.red);
                    }
                }
   

            }       
        });

        for(int i=1; i<32;i++)
        {
            class storei
                    {
                        int i;
                        storei(int i)
                        {
                            this.i=i;
                        }
                    }

            
            storei store= new storei(i);
            
           
            
            
            
            b[i].addActionListener(new ActionListener(){
                
                public void actionPerformed(ActionEvent e)
                {
                    JFrame f2= new JFrame("Add Event");
                    f2.setVisible(true);
                    f2.setLayout(new GridLayout(12,1));
                    f2.setSize(300,300);
                    
                    JLabel l2= new JLabel("Event Name");
                    JTextField t1= new JTextField(20);
                    JLabel l3= new JLabel("Event Description");
                    JTextField t2= new JTextField(20);
                    JLabel l4= new JLabel("Event Time");
                    JComboBox cbh = new JComboBox<String>(new String[]{"01","02","03","04","05","06","07","08","09","10","11","12"});
                    JComboBox cbm = new JComboBox<String>(new String[]{"00","01","02","03","04","05","06","07","08","09","10","11","12","13","14","15","16","18","19","20","21","22","23","24","25","26","27","28","29","30","31","32","33","35","36","37","38","39","40","41","42","43","44","45","46","47","48","49","50","52","53","54","55","56","57","58","59"});
                    JComboBox cbap = new JComboBox<String>(new String[]{"AM","PM"});
                    JButton b1= new JButton("Add Event");
                    f2.add(l2);
                    f2.add(t1);
                    f2.add(l3);
                    f2.add(t2);
                    f2.add(l4);
                    f2.add(cbh);
                    f2.add(cbm);
                    f2.add(cbap);
                    f2.add(b1);
                    
                    b1.addActionListener(new ActionListener(){
                        public void actionPerformed(ActionEvent e) 
                        {
                            

                            String s2= (String)cb1.getSelectedItem();
                            mon[getmonthint(s2)].day.add(store.i);
                            b[store.i].setBackground(Color.red);
                            String ev= t1.getText();
                            String des= t2.getText();
                            String hr= (String)cbh.getSelectedItem();
                            String min= (String)cbm.getSelectedItem();
                            String ap= (String)cbap.getSelectedItem();
                            if(ap.equals("PM"))
                            {
                                int h= Integer.parseInt(hr);
                                h=h+12;
                                hr=String.valueOf(h);
                            }
                            if(hr.equals("12") && ap.equals("AM"))
                            {
                                hr="00";
                            }
                            File f1 = new File("details.txt");
                            try
                            {
                                
                                if(!f1.exists()) {
                                    f1.createNewFile();
                                }// 2024-01-01#13:34#event#description&
                                String data =storey.year+"-"+getmonth(s2)+"-"+b[store.i].getText()+"#"+hr+":"+min+"#"+ev+"#"+des+"&";
                                FileWriter fileWritter = new FileWriter(f1.getName(),true);
                                BufferedWriter bw = new BufferedWriter(fileWritter);
                                bw.write(data);
                                bw.close();
                               
                            }
                            catch(IOException e1)
                            {
                                e1.printStackTrace();
                            }
                            
                        } 
                    });
                    

                }
            });
        }
       
        
        
    }
}





public class calendarjava {
    public static void main(String args[]) throws IOException, InterruptedException
    {
        new Calendar();
        System.out.println("hello");
        ProcessBuilder   ps=new ProcessBuilder("python","texttosp.py");
        ps.redirectErrorStream(true);
        Process pr = ps.start();  

        BufferedReader in = new BufferedReader(new InputStreamReader(pr.getInputStream()));
        String line;
        int i=0;
        while ((line= in.readLine()) != null) {
            System.out.print(i);
            System.out.println(line);
            i++;
        }
        pr.waitFor();
        System.out.println("ok!");

        in.close();
    }
}