package bank.managemet.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignupThree extends JFrame implements ActionListener{

    JRadioButton r1, r2, r3, r4;
    JCheckBox c1, c2, c3, c4, c5, c6, c7;
    JButton submit, cancel;
    String formno;

    SignupThree( String formno) {
        this.formno=formno;
        setLayout(null);
        getContentPane().setBackground(Color.WHITE);

        JLabel l1 = new JLabel("Page 3: Account Details");
        l1.setFont(new Font("Raleway", Font.BOLD, 22));
        l1.setBounds(280, 40, 400, 40);
        add(l1);

        // Account Type
        JLabel type = new JLabel("Account Type");
        type.setFont(new Font("Raleway", Font.BOLD, 22));
        type.setBounds(100, 140, 200, 30);
        add(type);

        r1 = new JRadioButton("Saving Account");
        r1.setFont(new Font("Raleway", Font.PLAIN, 16));
        r1.setBackground(Color.WHITE);
        r1.setBounds(100, 180, 150, 20);
        add(r1);

        r2 = new JRadioButton("Fixed Deposit Account");
        r2.setFont(new Font("Raleway", Font.PLAIN, 16));
        r2.setBackground(Color.WHITE);
        r2.setBounds(350, 180, 250, 20);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway", Font.PLAIN, 16));
        r3.setBackground(Color.WHITE);
        r3.setBounds(100, 220, 250, 20);
        add(r3);

        r4 = new JRadioButton("Recurring Account");
        r4.setFont(new Font("Raleway", Font.PLAIN, 16));
        r4.setBackground(Color.WHITE);
        r4.setBounds(350, 220, 250, 20);
        add(r4);

        ButtonGroup accountGroup = new ButtonGroup();
        accountGroup.add(r1);
        accountGroup.add(r2);
        accountGroup.add(r3);
        accountGroup.add(r4);

        // Card Number
        JLabel card = new JLabel("Card Number");
        card.setFont(new Font("Raleway", Font.BOLD, 22));
        card.setBounds(100, 280, 200, 30);
        add(card);

        JLabel number = new JLabel("XXXX-XXXX-XXXX-4184");
        number.setFont(new Font("Raleway", Font.BOLD, 22));
        number.setBounds(330, 280, 300, 30);
        add(number);

        JLabel cardDetails = new JLabel("Your 16 Digit Card Number");
        cardDetails.setFont(new Font("Raleway", Font.PLAIN, 12));
        cardDetails.setBounds(100, 310, 300, 20);
        add(cardDetails);

        // Pin Number
        JLabel pin = new JLabel("PIN Number");
        pin.setFont(new Font("Raleway", Font.BOLD, 22));
        pin.setBounds(100, 350, 200, 30);
        add(pin);

        JLabel pinVal = new JLabel("XXXX");
        pinVal.setFont(new Font("Raleway", Font.BOLD, 22));
        pinVal.setBounds(330, 350, 300, 30);
        add(pinVal);

        JLabel pinDetails = new JLabel("Your 4 Digit PIN Number");
        pinDetails.setFont(new Font("Raleway", Font.PLAIN, 12));
        pinDetails.setBounds(100, 380, 300, 20);
        add(pinDetails);

        // Services
        JLabel services = new JLabel("Services Required:");
        services.setFont(new Font("Raleway", Font.BOLD, 22));
        services.setBounds(100, 420, 250, 30);
        add(services);

        c1 = new JCheckBox("ATM Card");
        c1.setFont(new Font("Raleway", Font.PLAIN, 16));
        c1.setBackground(Color.WHITE);
        c1.setBounds(100, 460, 200, 30);
        add(c1);

        c2 = new JCheckBox("Internet Banking");
        c2.setFont(new Font("Raleway", Font.PLAIN, 16));
        c2.setBackground(Color.WHITE);
        c2.setBounds(350, 460, 200, 30);
        add(c2);

        c3 = new JCheckBox("Mobile Banking");
        c3.setFont(new Font("Raleway", Font.PLAIN, 16));
        c3.setBackground(Color.WHITE);
        c3.setBounds(100, 500, 200, 30);
        add(c3);

        c4 = new JCheckBox("Email & SMS Alerts");
        c4.setFont(new Font("Raleway", Font.PLAIN, 16));
        c4.setBackground(Color.WHITE);
        c4.setBounds(350, 500, 200, 30);
        add(c4);

        c5 = new JCheckBox("E-Statement");
        c5.setFont(new Font("Raleway", Font.PLAIN, 16));
        c5.setBackground(Color.WHITE);
        c5.setBounds(100, 540, 200, 30);
        add(c5);

        c6 = new JCheckBox("Check Book");
        c6.setFont(new Font("Raleway", Font.PLAIN, 16));
        c6.setBackground(Color.WHITE);
        c6.setBounds(350, 540, 200, 30);
        add(c6);

        c7 = new JCheckBox("I hereby declare the above details are correct");
        c7.setFont(new Font("Raleway", Font.PLAIN, 16));
        c7.setBackground(Color.WHITE);
        c7.setBounds(100, 580, 500, 30);
        add(c7);
        

        submit = new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD , 14));
        submit.setBounds(250,640,100,30);
        submit.addActionListener(this);
        add(submit);
        
         cancel = new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD , 14));
        cancel.setBounds(420,640,100,30);
        cancel.addActionListener(this);
        add(cancel);
        
        getContentPane().setBackground(Color.WHITE);
        
        setSize(850, 720);
        setLocation(350, 0);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()== submit){
            String accountType = null;
            if(r1.isSelected()){
                accountType="Saving Account";
            }
            else if(r2.isSelected()){
                accountType="Fixed Deposit Account";
            }
            else if(r3.isSelected()){
                accountType="Current Account";
            }
            else if(r4.isSelected()){
                accountType="Reccuring Deposit Account";
            }
            Random random = new Random();
            String cardnumber = "504093" + String.format("%010d", Math.abs(random.nextLong() % 10000000000L));
            String pinnumber = String.format("%04d", Math.abs(random.nextInt() % 10000));
            String facility = "";

            if(c1.isSelected()){
              facility=facility  + " ATM Card";
            }
            else if(c2.isSelected()){
                 facility=facility  + " Internet Banking";
        }
            else if(c3.isSelected()){
                 facility=facility  + " Mobile Banking";
        }
            else if(c4.isSelected()){
                 facility=facility  + " EMAIL & SMAS Alerts";
        }
            else if(c5.isSelected()){
                 facility=facility  + " Cheque Book";
        }
            else if(c6.isSelected()){
                 facility=facility  + " E=Statement";
        }
            try {
                if (accountType == null) {
                    JOptionPane.showMessageDialog(null, "Account Type is Required");
                } else {
                    Conn conn = new Conn();
                  String query = "insert into signupthree values('" + formno + "','" + accountType + "','" + cardnumber + "','" + pinnumber + "','" + facility + "')";
                  String query2 = "insert into login values('" + formno + "','" + cardnumber + "','" + pinnumber + "')";
                  conn.s.executeUpdate(query);
                  conn.s.executeUpdate(query2);


                    JOptionPane.showMessageDialog(null,"Card Number: "+cardnumber+"\n pin: "+pinnumber);
                }
                setVisible(false);
                new Deposit(pinnumber).setVisible(false);
            } catch (Exception e) {
                e.printStackTrace();
            }

        } else if (ae.getSource() == cancel) {
       setVisible(false);
       new Login().setVisible(true);
        }
    }

    public static void main(String[] args) {
        new SignupThree(""); 
    }
}