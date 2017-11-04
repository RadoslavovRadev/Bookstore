package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BookstoreFrame extends JFrame implements ActionListener{

    public BookstoreFrame() {
        super("Bookstore");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,100,500,500);
        setLayout(null);
        createComponents();
    }

    public void createComponents() {

    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");
    }

}
