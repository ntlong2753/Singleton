public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    // Tạo phương thức mượn sách borrowBook()
    public void borrowedBook() {
        borrowedBook = BookSingleton.borrowBook();

        if(borrowedBook == null){
            haveBook = false;
        }else {
            haveBook = true;
        }
    }

    // Xây dựng phương thức lấy về thông tin sách mượn
    public String getAuthorAndTitle() {
        if(haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "Tôi không có cuốn sách đó.";
    }

    // Xây dựng phương thức trả sách
    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
