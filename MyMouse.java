/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package line1;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseAdapter;



public class MyMouse extends Applet {
int x1;
int x2;
int y1;
int y2;

    public void init() {
        this.addMouseListener(
          new MouseAdapter()
                {
    @Override
            public void mousePressed(MouseEvent e) {
              x1=e.getX();
               y1=e.getY();
            }
                    
                
        
            @Override
            public void mouseReleased(MouseEvent e) {
                 x2=e.getX();
               y2=e.getY();
                System.out.println(x2 + " "+ y2);
             
            }

                }       
        );

        
        this.addMouseMotionListener(
                
        new MouseMotionListener()
        {             

            @Override
            public void mouseDragged(MouseEvent e) {
               x1=e.getX();
               y1=e.getY();
                repaint();
            }

            @Override
            public void mouseMoved(MouseEvent e) {
               x2=e.getX();
               y2=e.getY();
              
            }
            
        }
          
        );
    }
    
        
    @Override
    public void paint (Graphics g)
    {
        g.drawLine(x1, y1, x2, y2);
    }

   
}
