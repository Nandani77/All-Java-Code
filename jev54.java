package allJava;
class Library{
    String[] books;
    int no_of_books = 0;
        Library() {
            this.books = new String[100];
            this.no_of_books = 0;
        }
        void addBook(String book){
            this.books[no_of_books]=book;
            no_of_books++;
            System.out.println(book + "has been added");
        }
        void showAvailableBook(){
            System.out.println("Available books are:");
            for(String book : this.books){
                if(book == null){
                    continue;
                }
                System.out.println("*" + book);
            }

        }
        void issueBook(String book){

                for (int i=0; i<this.books.length; i++) {
                    if (this.books[i].equals(book)) {
                        System.out.println("the book has been issued");
                        this.books[i] = null;
                        return;
                    }

                }
            System.out.println("this book does not exits");

        }
        void returnBook(String book){
            addBook(book);

        }

}
public class jev54 {
    public static void main(String[] args){
        Library centralLibrary = new Library();
        centralLibrary.addBook("Think and grow Rich");
        centralLibrary.addBook("Algorithms");
        centralLibrary.addBook("java");
        centralLibrary.issueBook("java");
        centralLibrary.showAvailableBook();
        centralLibrary.returnBook("java");
        centralLibrary.showAvailableBook();
    }
}
