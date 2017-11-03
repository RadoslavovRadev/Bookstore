package Controler;

//import Model.Book;
import View.MenuFrame;

import javax.swing.*;

public class Demo {

    private static MenuFrame menuFrame = new MenuFrame();

    public static void main(String[] args) {

        openFrame();




        //bookHashset.init();

//        Book b1 = new Book();
//        System.out.println(b1.getId());

    }

    private static void openFrame() {
        menuFrame.setVisible(true);
    }

    public static void refreshFrame() {
        SwingUtilities.updateComponentTreeUI(menuFrame);
    }

}
