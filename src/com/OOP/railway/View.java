package com.OOP.railway;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class View extends JFrame implements ActionListener {
    JFrame f;
    JTextField firstname,lastname,age,time,amt;
    JLabel lfname,lsname,lage,gender,dest,lfrm,lto,ltime,lamt;
    String[] genderselect = {"male","female","transgender","rather not say"};
    String[] stop = {"station1","station2","station3","station4","station5"};
    JComboBox j1,frm,to ;
    JButton check,submit;

    boolean checked = false;



    Connector c;
    int method;
    View(){
        f=new JFrame();
        firstname = new JTextField(15);
        lastname = new JTextField(15);
        age = new JTextField(10);
        lfname = new JLabel("First Name :");
        lsname = new JLabel("Last Name :");
        lage = new JLabel("Age\t\t:");
        gender =new JLabel("Gender\t\t:");
        dest = new JLabel("Destination");
        lfrm = new JLabel("From ");
        lto = new JLabel("TO");
        check = new JButton("Check");
        submit = new JButton("Proceed");
        ltime = new JLabel("Time ");
        lamt = new JLabel("Amount");
        time = new JTextField();
        amt = new JTextField();

        j1 = new JComboBox(genderselect);
        frm = new JComboBox(stop);
        to = new JComboBox(stop);

        lfname.setBounds(50,50,70,20);
        firstname.setBounds(130,50,100,30);
        lsname.setBounds(240,50,70,20);
        lastname.setBounds(320,50,100,30);
        lage.setBounds(50,100,70,20);
        age.setBounds(130,100,50,30);
        dest.setBounds(200,150,100,30);
        lfrm.setBounds(50,200,70,20);
        lto.setBounds(280,200,70,20);
        ltime.setBounds(50,300,70,20);
        time.setBounds(130,300,100,30);
        lamt.setBounds(240,300,70,30);
        amt.setBounds(320,300,100,30);

        check.setBounds(200,250,100,30);
        submit.setBounds(200,350,100,30);
        //lto.setBounds();

        gender.setBounds(240,100,70,20);
        j1.setBounds(320,100,100,30);
        frm.setBounds(130,200,100,30);
        to.setBounds(320,200,100,30);

       // check.setPreferredSize(new Dimension(100,30));



        f.add(lfname);
        f.add(firstname);
        f.add(lage);
        f.add(age);
        f.add(lsname);
        f.add(lastname);
        f.add(j1);
        f.add(gender);
        f.add(dest);
        f.add(lfrm);
        f.add(frm);
        f.add(lto);
        f.add(to);
        f.add(check);
        f.add(ltime);
        f.add(time);
        f.add(lamt);
        f.add(amt);
        f.add(submit);

        check.addActionListener(this);
        submit.addActionListener(this);

        f.setSize(500,600);
        //f.setLayout(new FlowLayout());
        f.setTitle("Ticket Booking");
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        c=new Connector();
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==check){
            if(firstname.getText().equals("")||lastname.getText().equals("")||age.getText().equals("")){
                JOptionPane.showMessageDialog(null,"Enter the details","Error",0);
            }
            else if(frm.getSelectedItem().toString()==to.getSelectedItem().toString()){
                JOptionPane.showMessageDialog(null,"Choose different destination","Error",0);
            }else {
                c.calc(frm.getSelectedItem().toString(), to.getSelectedItem().toString());
                time.setText(c.time);
                amt.setText(c.amt);
                checked = true;
            }
        }
        else{
            if(checked){
                JOptionPane.showMessageDialog(null,"Ticket Booked Successfully","Success",1);
            }
            else{
                JOptionPane.showMessageDialog(null,"Check train availability first","Error",0);
            }

        }
    }
}
