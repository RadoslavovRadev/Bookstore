package View;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import Controler.Demo;
import Model.Book;


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
    private JLabel authorLabel;
    private JLabel publishingHouseLabel;
    private JLabel priceLabel;
    private JLabel isForeignLabel;
    private JLabel stockUnitsLabel;
    private JTextField titleField;
    private JTextField authorField;
    private JTextField publishingHouseField;
    private JTextField priceField;
    private JTextField stockUnitsField;
    private JCheckBox isForeignCheckBox;
    private JButton addBookButton;
    private JButton cancelButton;
    private Book book = new Book();

    // Search Book By Title Page
    // Search Book By Title Page
    private JLabel SearchBookByTitlePageTitleLabel;
    private JLabel SearchBookTitleLabel;
    private JTextField SearchBookTitleField;
    private JButton searchBookButton;
    private JButton backButton;

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


        // Search By Title Page
        SearchBookByTitlePageTitleLabel = new JLabel("Search for a book by its title");
        SearchBookByTitlePageTitleLabel.setBounds(220, 5, 80, 50);

        SearchBookTitleLabel = new JLabel("Enter the title:");
        SearchBookTitleLabel.setBounds(40, 50, 80, 20);

        SearchBookTitleField = new JTextField();
        SearchBookTitleField.setBounds(120, 50, 310, 20);

        searchBookButton = new JButton("Search for the book");
        searchBookButton.setBounds(80, 300, 150, 50);
        searchBookButton.addActionListener(this);

        backButton = new JButton("Back");
        backButton.setBounds(250, 300, 150, 50);
        backButton.addActionListener(this);
    }

    //@Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("click");

        //finding out which button has been pressed
        if (e.getSource() == addNewBookButton){
            removeMenuPage();
            showAddBookPage();
        } else if (e.getSource() == ExitButton) {
            System.exit(0);
        } else if (e.getSource() == addBookButton) {
            addBookPageSaveInput();
        } else if (e.getSource() == cancelButton) {
            removeAddBookPage();
            showMenuPage();
        } else if (e.getSource() == BookSearchByTitleButton) {
            removeMenuPage();
            showSearchBookByTitlePage();
        } else if (e.getSource() == backButton) {
            removeSearchBookByTitlePage();
            showMenuPage();
        }
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
        Demo.refreshFrame();
    }

    private void showAddBookPage() {
        AddBookPageTitleLabel.setText("Book Details:");
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
        Demo.refreshFrame();
    }

    private void showSearchBookByTitlePage() {
        SearchBookByTitlePageTitleLabel.setText("Search for a book by its title:");
        add(SearchBookByTitlePageTitleLabel);
        add(SearchBookTitleLabel);
        add(SearchBookTitleField);

    }

    private void removeSearchBookByTitlePage() {
        remove(SearchBookByTitlePageTitleLabel);
        remove(SearchBookTitleLabel);
        remove(SearchBookTitleField);
        Demo.refreshFrame();
    }

    private void addBookPageSaveInput() {

        try {

            // check text fields for commas or empty strings
            String titleFieldText = titleField.getText();
            String authorText = authorField.getText();
            String publishingHouseText = publishingHouseField.getText();

            // Parse int input fields
            double priceFieldInput = Double.parseDouble(priceField.getText());
            int stockUnitsFieldInput = Integer.parseInt(stockUnitsField.getText());

            // save input details into a book object
            book.setTitle(titleFieldText);
            book.setAuthor(authorText);
            book.setPublishingHouse(publishingHouseText);
            book.setPrice(priceFieldInput);
            book.setStockUnits(stockUnitsFieldInput);
            book.setIsForeign(isForeignCheckBox.isSelected());

            // save book object details in output CSV file:
            // call addBook class from Bookstore and give it the above book object

            // display a success message
            AddBookPageTitleLabel.setText("Book Added");
        } catch(NumberFormatException ex) {
            // display an error message
            AddBookPageTitleLabel.setText("Input Error");
        }

    }

}
