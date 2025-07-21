package bank.managemet.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignupOne extends JFrame implements ActionListener {

long random;
    JTextField nameTextField, fnameTextField, emailTextField;
    JTextField addressTextField, cityTextField, stateTextField, pincodeTextField;
    JDateChooser dateChooser;
    JRadioButton male, female, married, unmarried, other;

    SignupOne() {
        setLayout(null);

        Random ran = new Random();
        random = Math.abs(ran.nextLong() % 9000L + 1000L);

        JLabel formno = new JLabel("APPLICATION FORM NO. " + random);
        formno.setFont(new Font("Raleway", Font.BOLD, 32));
        formno.setBounds(150, 30, 600, 40);
        add(formno);

        JLabel personalDetails = new JLabel("Page 1: Personal Details");
        personalDetails.setFont(new Font("Raleway", Font.PLAIN, 24));
        personalDetails.setBounds(280, 80, 500, 30);
        add(personalDetails);

        int y = 130;
        int xLabel = 100;
        int xText = 300;
        int width = 400;
        int height = 30;

        JLabel name = new JLabel("Name:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(xLabel, y += 50, 200, height);
        add(name);
        nameTextField = new JTextField();
        nameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        nameTextField.setBounds(xText, y, width, height);
        add(nameTextField);

        JLabel fname = new JLabel("Father's Name:");
        fname.setFont(new Font("Raleway", Font.BOLD, 20));
        fname.setBounds(xLabel, y += 50, 200, height);
        add(fname);
        fnameTextField = new JTextField();
        fnameTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        fnameTextField.setBounds(xText, y, width, height);
        add(fnameTextField);

        JLabel dob = new JLabel("Date of Birth:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(xLabel, y += 50, 200, height);
        add(dob);
        dateChooser = new JDateChooser();
        dateChooser.setBounds(xText, y, width, height);
        dateChooser.setForeground(new Color(105, 105, 105));
        add(dateChooser);

        JLabel gender = new JLabel("Gender:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(xLabel, y += 50, 200, height);
        add(gender);

        male = new JRadioButton("Male");
        male.setBounds(xText, y, 100, height);
        male.setBackground(Color.WHITE);
        add(male);

        female = new JRadioButton("Female");
        female.setBounds(xText + 110, y, 100, height);
        female.setBackground(Color.WHITE);
        add(female);

        other = new JRadioButton("Other");
        other.setBounds(xText + 220, y, 100, height);
        other.setBackground(Color.WHITE);
        add(other);

        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);
        genderGroup.add(other);

        JLabel email = new JLabel("Email Address:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(xLabel, y += 50, 200, height);
        add(email);
        emailTextField = new JTextField();
        emailTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        emailTextField.setBounds(xText, y, width, height);
        add(emailTextField);

        JLabel maritalStatus = new JLabel("Marital Status:");
        maritalStatus.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalStatus.setBounds(xLabel, y += 50, 200, height);
        add(maritalStatus);

        married = new JRadioButton("Married");
        married.setBounds(xText, y, 100, height);
        married.setBackground(Color.WHITE);
        add(married);

        unmarried = new JRadioButton("Unmarried");
        unmarried.setBounds(xText + 110, y, 120, height);
        unmarried.setBackground(Color.WHITE);
        add(unmarried);

        JRadioButton otherStatus = new JRadioButton("Other");
        otherStatus.setBounds(xText + 240, y, 100, height);
        otherStatus.setBackground(Color.WHITE);
        add(otherStatus);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(married);
        maritalGroup.add(unmarried);
        maritalGroup.add(otherStatus);

        JLabel address = new JLabel("Address:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(xLabel, y += 50, 200, height);
        add(address);
        addressTextField = new JTextField();
        addressTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        addressTextField.setBounds(xText, y, width, height);
        add(addressTextField);

        JLabel city = new JLabel("City:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(xLabel, y += 50, 200, height);
        add(city);
        cityTextField = new JTextField();
        cityTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        cityTextField.setBounds(xText, y, width, height);
        add(cityTextField);

        JLabel state = new JLabel("State:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(xLabel, y += 50, 200, height);
        add(state);
        stateTextField = new JTextField();
        stateTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        stateTextField.setBounds(xText, y, width, height);
        add(stateTextField);

        JLabel pincode = new JLabel("Pincode:");
        pincode.setFont(new Font("Raleway", Font.BOLD, 20));
        pincode.setBounds(xLabel, y += 50, 200, height);
        add(pincode);
        pincodeTextField = new JTextField();
        pincodeTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        pincodeTextField.setBounds(xText, y, width, height);
        add(pincodeTextField);

        JButton next=new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway",Font.BOLD,14) );
        next.setBounds(620,y+60,80,30);
        next.addActionListener(this);
        add(next);
        
        
        
        
        getContentPane().setBackground(Color.WHITE);
        setSize(900, 850);
        setLocation(300, 10);
        setVisible(true);
    }

   public void actionPerformed(ActionEvent ae) {
    String formno = "" + random; // long
    String name = nameTextField.getText();
    String fname = fnameTextField.getText();
    String dob = ((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();

    String gender = null;
    if (male.isSelected()) {
        gender = "Male";
    } else if (female.isSelected()) {
        gender = "Female";
    } else if (other.isSelected()) {
        gender = "Other";
    }

    String email = emailTextField.getText();

    String maritalStatus = null;
    if (married.isSelected()) {
        maritalStatus = "Married";
    } else if (unmarried.isSelected()) {
        maritalStatus = "Unmarried";
    } else {
        maritalStatus = "Other";
    }

    String address = addressTextField.getText();
    String city = cityTextField.getText();
    String state = stateTextField.getText();
    String pincode = pincodeTextField.getText();
    try {
        if (name.equals("")) {
            JOptionPane.showMessageDialog(null, "Name is required");
        } else{
             Conn c = new Conn();
        String query = "INSERT INTO signup VALUES('" + formno + "', '" + name + "', '" + fname + "', '" + dob + "', '" + gender + "', '" + email + "', '" + maritalStatus + "', '" + address + "', '" + city + "', '" + state + "', '" + pincode + "')";
        c.s.executeUpdate(query);
        
        setVisible(false);
        new SignupTwo(formno).setVisible(true);
        }
    }
    catch(Exception e){
        System.out.println(e);
    }
   }

    public static void main(String args[]) {
        new SignupOne();
    }
}
