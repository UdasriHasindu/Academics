import javax.swing.*;
import java.awt.*;

public class RegistrationForm extends JFrame {


    final int FRAME_WIDTH = 1000;
    final int FRAME_HEIGHT = 800;
    final int FRAME_X_COR = 600;
    final int FRAME_Y_COR = 150;


    public RegistrationForm(){

        setTitle("Registration Form");
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setLocation(FRAME_X_COR, FRAME_Y_COR);


        //creating content object to access
        Container content = getContentPane();
        content.setLayout(null);

        // for title
        JLabel titleLable = new JLabel("Registration Form");
        titleLable.setSize(350, 50);
        titleLable.setFont(new Font("Arial", Font.BOLD, 25));
        titleLable.setLocation(350, 5);
        content.add(titleLable);

        // Name
        {
            // for name
            JLabel nameLable = new JLabel("Name ");
            nameLable.setSize(100, 30);
            nameLable.setFont(new Font("Arial", Font.PLAIN, 15));
            nameLable.setLocation(100, 100);
            content.add(nameLable);

            // for name text field
            JTextField nameField = new JTextField();
            nameField.setSize(200, 20);
            nameField.setLocation(170, 105);
            nameLable.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(nameField);
        }

        // Mobile
        {
            // for mobile
            JLabel mobileLable = new JLabel("Mobile ");
            mobileLable.setSize(100, 30);
            mobileLable.setFont(new Font("Arial", Font.PLAIN, 15));
            mobileLable.setLocation(100, 150);
            content.add(mobileLable);

            // for mobile text field
            JTextField mobileField = new JTextField();
            mobileField.setSize(200, 20);
            mobileField.setLocation(170, 155);
            mobileField.setFont(new Font("Arial", Font.PLAIN, 15));
            content.add(mobileField);
        }

        // Gender
        {
            // for gender
            JLabel genderLable = new JLabel("Gender ");
            genderLable.setSize(100, 30);
            genderLable.setFont(new Font("Arial", Font.PLAIN, 15));
            genderLable.setLocation(100, 200);
            content.add(genderLable);

            // radio for male
            JRadioButton maleRadio = new JRadioButton("Male");
            maleRadio.setFont(new Font("Arial", Font.PLAIN, 15));
            maleRadio.setSelected(false);
            maleRadio.setSize(100, 30);
            maleRadio.setLocation(170, 200);
            content.add(maleRadio);

            // radio for female
            JRadioButton femaleRadio = new JRadioButton("Female");
            femaleRadio.setFont(new Font("Arial", Font.PLAIN, 15));
            femaleRadio.setSelected(false);
            femaleRadio.setSize(100, 30);
            femaleRadio.setLocation(270, 200);
            content.add(femaleRadio);

        }

        // DOB
        {
            // for DOB
            JLabel dobLable = new JLabel("DOB ");
            dobLable.setSize(100, 30);
            dobLable.setFont(new Font("Arial", Font.PLAIN, 15));
            dobLable.setLocation(100, 250);
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
            dayBox.setSize(50, 20);
            dayBox.setFont(new Font("Arial", Font.PLAIN, 15));
            dayBox.setLocation(170, 255);
            content.add(dayBox);

            // for day
            JComboBox monthBox = new JComboBox<>(months);
            monthBox.setSize(80, 20);
            monthBox.setFont(new Font("Arial", Font.PLAIN, 15));
            monthBox.setLocation(220, 255);
            content.add(monthBox);

            // for years
            JComboBox yearBox = new JComboBox<>(years);
            yearBox.setSize(80, 20);
            yearBox.setFont(new Font("Arial", Font.PLAIN, 15));
            yearBox.setLocation(300, 255);
            content.add(yearBox);

        }

        // Address
        {
            // for address
            JLabel nameLable = new JLabel("Address ");
            nameLable.setSize(100, 30);
            nameLable.setFont(new Font("Arial", Font.PLAIN, 15));
            nameLable.setLocation(100, 300);
            content.add(nameLable);

            // text Area
            JTextArea addressText = new JTextArea();
            addressText.setSize(250, 100);
            addressText.setFont(new Font("Arial", Font.PLAIN, 15));
            addressText.setLocation(170, 305);
            addressText.setLineWrap(true);
            content.add(addressText);
        }

        // checkbox
        {
            JCheckBox conditions = new JCheckBox("Accept terms and Coditions");
            conditions.setSize(200, 30);
            conditions.setLocation(170, 450);
            conditions.setFont(new Font("Arial", Font.PLAIN, 13));
            content.add(conditions);
        }

        // Button
        {
            JButton submitButton = new JButton("Submit");
            submitButton.setSize(100,30);
            submitButton.setLocation(150, 550);
            content.add(submitButton);

            JButton resetButton = new JButton("Reset");
            resetButton.setSize(100,30);
            resetButton.setLocation(300, 550);
            content.add(resetButton);
        }

        // lable
        {
            JLabel response = new JLabel("According to the event handling, success or fail to submit");
            response.setSize(300, 30);
            response.setLocation(150, 600);
            content.add(response);
        }

        {
            JTextArea comment = new JTextArea();
            comment.setLineWrap(true);
            comment.setSize(300, 500);
            comment.setLocation(600, 100);
            content.add(comment);
        }











    }



}
