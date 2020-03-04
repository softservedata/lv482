package com.softserve.edu.project;

import javax.swing.*;

public class TestTabbedPane {
    
    public static final int FRAME_WIDTH = 400;
    public static final int FRAME_HEIGHT = 325;

    public static void main(String[] args) {
        Dialog dialog=new Dialog();
        //створюємо вкладку
        JFrame frame = new JFrame();
        frame.setTitle ("Test Tabbed Pane");
        frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        JTabbedPane tabby = new JTabbedPane();
        
        //створюємо панелі для вкладок
        JPanel panel1= new JPanel();
        JPanel panel2 = new JPanel();      
        
        //додаємо на першу вкладку групу радіокнопок
        ButtonGroup radioGroup=new ButtonGroup();
        panel1.add(new JLabel("Ваш вік?"));
        JRadioButton radioButton;
        panel1.add(radioButton=new JRadioButton("12..18"));
        radioGroup.add(radioButton);
        panel1.add(radioButton=new JRadioButton("19..30"));
        radioGroup.add(radioButton);
        panel1.add(radioButton=new JRadioButton("30..60"));
        radioGroup.add(radioButton);
        
        //на другу панель додаємо просто напис
        panel2.add(new JLabel("Друга вкладка"));
        
        //додаємо панелі у JTabbedPane
        tabby.addTab("Перша", panel1);
        tabby.addTab("Друга", panel2);
       tabby.addTab("третя",dialog.getPanel());
        // додаємо вкладки у фрейм
        frame.add(tabby);
        frame.setVisible(true);

    }
}
