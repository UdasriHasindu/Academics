import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingUtilities;

public class Question04 {

    public static void main(String[] arg){
        // Create a new frame
        JFrame frame = new JFrame("My First Frame");

        // Set the size of the frame to 300x200 pixels
        frame.setSize(300, 200);

        // Position the frame at 50 pixels from the top and 100 pixels from the left
        frame.setLocation(100, 50); // setLocation(x, y)

        // Set the operation to close the program when the frame is closed
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Make the frame visible
        frame.setVisible(true);

        
    }
    
}