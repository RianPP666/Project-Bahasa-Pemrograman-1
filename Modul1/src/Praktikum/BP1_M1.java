/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum;

import java.awt.*;

public class BP1_M1 extends Frame{
    public static void main(String[]args){
        BP1_M1 test = new BP1_M1();
    }
        public BP1_M1(){
            super("BP1_M1");
            setSize(300, 100);
            Panel panelTombol = new Panel();
            panelTombol.add(new Button ("Mulai"));
            panelTombol.add(new Button ("Selesai"));
            add ("South", panelTombol);
            show();            
        }
}

