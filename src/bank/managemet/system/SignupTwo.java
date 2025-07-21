package bank.managemet.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class SignupTwo extends JFrame implements ActionListener {

    JTextField panTextField, aadharTextField;
    JComboBox<String> religionComboBox, categoryComboBox, incomeComboBox, educationComboBox, occupationComboBox;
    JRadioButton seniorYes, seniorNo, accYes, accNo;
    ButtonGroup seniorGroup, accGroup;
    String formno;

    SignupTwo(String formno) {
        this.formno = formno;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.PLAIN, 24));
        additionalDetails.setBounds(280, 80, 500, 30);
        add(additionalDetails);

        int y = 130;
        int xLabel = 100;
        int xText = 300;
        int width = 400;
        int height = 30;

        JLabel religion = new JLabel("Religion:");
        religion.setFont(new Font("Raleway", Font.BOLD, 20));
        religion.setBounds(xLabel, y += 50, 200, height);
        add(religion);

        religionComboBox = new JComboBox<>(new String[]{"Hindu", "Muslim", "Christian", "Sikh", "Jain", "Buddhist", "Other"});
        religionComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        religionComboBox.setBounds(xText, y, width, height);
        religionComboBox.setBackground(Color.WHITE);
        add(religionComboBox);

        JLabel category = new JLabel("Category:");
        category.setFont(new Font("Raleway", Font.BOLD, 20));
        category.setBounds(xLabel, y += 50, 200, height);
        add(category);

        categoryComboBox = new JComboBox<>(new String[]{"General", "OBC", "BC", "SC/ST", "OC", "Others"});
        categoryComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        categoryComboBox.setBounds(xText, y, width, height);
        categoryComboBox.setBackground(Color.WHITE);
        add(categoryComboBox);

        JLabel income = new JLabel("Income:");
        income.setFont(new Font("Raleway", Font.BOLD, 20));
        income.setBounds(xLabel, y += 50, 200, height);
        add(income);

        incomeComboBox = new JComboBox<>(new String[]{"Null", "< 1.5 Lakh", "< 5 Lakh", "< 10 Lakh", "> 10 Lakh"});
        incomeComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        incomeComboBox.setBounds(xText, y, width, height);
        incomeComboBox.setBackground(Color.WHITE);
        add(incomeComboBox);

        JLabel educationLabel = new JLabel("Education");
        educationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        educationLabel.setBounds(xLabel, y += 50, 200, height);
        add(educationLabel);

        JLabel qualificationLabel = new JLabel("Qualification:");
        qualificationLabel.setFont(new Font("Raleway", Font.BOLD, 20));
        qualificationLabel.setBounds(xLabel, y += 40, 200, height);
        add(qualificationLabel);

        educationComboBox = new JComboBox<>(new String[]{"Non-Graduate", "Graduate", "Post-Graduate", "Doctorate", "Others"});
        educationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        educationComboBox.setBounds(xText, y, width, height);
        educationComboBox.setBackground(Color.WHITE);
        add(educationComboBox);

        JLabel occupation = new JLabel("Occupation:");
        occupation.setFont(new Font("Raleway", Font.BOLD, 20));
        occupation.setBounds(xLabel, y += 50, 200, height);
        add(occupation);

        occupationComboBox = new JComboBox<>(new String[]{"Salaried", "Self-Employed", "Unemployed", "Student", "Retired", "Other"});
        occupationComboBox.setFont(new Font("Raleway", Font.BOLD, 14));
        occupationComboBox.setBounds(xText, y, width, height);
        occupationComboBox.setBackground(Color.WHITE);
        add(occupationComboBox);

        JLabel panno = new JLabel("PAN Number:");
        panno.setFont(new Font("Raleway", Font.BOLD, 20));
        panno.setBounds(xLabel, y += 50, 200, height);
        add(panno);

        panTextField = new JTextField();
        panTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        panTextField.setBounds(xText, y, width, height);
        add(panTextField);

        JLabel aadharno = new JLabel("Aadhar Number:");
        aadharno.setFont(new Font("Raleway", Font.BOLD, 20));
        aadharno.setBounds(xLabel, y += 50, 200, height);
        add(aadharno);

        aadharTextField = new JTextField();
        aadharTextField.setFont(new Font("Raleway", Font.BOLD, 14));
        aadharTextField.setBounds(xText, y, width, height);
        add(aadharTextField);

        JLabel seniorcitizen = new JLabel("Senior Citizen:");
        seniorcitizen.setFont(new Font("Raleway", Font.BOLD, 20));
        seniorcitizen.setBounds(xLabel, y += 50, 200, height);
        add(seniorcitizen);

        seniorYes = new JRadioButton("Yes");
        seniorYes.setBounds(xText, y, 60, height);
        seniorYes.setFont(new Font("Raleway", Font.PLAIN, 14));
        seniorYes.setBackground(Color.WHITE);
        add(seniorYes);

        seniorNo = new JRadioButton("No");
        seniorNo.setBounds(xText + 70, y, 60, height);
        seniorNo.setFont(new Font("Raleway", Font.PLAIN, 14));
        seniorNo.setBackground(Color.WHITE);
        add(seniorNo);

        seniorGroup = new ButtonGroup();
        seniorGroup.add(seniorYes);
        seniorGroup.add(seniorNo);

        JLabel existingacc = new JLabel("Existing Account:");
        existingacc.setFont(new Font("Raleway", Font.BOLD, 20));
        existingacc.setBounds(xLabel, y += 50, 200, height);
        add(existingacc);

        accYes = new JRadioButton("Yes");
        accYes.setBounds(xText, y, 60, height);
        accYes.setFont(new Font("Raleway", Font.PLAIN, 14));
        accYes.setBackground(Color.WHITE);
        add(accYes);

        accNo = new JRadioButton("No");
        accNo.setBounds(xText + 70, y, 60, height);
        accNo.setFont(new Font("Raleway", Font.PLAIN, 14));
        accNo.setBackground(Color.WHITE);
        add(accNo);

        accGroup = new ButtonGroup();
        accGroup.add(accYes);
        accGroup.add(accNo);

        JButton next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, y + 60, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(900, 850);
        setLocation(300, 10);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        String religion = (String) religionComboBox.getSelectedItem();
        String category = (String) categoryComboBox.getSelectedItem();
        String income = (String) incomeComboBox.getSelectedItem();
        String education = (String) educationComboBox.getSelectedItem();
        String occupation = (String) occupationComboBox.getSelectedItem();
        String pan = panTextField.getText();
        String aadhar = aadharTextField.getText();
        String seniorCitizen = seniorYes.isSelected() ? "Yes" : "No";
        String existingAccount = accYes.isSelected() ? "Yes" : "No";

        try {
            Conn c = new Conn();
            String query = "INSERT INTO signuptwo VALUES('" + formno + "', '" + religion + "', '" + category + "', '" + income + "', '" + education + "', '" + occupation + "', '" + pan + "', '" + aadhar + "', '" + seniorCitizen + "', '" + existingAccount + "')";
            c.s.executeUpdate(query);
            JOptionPane.showMessageDialog(null, "Details Saved Successfully");
            setVisible(false);
            new SignupThree(formno).setVisible(true);
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public static void main(String args[]) {
        new SignupTwo("");
    }
}
