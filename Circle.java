
package com.mycompany.projectoop;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Circle extends Shape implements ActionListener{

    private double r;
    private JLabel radiousLabel;
    private JTextField radiousText;
    public Circle()
    {
       
        radiousLabel = new JLabel("Radious");
        radiousText = new JTextField();
        
        radiousLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        radiousText.setFont(new Font("MV Boli",Font.PLAIN,30));
        
        
        button.addActionListener(this);
        colorButton.addActionListener(this);
        
        super.setLayout(new GridLayout(6,2,10,10));
        super.add(radiousLabel);
        super.add(radiousText);
        super.add(colorLabel);
        super.add(colorButton);
        super.add(filldLabel);
        super.add(checkBox);
        super.add(areaLabel);
        super.add(showArea);
        super.add(perimeterLabel);
        super.add(showperimeter);
        super.add(button);
        super.setVisible(true);
 
    
    }
    
    @Override
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==button)
        {
            try
            {
                r=Double.parseDouble(radiousText.getText());
                if(r<=0 )
                {
                    JOptionPane.showMessageDialog(null,"Radious must be Postive Number","ERROR",JOptionPane.ERROR_MESSAGE);
                    super.dispose();
                    new Circle();
                }
                else
                {
                    showArea.setText(getArea()+"");
                    showperimeter.setText(getPerimeter()+"");

                    new Draw('C',r,color,checkBox.isSelected());
                }  
            }catch(java.lang.NumberFormatException ex)
            {
                JOptionPane.showMessageDialog(null,"Radious must be Postive Number","ERROR",JOptionPane.ERROR_MESSAGE);
                super.dispose();
                new Circle();
            }
              
          
        }
        if(e.getSource()==colorButton)
        {
            color = JColorChooser.showDialog(null, "Choose Color", Color.white);
        }
        
    }
   
   
    @Override
    public double getArea() 
    {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() 
    {
        return 2*Math.PI*r;
    }
    
    
    
    public Circle(double r,String color,boolean filled)
    {
        this.r=r;
    }
    public void setR(double r)
    {
        this.r=r;
    }
    public double getR( )
    {
        return r;
    }
}
