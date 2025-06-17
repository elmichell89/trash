import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {
        
        JFrame frame = new JFrame("¿Hoy es Lunes?");
        JButton button = new JButton("¿Hoy es lunes?");
        JLabel label = new JLabel("");
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setResizable(false);
        frame.setLayout(null);
        
        button.setFont(new Font("Arial", Font.PLAIN, 30));
        label.setFont(new Font("Arial", Font.PLAIN, 50));
        
        int buttonWidth = 300;
        int buttonHeight = 50;
        int labelWidth = 80;
        int labelHeight = 100;
        
        int frameWidth = frame.getWidth();
        int frameHeight = frame.getHeight();
        
        int buttonX = (frameWidth - buttonWidth) / 2;
        int buttonY = 80;

        int labelX = (frameWidth - labelWidth) / 2;
        int labelY = 180;
        
        label.setBounds(labelX, labelY, labelWidth, labelHeight);
        button.setBounds(buttonX, buttonY, buttonWidth, buttonHeight);
        
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                DayOfWeek today = LocalDate.now().getDayOfWeek();
                if(today == DayOfWeek.MONDAY){
                    label.setText("Si");
                    label.setForeground(Color.green);
                }else{
                    label.setText("No");
                    label.setForeground(Color.red);
                }
            }
        });
	frame.add(button);
        frame.add(label);
        frame.setVisible(true);
    }

}