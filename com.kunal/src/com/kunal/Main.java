package com.kunal;

import javax.swing.*;
import java.awt.*;

class fun extends JFrame {
    JPanel panel = new JPanel();
    JLabel label = new JLabel("Go away nega ! ");
    fun(){

        panel.setLayout(new FlowLayout());
        panel.setBounds(250,250,100,100);
        panel.setBackground(Color.pink);
        panel.add(label);

        this.setTitle("What you want nega !");
        this.setSize(500,500);
        this.add(panel);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
    }
}

public class Main {
    public static void main(String[] args) {
        fun fun = new fun();
    }
}