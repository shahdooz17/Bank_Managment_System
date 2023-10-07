package bank.managment.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login extends JFrame implements ActionListener {
   JLabel label1,label2,label3;
   JTextField textField2;
   JPasswordField passwordField2;
   JButton button1,button2,button3;
    login(){
        super("Bank Managment System");
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);
        add(image);

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);


        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("AvantGarde" , Font.ITALIC , 38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway" , Font.BOLD ,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375,30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,14));
        add(textField2);

        label3 = new JLabel("PIN :");
        label3.setFont(new Font("Ralway" , Font.BOLD ,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375,30);
        add(label3);


        passwordField2 = new JPasswordField(15);
        passwordField2.setBounds(325,250,230,30);
        passwordField2.setFont(new Font("Arial", Font.BOLD,14));
        add(passwordField2);

        button1=new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.gray);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);


        button2=new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.gray);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3=new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.gray);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);



        setLayout(null);
        setSize(850,480);
        setLocation(450,200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            if (e.getSource()==button1)
            {

            } else if (e.getSource()==button2)
            {
                textField2.setText("");
                passwordField2.setText("");

            } else if (e.getSource()==button3)
            {

            }
        }catch(Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new login();
    }
}
