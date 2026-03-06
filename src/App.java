public class App {
    public static void main(String[] args) {
        System.out.println("BẮT ĐẦU KIỂM TRA MẪU SINGLETON");

        BookBorrower bookBorrower1 = new BookBorrower();
        BookBorrower bookBorrower2 = new BookBorrower();bookBorrower1.borrowedBook();
        System.out.println("BookBorrower1 yêu cầu mượn cuốn sách");
        System.out.println("BookBorrower1 Tác giả và Tựa sách: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());


        bookBorrower2.borrowedBook();
        System.out.println("BookBorrower2 yêu cầu mượn cuốn sách");
        System.out.println("BookBorrower2 Tác giả và Tựa sách: ");
        System.out.println(bookBorrower2.getAuthorAndTitle());

        bookBorrower1.returnBook();
        System.out.println("BookBorrower1 đã trả lại cuốn sách");

        bookBorrower2.borrowedBook();
        System.out.println("BookBorrower2 Tác giả và Tựa sách: ");
        System.out.println(bookBorrower1.getAuthorAndTitle());

        System.out.println("KẾT THÚC KIỂM TRA MẪU SINGLETON");
    }
}
