
package com.mycompany.projectoop;


import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;



public class ChooseShape extends JFrame implements ActionListener
{
    JComboBox comboBox;
    JLabel label1;
    
    
    ChooseShape()
    {
        String []shapes={"Rectangle","Square","Circle"};
        comboBox=new JComboBox(shapes);
        comboBox.setEditable(true);
        comboBox.setPreferredSize(new Dimension(120,30));
        comboBox.setFont(new Font("MV Boli",Font.PLAIN,20));
        comboBox.addActionListener(this);
        
        label1=new JLabel("Choose Shape");
        label1.setFont(new Font("MV Boli",Font.PLAIN,20));
        
        
        
        
        //this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("Shape");
        this.setSize(300,110);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(label1);
        this.add(comboBox);
      
    
        this.setVisible(true);
        
    }
    
    
   
    
    @Override    
    public void actionPerformed(ActionEvent e) 
    {
       if(e.getSource()==comboBox)
       { 
           this.dispose();
           if(comboBox.getSelectedItem().equals("Rectangle"))
               new Rectangle();
           else if (comboBox.getSelectedItem().equals("Square"))
               new Square();
           else
               new Circle();
          
       }
    }
    
    
}
