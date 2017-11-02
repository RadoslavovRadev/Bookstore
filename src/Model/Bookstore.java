package Model;

import java.util.HashSet;

public class Bookstore {

    private HashSet<Book1> book1HashSet;

    /*
    public Model.Bookstore(int maxNumberOfBooks) {
        books = new Model.Book1[maxNumberOfBooks];
    }

    public boolean addBook(Model.Book1 book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }

        return false;
    }



    public Model.Book1 getBookByName(String title) {
        for (Model.Book1 book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }


    public void printAllBooks() {
        for(Model.Book1 book : books) {
            if(book != null) {
                System.out.println(book.getTitle() + book.getStockUnits());
            }
        }
    }

    public boolean buy(Model.Book1 book) {
        if(book.getStockUnits() > 1) {
            book.setStockUnits(book.getStockUnits() - 1);
            return true;
        }

        return false;
    }
    */
}

