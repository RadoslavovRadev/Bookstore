package Model;

import java.util.HashSet;

public class Bookstore {

    private HashSet<Book> BookHashSet;

    /*
    public Model.Bookstore(int maxNumberOfBooks) {
        books = new Model.Book[maxNumberOfBooks];
    }

    public boolean addBook(Model.Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }

        return false;
    }



    public Model.Book getBookByName(String title) {
        for (Model.Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }


    public void printAllBooks() {
        for(Model.Book book : books) {
            if(book != null) {
                System.out.println(book.getTitle() + book.getStockUnits());
            }
        }
    }

    public boolean buy(Model.Book book) {
        if(book.getStockUnits() > 1) {
            book.setStockUnits(book.getStockUnits() - 1);
            return true;
        }

        return false;
    }
    */
}

