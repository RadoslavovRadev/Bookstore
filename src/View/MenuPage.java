package View;

import javax.swing.*;

import java.awt.event.ActionEvent;

import static Controler.BookstoreFrameController.refreshFrame;

public class MenuPage extends BookstoreFrame {

    // Menu Page
    private JButton addNewBookButton;
    private JButton BookSearchByTitleButton;
    private JButton AllBooksListButton;
    private JButton SellBookButton;
    private JButton DeleteBookButton;
    private JButton ExitButton;

    @Override
    public void createComponents() {

        // Menu Page
        addNewBookButton = new JButton("Add A New Book");
        addNewBookButton.setBounds(175, 20,150,50);
        addNewBookButton.addActionListener(this);

        BookSearchByTitleButton = new JButton("Search For A Book");
        BookSearchByTitleButton.setBounds(175, 90,150,50);
        BookSearchByTitleButton.addActionListener(this);

        AllBooksListButton = new JButton("Book List");
        AllBooksListButton.setBounds(175, 160,150,50);
        AllBooksListButton.addActionListener(this);

        SellBookButton = new JButton("Sell A Book");
        SellBookButton.setBounds(175, 230,150,50);
        SellBookButton.addActionListener(this);

        DeleteBookButton = new JButton("Delete A Book");
        DeleteBookButton.setBounds(175, 300,150,50);
        DeleteBookButton.addActionListener(this);

        ExitButton = new JButton("Exit");
        ExitButton.setBounds(175, 370,150,50);
        ExitButton.addActionListener(this);

        showMenuPage();
    }

    public void showMenuPage() {
        add(addNewBookButton);
        add(BookSearchByTitleButton);
        add(AllBooksListButton);
        add(SellBookButton);
        add(DeleteBookButton);
        add(ExitButton);
    }

    public void removeMenuPage() {
        remove(addNewBookButton);
        remove(BookSearchByTitleButton);
        remove(AllBooksListButton);
        remove(SellBookButton);
        remove(DeleteBookButton);
        remove(ExitButton);
        refreshFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        //finding out which button has been pressed
        if (e.getSource() == addNewBookButton){
            removeMenuPage();
            //showAddBookPage();  this needs to show AddBookPage
        } else if (e.getSource() == ExitButton) {
            System.exit(0);
        }

    }

}
