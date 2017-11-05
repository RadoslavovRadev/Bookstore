package Controler;

import Model.Book;
import View.MenuFrame;
import javax.swing.*;

public class Demo {

    private static MenuFrame menuFrame = new MenuFrame();

    public static void main(String[] args) {

        menuFrame.setVisible(true);

        //bookHashset.init();
        //haha

        Book b1 = new Book();
        System.out.println(b1.getId());

    }

    public static void refreshFrame() {
        SwingUtilities.updateComponentTreeUI(menuFrame);
    }

}
