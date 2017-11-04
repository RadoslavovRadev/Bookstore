package View;

import javax.swing.*;
import static Controler.BookstoreFrameController.refreshFrame;
import Model.Book;

import java.awt.event.ActionEvent;

public class AddBookPage extends BookstoreFrame {

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

    @Override
    public void createComponents() {

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
        refreshFrame();
    }

    private void addBookPageSaveInput() {

        try {

            // check text fields for commas
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

    @Override
    public void actionPerformed(ActionEvent e) {

        //finding out which button has been pressed
        if (e.getSource() == addBookButton) {
            addBookPageSaveInput();
        } else if (e.getSource() == cancelButton) {
            removeAddBookPage();
            //showMenuPage();  this needs to show Menu Page
        }

    }

}
