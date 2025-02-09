
package com.mycompany.projectoop;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.*;



public abstract class  Shape extends JFrame 
{

    
 
    protected JLabel colorLabel;
    protected JLabel filldLabel;
    protected JLabel areaLabel;
    protected JLabel perimeterLabel;
    
    protected JTextField showArea;
    protected JTextField showperimeter;
    
    protected JButton button;
    protected JButton colorButton;
    protected JCheckBox checkBox;
    
    protected Color color;
    Shape()
    {
        colorLabel = new JLabel("Color");
        filldLabel = new JLabel("Filld");
          
        colorLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        filldLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        
        areaLabel=new JLabel("Area");
        perimeterLabel=new JLabel("Perimeter");
        
        areaLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        perimeterLabel.setFont(new Font("MV Boli",Font.PLAIN,30));
        
        showArea=new JTextField();
        showperimeter=new JTextField();
        
        showArea.setEditable(false);
        showperimeter.setEditable(false);
        
        button = new JButton("Calculate and Display");
        button.setFocusable(false);
        
        colorButton = new JButton("Choose");
        colorButton.setFocusable(false);
        checkBox = new JCheckBox();
        
        
      //this.getContentPane().setBackground(Color.DARK_GRAY);
        this.setTitle("Shape");
        this.setSize(500,350);
        
        this.setLocationRelativeTo(null);
        this.setLayout(new FlowLayout());
       
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
    }
    abstract public double getArea();
    abstract public double getPerimeter();

    
    
}
