import javax.swing.*;
import java.awt.*;

public class SignIn_Up extends JFrame {

    final int preferredWidth = 100;        
    final int preferredHeight = 35;
    int Y = 20;

    public SignIn_Up() {

        setTitle("Hello there..👋");
        setSize(500, 800);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // to wrap the content
        Container content = getContentPane();
        content.setLayout(null);


        // Signup 
        {
            JLabel titleLabel1 = new JLabel("Sign Up");
            titleLabel1.setFont(new Font("Arial", Font.BOLD, 25));
            titleLabel1.setForeground(Color.BLUE);
            titleLabel1.setHorizontalAlignment(SwingConstants.CENTER); // Centers the text in the label
            
            // Get the preferred size
            Dimension preferredSize = titleLabel1.getPreferredSize();
            titleLabel1.setSize(preferredSize); // Set the label size to the preferred size

            // Position the label at the center of the frame
            int x = (getWidth() - preferredSize.width) / 2;
            titleLabel1.setLocation(x, Y);
            content.add(titleLabel1);
        }

        // get name
        {
            JLabel nameLabel = new JLabel("Name");
            nameLabel.setSize(preferredWidth, preferredHeight);
            nameLabel.setFont(new Font("Arial", Font.BOLD, 20));
            nameLabel.setLocation(30,60);
            content.add(nameLabel);

            JTextField nameField = new JTextField();
            nameField.setSize(250, 30);
            nameField.setLocation(150, 65);
            nameField.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(nameField);
        }

        // get email
        {
            JLabel emailLabel = new JLabel("Email");
            emailLabel.setSize(preferredWidth, preferredHeight);
            emailLabel.setFont(new Font("Arial", Font.BOLD, 20));
            emailLabel.setLocation(30,110);
            content.add(emailLabel);

            JTextField emailField = new JTextField();
            emailField.setSize(250, 30);
            emailField.setLocation(150, 115);
            emailField.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(emailField);
        }

        // gender
        {
            JLabel gender = new JLabel("Gender");
            gender.setSize(preferredWidth, preferredHeight);
            gender.setFont(new Font("Arial", Font.BOLD, 20));
            gender.setLocation(30,160);
            content.add(gender);

            JRadioButton maleRadio = new JRadioButton("Male");
            maleRadio.setFont(new Font("Arial", Font.PLAIN, 18));
            maleRadio.setSize(preferredWidth, preferredHeight);
            maleRadio.setSelected(false);
            maleRadio.setLocation(150, 160);
            content.add(maleRadio);            
            
            JRadioButton femaleRadio = new JRadioButton("Female");
            femaleRadio.setFont(new Font("Arial", Font.PLAIN, 18));
            femaleRadio.setSize(preferredWidth, preferredHeight);
            femaleRadio.setSelected(false);
            femaleRadio.setLocation(280, 160);
            content.add(femaleRadio);
        }

        // DOB
        {
            JLabel dobLable = new JLabel("Birthday ");
            dobLable.setSize(preferredWidth, preferredHeight);
            dobLable.setFont(new Font("Arial", Font.BOLD, 20));
            dobLable.setLocation(30, 210);
            content.add(dobLable);

            // for comboBox

            String[] days = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15",
                    "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31"};

            String[] months = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};

            String[] years = {"1990", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999",
                    "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009",
                    "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019",
                    "2020", "2021", "2022", "2023", "2024"};

            // for day
            JComboBox dayBox = new JComboBox<>(days);
            dayBox.setSize(60, 30);
            dayBox.setFont(new Font("Arial", Font.PLAIN, 15));
            dayBox.setLocation(150, 210);
            content.add(dayBox);

            // for day
            JComboBox monthBox = new JComboBox<>(months);
            monthBox.setSize(90, 30);
            monthBox.setFont(new Font("Arial", Font.PLAIN, 15));
            monthBox.setLocation(210, 210);
            content.add(monthBox);

            // for years
            JComboBox yearBox = new JComboBox<>(years);
            yearBox.setSize(90, 30);
            yearBox.setFont(new Font("Arial", Font.PLAIN, 15));
            yearBox.setLocation(300, 210);
            content.add(yearBox);
        }

        // password
        {
            JLabel passwordLabel = new JLabel("Password");
            passwordLabel.setSize(preferredWidth, preferredHeight);
            passwordLabel.setFont(new Font("Arial", Font.BOLD, 20));
            passwordLabel.setLocation(30,260);
            content.add(passwordLabel);

            JTextField passwordField = new JTextField();
            passwordField.setSize(250, 30);
            passwordField.setLocation(150, 265);
            passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(passwordField);
        }

        // conditions
        {
            JCheckBox conditions = new JCheckBox(" I am not a robot.");
            conditions.setSize(400, 30);
            conditions.setFont(new Font("Arial", Font.PLAIN, 18));
            conditions.setLocation(30, 310);
            content.add(conditions);
        }

        //signup button
        {
            JButton signupButton = new JButton("Sign Up");
            signupButton.setFont(new Font("Arial", Font.BOLD, 25));
            signupButton.setBackground(Color.BLUE);
            signupButton.setForeground(Color.WHITE);
            signupButton.setLocation(30, 370);
            signupButton.setSize(440, 50);
            content.add(signupButton);
        }

        // Signin 
        {
            JLabel titleLabel2 = new JLabel("Sign In");
            titleLabel2.setFont(new Font("Arial", Font.BOLD, 25));
            titleLabel2.setForeground(Color.BLUE);
            titleLabel2.setHorizontalAlignment(SwingConstants.CENTER); // Centers the text in the label
            
            // Get the preferred size
            Dimension preferredSize = titleLabel2.getPreferredSize();
            titleLabel2.setSize(preferredSize); // Set the label size to the preferred size

            // Position the label at the center of the frame
            int x = (getWidth() - preferredSize.width) / 2;
            int y = 450;
            titleLabel2.setLocation(x, y);
            content.add(titleLabel2);
        }

        // get email
        {
            JLabel emailLabel = new JLabel("Email");
            emailLabel.setSize(preferredWidth, preferredHeight);
            emailLabel.setFont(new Font("Arial", Font.BOLD, 20));
            emailLabel.setLocation(30,500);
            content.add(emailLabel);

            JTextField emailField = new JTextField();
            emailField.setSize(250, 30);
            emailField.setLocation(150, 505);
            emailField.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(emailField);
        }

        // password
        {
            JLabel passwordLabel = new JLabel("Password");
            passwordLabel.setSize(preferredWidth, preferredHeight);
            passwordLabel.setFont(new Font("Arial", Font.BOLD, 20));
            passwordLabel.setLocation(30,550);
            content.add(passwordLabel);

            JTextField passwordField = new JTextField();
            passwordField.setSize(250, 30);
            passwordField.setLocation(150, 555);
            passwordField.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(passwordField);
        }

        //signup button
        {
            JButton signupButton = new JButton("Sign In");
            signupButton.setFont(new Font("Arial", Font.BOLD, 25));
            signupButton.setBackground(Color.BLUE);
            signupButton.setForeground(Color.WHITE);
            signupButton.setSize(440, 50);
            signupButton.setLocation(30, 630);
            content.add(signupButton);
        }

    }
}