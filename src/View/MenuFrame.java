package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static Controler.Demo.refreshFrame;

public class MenuFrame extends JFrame implements ActionListener{

    // Menu Page
    private JButton addNewBookButton;
    private JButton BookSearchByTitleButton;
    private JButton AllBooksListButton;
    private JButton SellBookButton;
    private JButton DeleteBookButton;
    private JButton ExitButton;

    // Add Book Page
    private JLabel AddBookPageTitleLabel;
    private JLabel titleLabel;
    private JTextField titleField;
    private JLabel authorLabel;
    private JTextField authorField;
    private JLabel priceLabel;
    private JTextField priceField;
    private JLabel publishingHouseLabel;
    private JTextField publishingHouseField;
    private JLabel isForeignLabel;
    private JCheckBox isForeignCheckBox;
    private JLabel stockUnitsLabel;
    private JTextField stockUnitsField;
    private JButton addBookButton;
    private JButton cancelButton;


    public MenuFrame() {
        super("Bookstore");

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,100,500,500);
        setLayout(null);
        createComponents();
    }

    private void createComponents() {

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

        // Add Book Page
        AddBookPageTitleLabel = new JLabel("Book Details:");
        AddBookPageTitleLabel.setBounds(220, 5, 80,50);

        titleLabel = new JLabel("Title:");
        titleLabel.setBounds(40, 50, 80,20);

        titleField = new JTextField();
        titleField.setBounds(120, 50, 310,20);

        authorLabel = new JLabel("Author:");
        authorLabel.setBounds(40, 90, 80,20);

        authorField = new JTextField();
        authorField.setBounds(120, 90, 310,20);

        publishingHouseLabel = new JLabel("Publisher:");
        publishingHouseLabel.setBounds(40, 130, 80,20);

        publishingHouseField = new JTextField();
        publishingHouseField.setBounds(120, 130, 310,20);

        priceLabel = new JLabel("Price:");
        priceLabel.setBounds(40, 170, 80,20);

        priceField = new JTextField();
        priceField.setBounds(120, 170, 110,20);

        stockUnitsLabel = new JLabel("Units:");
        stockUnitsLabel.setBounds(280, 170, 80,20);

        stockUnitsField = new JTextField();
        stockUnitsField.setBounds(320, 170, 110,20);

        isForeignLabel = new JLabel("Foreign Literature");
        isForeignLabel.setBounds(150, 210, 140,20);

        isForeignCheckBox = new JCheckBox();
        isForeignCheckBox.setBounds(116, 210, 20,20);

        addBookButton = new JButton("Add Book");
        addBookButton.setBounds(80, 300,150,50);
        addBookButton.addActionListener(this);

        cancelButton = new JButton("Cancel");
        cancelButton.setBounds(250, 300,150,50);
        cancelButton.addActionListener(this);

    }

    private void showMenuPage() {
        add(addNewBookButton);
        add(BookSearchByTitleButton);
        add(AllBooksListButton);
        add(SellBookButton);
        add(DeleteBookButton);
        add(ExitButton);
    }

    private void removeMenuPage() {
        remove(addNewBookButton);
        remove(BookSearchByTitleButton);
        remove(AllBooksListButton);
        remove(SellBookButton);
        remove(DeleteBookButton);
        remove(ExitButton);
        refreshFrame();
    }

    private void showAddBookPage() {
        add(AddBookPageTitleLabel);
        add(titleLabel);
        add(titleField);
        add(authorLabel);
        add(authorField);
        add(publishingHouseLabel);
        add(publishingHouseField);
        add(priceLabel);
        add(priceField);
        add(stockUnitsLabel);
        add(stockUnitsField);
        add(isForeignLabel);
        add(isForeignCheckBox);
        add(addBookButton);
        add(cancelButton);
    }

    private void removeAddBookPage() {
        remove(AddBookPageTitleLabel);
        remove(titleLabel);
        remove(titleField);
        remove(authorLabel);
        remove(authorField);
        remove(publishingHouseLabel);
        remove(publishingHouseField);
        remove(priceLabel);
        remove(priceField);
        remove(stockUnitsLabel);
        remove(stockUnitsField);
        remove(isForeignLabel);
        remove(isForeignCheckBox);
        remove(addBookButton);
        remove(cancelButton);
        refreshFrame();
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");

        //finding out which button has been pressed
        if (e.getSource() == addNewBookButton){
            removeMenuPage();
            showAddBookPage();
        } else if (e.getSource() == cancelButton) {
            removeAddBookPage();
            showMenuPage();
        } else if (e.getSource() == ExitButton) {
            System.exit(0);
        }

    }

}
