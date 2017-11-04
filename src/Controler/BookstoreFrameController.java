package Controler;

import View.AddBookPage;
import View.BookstoreFrame;
import View.MenuPage;

import javax.swing.*;

public class BookstoreFrameController {

    private static BookstoreFrame addBookPage = new AddBookPage();
    private static BookstoreFrame menuPage = new MenuPage();


    static void openFrame() {
        addBookPage.createComponents();
        menuPage.createComponents();
        addBookPage.setVisible(true);
        menuPage.setVisible(true);
    }

    public static void refreshFrame() {
        SwingUtilities.updateComponentTreeUI(addBookPage);
        SwingUtilities.updateComponentTreeUI(menuPage);
    }
}
