package com.newqur.spider.template.ui;

import java.awt.Frame;
import java.awt.Rectangle;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

public class RightMenu extends JFrame{
	private JPopupMenu menu = new JPopupMenu();  
	
    public RightMenu() {  
    	setBounds(100,100,350,150);
    	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);  
        this.init();  
        this.add(menu);  
    }
    
    public void init(){
    	JPopupMenu menu = new JPopupMenu();  
		JMenuItem varItem = new JMenuItem("创建模版变量");
		this.add(menu);
    }
	
    public static void main(String[] args) {
		new RightMenu();
	}
}
