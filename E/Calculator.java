//calculator
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
public class Calculator extends JFrame implements ActionListener
{
   JFrame f;
   JButton b0;
   JButton b1;
   JButton b2;
   JButton b3;
   JButton b4;
   JButton b5;
   JButton b6;
   JButton b7;
   JButton b8;
   JButton b9;
   JButton ba;
   JButton bs;
   JButton bm;
   JButton bd;
   JButton beq;
   JPanel p;
   JTextField result;
   ArrayList<String> expr=new ArrayList<>();
   Calculator()
   {
      f=new JFrame("Calculator");
      f.setSize(800,600);
      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      p=new JPanel();
      p.setLayout(null);
      result=new JTextField();
      result.setBounds(200,150,350,40);
      result.setEditable(false);
      p.add(result);

      b7=new JButton("7");
      b7.setBounds(200,200,60,40);
      p.add(b7);
      b7.addActionListener(this);

      b8=new JButton("8");
      b8.setBounds(300,200,60,40);
      p.add(b8);
      b8.addActionListener(this);

      b9=new JButton("9");
      b9.setBounds(400,200,60,40);
      p.add(b9);
      b9.addActionListener(this);

      b4=new JButton("4");
      b4.setBounds(200,250,60,40);
      p.add(b4);
      b4.addActionListener(this);

      b5=new JButton("5");
      b5.setBounds(300,250,60,40);
      p.add(b5);
      b5.addActionListener(this);

      b6=new JButton("6");
      b6.setBounds(400,250,60,40);
      p.add(b6);
      b6.addActionListener(this);

      b1=new JButton("1");
      b1.setBounds(200,300,60,40);
      p.add(b1);
      b1.addActionListener(this);

      b2=new JButton("2");
      b2.setBounds(300,300,60,40);
      p.add(b2);
      b2.addActionListener(this);
  
      b3=new JButton("3");
      b3.setBounds(400,300,60,40);
      p.add(b3);
      b3.addActionListener(this);

      b0=new JButton("0");
      b0.setBounds(200,350,250,40);
      p.add(b0);
      b0.addActionListener(this);

      ba=new JButton("+");
      ba.setBounds(500,200,60,40);
      p.add(ba);
      ba.addActionListener(this);
    
      bs=new JButton("-");
      bs.setBounds(500,250,60,40);
      p.add(bs);
      bs.addActionListener(this);

      bm=new JButton("*");
      bm.setBounds(500,300,60,40);
      p.add(bm);
      bm.addActionListener(this);

      bd=new JButton("/");
      bd.setBounds(500,350,60,40);
      p.add(bd);
      bd.addActionListener(this);

      beq=new JButton("=");
      beq.setBounds(200,400,350,40);
      p.add(beq);
      beq.addActionListener(this);

      f.add(p);
      f.setVisible(true);
   }
   double divison(int r1,int r2)
   {
      if(r2==0)
      {
         result.setText("ZERO DIVISION ERROR");
         return 0.0;
      }
      else
      {
         double a=(double)r1;
         double b=(double)r2;
         double r=a/b;
         return r;
      }
   }
   public void actionPerformed(ActionEvent evt)
   {
      if(evt.getSource()==b0)
      {
         result.setText("0");
         expr.add("0");
      }
      else if(evt.getSource()==b1)
      {
         result.setText("1");
         expr.add("1");
      }
      else if(evt.getSource()==b2)
      {
         result.setText("2");
         expr.add("2");
      }
      else if(evt.getSource()==b3)
      {
         result.setText("3");
         expr.add("3");
      }
      else if(evt.getSource()==b4)
      {
         result.setText("4");
         expr.add("4");
      }
      else if(evt.getSource()==b5)
      {
         result.setText("5");
         expr.add("5");
      }
      else if(evt.getSource()==b6)
      {
         result.setText("6");
         expr.add("6");
      }
      else if(evt.getSource()==b7)
      {
         result.setText("7");
         expr.add("7");
      }
      else if(evt.getSource()==b8)
      {
         result.setText("8");
         expr.add("8");
      }
      else if(evt.getSource()==b9)
      {
         result.setText("9");
         expr.add("9");
      }
      else if(evt.getSource()==ba)
      {
         result.setText("+");
         expr.add("+");
      }
      else if(evt.getSource()==bm)
      {
         result.setText("*");
         expr.add("*");
      }
      else if(evt.getSource()==bd)
      {
         result.setText("/");
         expr.add("/");
      }
      else if(evt.getSource()==bs)
      {
         result.setText("-");
         expr.add("-");
      }
      else if(evt.getSource()==beq)
      {
         int flag=0;
         int i,j,a1,a2,r1=0,r2=0;
         String op=new String();
         for(i=0;i<expr.size();i++)
         {
            String it=expr.get(i);
            if(it=="+"||it=="-"||it=="*"||it=="/")
            {
               op=it;
               expr.set(i,"m");
            }
         }
         for(i=0;i<expr.size();i++)
         {
            String it=expr.get(i);
            if(it!="m" && flag==0)
            {
               a1=Integer.parseInt(it);
               r1=r1*10+a1;
            }
            else if(it=="m")
            {
                 String c=it;
                 flag=1;
            }
            else if(it!="m" && flag==1)
            {
               a2=Integer.parseInt(it);
               r2=r2*10+a2;
            }
         }
         String ch=new String();
         double ans=0.0;
         if(op=="+")
         {
            ans=(double)r1+r2;
         }
         else if(op=="-")
         {
            ans=(double)r1-r2;
         }
         else if(op=="*")
         {
            ans=(double)r1*r2;
         }
         else if(op=="/")
         {
            ans=divison(r1,r2);
         }
         if(op!="/" || (op=="/" && ans!=0.0))
         {
            String finalAns=r1+op+r2+"= "+ans;
            expr.clear();
            result.setText(finalAns);
         }
      }
   }
   public static void main(String[] args)
   {
      Calculator cl=new Calculator();
   }
}
