//Kelvin Murithi Kimathi. CT100/G/22517/24
import javax.swing.*;
import java.awt.*;
class calculator{
    public static void main(String[]args){
        JFrame frame = new JFrame("Calculator");
        JPanel mainPanel = new JPanel(new BorderLayout());
        JTextField text = new JTextField(20);

        //setting the button panel array
        JPanel textPanel = new JPanel(new BorderLayout());
        text.setPreferredSize(new Dimension(300, 60)); // increase the text field height
        text.setFont(new Font("Arial", Font.BOLD, 24)); // bigger text
        text.setHorizontalAlignment(JTextField.CENTER); // aligning the calculator
        text.setBorder(BorderFactory.createEmptyBorder(10,10 ,10,10));
        textPanel.add(text, BorderLayout.CENTER);
        textPanel.setBorder(BorderFactory.createEmptyBorder(5, 5, 5, 5));

        //setting the button panel array
        JPanel buttonPanel = new JPanel();
        String[][] digits = {       //array for contents in the butons
            {"7","8","9","/"},
            {"4","5","6","*"},
            {"1","2","3","="},
            {"0",".","-","+"}
        };
        buttonPanel.setLayout(new GridLayout(4,4,2,2));
        for (int i=0; i<4; i++){
            for(int j=0; j<4; j++){
                JButton button = new JButton(digits[i][j]);
                buttonPanel.add(button);
                button.setForeground(Color.WHITE);       // text color
                button.setBackground(Color.DARK_GRAY); //button background color
            }
        }
       
        mainPanel.add(textPanel, BorderLayout.NORTH);
        mainPanel.add(buttonPanel, BorderLayout.CENTER);
        mainPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));
        frame.add(mainPanel,BorderLayout.CENTER);
        frame.setSize(300,300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}