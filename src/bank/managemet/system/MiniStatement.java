package bank.managemet.system;

import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MiniStatement extends JFrame {

    MiniStatement(String pinnumber) {

        setTitle("Mini Statement");
        setLayout(null);

        JLabel bank = new JLabel("Indian Bank");
        bank.setBounds(150, 20, 200, 20);
        bank.setFont(new Font("System", Font.BOLD, 18));
        add(bank);

        JLabel card = new JLabel();
        card.setBounds(20, 60, 350, 20);
        add(card);

        JLabel balance = new JLabel();
        balance.setBounds(20, 490, 350, 20);
        balance.setFont(new Font("System", Font.PLAIN, 14));
        add(balance);

        JLabel mini = new JLabel();
        mini.setVerticalAlignment(SwingConstants.TOP);
        JScrollPane scrollPane = new JScrollPane(mini);
        scrollPane.setBounds(20, 100, 340, 370);
        add(scrollPane);

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from login where pin = '" + pinnumber + "'");
            while (rs.next()) {
                String cardNum = rs.getString("cardnumber");
                if (cardNum != null && cardNum.length() >= 16) {
                    card.setText("Card Number: " + cardNum.substring(0, 4) + "XXXXXXXX" + cardNum.substring(12));
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            Conn conn = new Conn();
            ResultSet rs = conn.s.executeQuery("select * from bank where pin = '" + pinnumber + "'");
            int bal = 0;
            StringBuilder sb = new StringBuilder("<html>");
            while (rs.next()) {
                String date = rs.getString("date");
                String type = rs.getString("type");
                String amount = rs.getString("amount");

                sb.append(date).append("&nbsp;&nbsp;&nbsp;&nbsp;")
                  .append(type).append("&nbsp;&nbsp;&nbsp;&nbsp;Rs ")
                  .append(amount).append("<br><br>");

                if (type.equalsIgnoreCase("Deposit")) {
                    bal += Integer.parseInt(amount);
                } else {
                    bal -= Integer.parseInt(amount);
                }
            }
            sb.append("</html>");
            mini.setText(sb.toString());
            balance.setText("Your current balance is Rs " + bal);
        } catch (Exception e) {
            System.out.println(e);
        }

        setSize(400, 600);
        setLocation(20, 20);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MiniStatement("");
    }
}
