//traffic light simulation
import javax.swing.*;
import java.awt.Color;
import java.awt.event.*;
public class TrafficLight extends JFrame implements ActionListener
{
   JLabel color;
   JRadioButton r;
   JRadioButton y;
   JRadioButton g;
   TrafficLight()
   {
      this.setTitle("Traffic Lights");
      this.setSize(800,600);
      this.setLayout(null);
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      r=new JRadioButton("RED");
      y=new JRadioButton("YELLOW");
      g=new JRadioButton("GREEN");
      r.setBounds(200,200,100,40);
      y.setBounds(300,200,100,40);
      g.setBounds(400,200,100,40);
      ButtonGroup bg=new ButtonGroup();
      bg.add(r);
      bg.add(y);
      bg.add(g);
      r.addActionListener(this);
      y.addActionListener(this);
      g.addActionListener(this);
      this.add(r);
      this.add(y);
      this.add(g);
      color=new JLabel();
      color.setBounds(300,300,100,40);
      color.setBackground(Color.black);
      color.setOpaque(true);
      this.add(color);
      this.setVisible(true);
   }
   public void actionPerformed(ActionEvent evt)
   {
      if(evt.getSource()==r)
      {
         color.setBackground(Color.red);
      }
      else if(evt.getSource()==y)
      {
         color.setBackground(Color.yellow);
      }
      else if(evt.getSource()==g)
      {
         color.setBackground(Color.green);
      }
   }
   public static void main(String[] args)
   {
      TrafficLight tl=new TrafficLight();
   }
}
