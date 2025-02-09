
package com.mycompany.projectoop;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.*;

public class Draw extends JFrame {

    char c;
    
    double Rhight,Rwidth,radious;
    
    Color color;
    boolean filld;
   
    public Draw()
    {
        
        this.setTitle("Shape");
     //   this.setLocation(1000,200);   
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);     
        this.setSize(500,500);
        this.setVisible(true);
 
    }
    public Draw(char c,double width,double hight,Color color,boolean filld)
    {
        this();
        this.c=c;
        this.Rhight=hight;
        this.Rwidth=width;
        this.color=color;
        this.filld=filld;
 
    }
    public Draw(char c,double radious,Color color,boolean filld)
    {
        this();
        this.c=c;
        this.radious=radious;
        this.color=color;
        this.filld=filld;
         
    }
    @Override
    public void paint(Graphics g)
    {
        
        Graphics2D gg= (Graphics2D) g;
        gg.setPaint(color);
        
        if(c=='R')
        {
            gg.drawRect(50, 50, (int)Rwidth, (int)Rhight); 
            if(filld)
            {
                gg.fillRect(50, 50, (int)Rwidth, (int)Rhight); 
            }
        }else
        {
            gg.drawOval(50, 50, (int)(2*radious), (int)(2*radious));
            if(filld)
            {
                gg.fillOval(50, 50, (int)(2*radious), (int)(2*radious));
            }
        }
            
        
       
    }
}
