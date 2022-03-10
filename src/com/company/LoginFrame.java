package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame implements ActionListener {


    JLabel userLabel = new JLabel("USERNAME");
    JLabel passwordLabel = new JLabel("PASSWORD");
    JTextField userTextField = new JTextField();
    JPasswordField passwordField = new JPasswordField();
    JButton loginButton = new JButton("LOGIN");
    JButton resetButton = new JButton("RESET");
    JCheckBox showPassword = new JCheckBox("Show Password");

    boolean c1 = false,c2=false,c3=false;

    client1 one ;
    client2 two;
    client3 three;

    LoginFrame() {
        setLayoutManager();
        setLocationAndSize();
        addComponentsToContainer();
        addActionEvent();
    }

    public void setLayoutManager() {
       // container.setLayout(null);
        setLayout(null);
    }

    public void setLocationAndSize() {
        userLabel.setBounds(50, 150, 100, 30);
        passwordLabel.setBounds(50, 220, 100, 30);
        userTextField.setBounds(150, 150, 150, 30);
        passwordField.setBounds(150, 220, 150, 30);
        showPassword.setBounds(150, 250, 150, 30);
        loginButton.setBounds(50, 300, 100, 30);
        resetButton.setBounds(200, 300, 100, 30);

    }

    public void addComponentsToContainer() {

        add(userLabel);
        add(passwordLabel);
        add(userTextField);
       add(passwordField);
        add(showPassword);
        add(loginButton);
        add(resetButton);
    }

    public void addActionEvent() {
        loginButton.addActionListener(this);
        resetButton.addActionListener(this);
        showPassword.addActionListener(this);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loginButton) {
            String userText;
            String pwdText;
            userText = userTextField.getText();
            pwdText = passwordField.getText();

            if (userText.equalsIgnoreCase("client1") && pwdText.equalsIgnoreCase("123")) {
               if(c1==false){
                   JOptionPane.showMessageDialog(this, "Login Successful");
                    one =new client1();
                  Thread t1=new Thread(one);
                  t1.start();
                  c1=true;
               }
               else {
                   if(one.isVisible()==false){
                   JOptionPane.showMessageDialog(this, "Login Successful");
                   one.setVisible(true); }
                   else { JOptionPane.showMessageDialog(this, "already logged in");}
               }

            } else
                if (userText.equalsIgnoreCase("client2") && pwdText.equalsIgnoreCase("123")) {
                if(c2==false){
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    two =new client2();
                    Thread t1=new Thread(two);
                    t1.start();
                    c2=true;
                }
                else {
                    if(two.isVisible()==false){
                        JOptionPane.showMessageDialog(this, "Login Successful");

                        two.setVisible(true); }
                    else {JOptionPane.showMessageDialog(this, "already logged in");}
                }
            }
            else
                if (userText.equalsIgnoreCase("client3") && pwdText.equalsIgnoreCase("123")) {
                if(c3==false){
                    JOptionPane.showMessageDialog(this, "Login Successful");
                    three =new client3();
                    Thread t1=new Thread(three);
                    t1.start();
                    c3=true;
                }
                else {
                    if(three.isVisible()==false){
                        JOptionPane.showMessageDialog(this, "Login Successful");
                        three.setVisible(true); }
                    else {JOptionPane.showMessageDialog(this, "already logged in");}
                }
            }
            else {
                JOptionPane.showMessageDialog(this, "Invalid Username or Password");
            }

        }

        if (e.getSource() == resetButton) {
            userTextField.setText("");
            passwordField.setText("");
        }

        if (e.getSource() == showPassword) {
            if (showPassword.isSelected()) {
                passwordField.setEchoChar((char) 0);
            } else {
                passwordField.setEchoChar('*');
            }


        }
    }




//    public static void main(String[] a) {
//        LoginFrame frame = new LoginFrame();
//        frame.setTitle("Login Form");
//        frame.setVisible(true);
//        frame.setBounds(10, 10, 370, 600);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setResizable(false);
//
//    }

}
