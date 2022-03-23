package com.OOP.railway;

import javax.swing.*;

public class Connector {
    String time,amt;
    static View v1;
    static Model m1;
    public static void main(String[] args) {
        v1 = new View();
        m1 = new Model();

       // View v = new View();
    }
    void calc(String s1,String s2){
        int diff;
        diff = Integer.parseInt(m1.stopvalues.get(s1).toString())+Integer.parseInt(m1.stopvalues.get(s2).toString());
        m1.timing =1130+Integer.parseInt(m1.stopvalues.get(s1).toString())*100;
        m1.amount = 100+diff*100;
        time = Integer.toString(m1.timing);
        amt = Integer.toString(m1.amount);

    }
}
