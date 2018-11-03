package com.hl7lint.presentation.swing;
import javax.swing.*;


public class main {
    public static String APP_TITLE = "HL7 Lint";

    public static void main(String[] args){
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        jFrame.setSize(200, 200);
        jFrame.setResizable(true);
        jFrame.setTitle(APP_TITLE);
        jFrame.setVisible(true);
    }
}
