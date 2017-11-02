public class AddBook {

    private Book[] books;

    public AddBook(int maxNumberOfBooks) {
        books = new Book[maxNumberOfBooks];
    }

    public boolean addBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return true;
            }
        }

        return false;
    }



    public Book getBookByName(String title) {
        for (Book book : books) {
            if (book != null && book.getTitle().equalsIgnoreCase(title)) {
                return book;
            }
        }

        return null;
    }


    public void printAllBooks() {
        for(Book book : books) {
            if(book != null) {
//                System.out.println(book.getTitle() +  ); // how many copies of the book are there ?
            }
        }
    }

    public boolean buy(Book book) {
        if(book.getStockUnits() > 1) {
            book.setStockUnits(book.getStockUnits() - 1);
            return true;
        }

        return false;
    }
}

