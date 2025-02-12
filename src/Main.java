import java.lang.reflect.Array;
import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Library.showAll();
        Library.Menu();

    }
    public static class Library{
        static Book[] books =new Book[10];
        static int index=0;
        public static void addBook(String title, String author, int number){
            if (index<10){
                books[index] = new Book(number,title,author);
                index++;
                System.out.println("uspeshno");
            }else{
                System.out.println( "No available places");
            }
        }
        public static void borrowBook(String title){
            for(Book book:books){
                if(book!=null){
                    if (book.avai.equals(true)&&book.getName().equals(title)){
                        book.avai = false;
                        System.out.println("Vot vasha kniga"+" "+book.getAuthor()+" "+book.getName());
                    }
                }
            }
        }
        public static void showAll(){
            int i=0;
            for(Book book:books){

                if (book !=null){
                    if(book.avai ==true){
                        System.out.println(book.getAuthor()+" "+book.getName());
                    }
                }else{
                    i++;
                }
            }
            if(i==10){
                System.out.println("no available");
            }
        }
        public static void Menu(){
            Scanner scan = new Scanner(System.in);
            System.out.println("Choose option:\n"+"1-Add book\n"+"2-Borrow book\n"+"3-Show available books"+"4-Close");
            int option = scan.nextInt();
            switch (option){
                case 1:
                    String title;
                    String author;
                    int number;
                    System.out.println("Write title:");
                    title = scan.nextLine();
                    System.out.println("Write author");
                    author = scan.nextLine();
                    System.out.println("Write number");
                    number = scan.nextInt();
                    addBook(title,author,number);
                case 2:
                    System.out.println("Title of book:");
                    title = scan.nextLine();
                    borrowBook(title);
                case 3:
                    System.out.println("There are available books:");
                    showAll();
                case 4:
                    break;
            }
        }
    }
    public static class Book{
        private String name ;
        private int number;
        private String author;
        Boolean avai = true;

        public Book(int number, String name, String author) {
            this.number = number;
            this.name = name;
            this.author = author;
        }

        public int getNumber() {
            return number;
        }

        public void setNumber(int number) {
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAuthor() {
            return author;
        }

        public void setAuthor(String author) {
            this.author = author;
        }
    }
}