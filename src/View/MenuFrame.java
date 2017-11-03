package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFrame extends JFrame implements ActionListener{

    public MenuFrame() {
        super("MenuFrame");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,100,500,400);
        setLayout(null);

        createComponents();
    }


    private void createComponents() {

        JButton addBookButton = new JButton("Sum");
        addBookButton.setBounds(300, 20,150,50);
        add(addBookButton);
        addBookButton.getModel().addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                System.out.println("asd");
            }
        });

    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        e.getSource(); //da razberem koi buton e natisnat i da gi obhodim s if elsi ili da gi nabutame v masiv za obhojdane
        System.out.println("On button clicked");
    }

}
