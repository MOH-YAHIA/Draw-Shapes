
package com.mycompany.projectoop;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JColorChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class Rectangle extends Shape implements ActionListener
{
    private double Rwidth;
    private double Rhight;
    protected JLabel widthLabel;
    protected JLabel hightLabel;
    
    protected JTextField widthText;
    protected JTextField hightText;
    
    Rectangle()
    {
    
      
        widthLabel = new JLabel("Width");
        hightLabel = new JLabel("Hight");
        
        widthLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        hightLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        
        widthText = new JTextField();
        hightText = new JTextField();
        
        widthText.setFont(new Font("MV Boli",Font.PLAIN,20));
        hightText.setFont(new Font("MV Boli",Font.PLAIN,20));
        
        button.addActionListener(this);
        colorButton.addActionListener(this);
        
        super.setLayout(new GridLayout(7,2,10,10));
        super.add(widthLabel);
        super.add(widthText);
        super.add(hightLabel);
        super.add(hightText);
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
                Rwidth=Double.parseDouble(widthText.getText());
                Rhight=Double.parseDouble(hightText.getText());

                if(Rwidth<=0 || Rhight<=0)
                {
                     JOptionPane.showMessageDialog(null,"Hight and Width must be Postive Numbers","ERROR",JOptionPane.ERROR_MESSAGE);
                     super.dispose();
                     new Rectangle();
                }else
                {
                    showArea.setText(getArea()+"");
                    showperimeter.setText(getPerimeter()+"");

                    new Draw('R',this.Rwidth,this.Rhight,color,checkBox.isSelected());
                }
           }catch(java.lang.NumberFormatException ex)
            {
                     JOptionPane.showMessageDialog(null,"Hight and Width must be Postive Numbers","ERROR",JOptionPane.ERROR_MESSAGE);
                     super.dispose();
                     new Rectangle();
                
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
       return Rhight*Rwidth;
    }

    @Override
    public double getPerimeter() 
    {
        return 2*(Rhight+Rwidth);
    }
      
    Rectangle(double width,double hight)
    {
   
        this.Rwidth=width;
        this.Rhight=hight;
    }
    Rectangle(double width,double hight,String color,boolean field)
    {
        this.Rwidth=width;
        this.Rhight=hight;
    }

    public double getRWidth() 
    {
        return this.Rwidth;
    }

    public void setRWidth(double width) 
    {
        this.Rwidth = width;
    }

    public  double getRHight() {
        return Rhight;
    }

    public void setRHight(double hight) 
    {
        this.Rhight = hight;
    }
}
