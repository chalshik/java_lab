public class LibraryManagementSystem {
    public static void main(String[] args) {
        // Test the classes
        Book book = new Book("Tologon Kasymbekov", "Broken sword", 1986);
        book.printBookInfo();

        Ebook ebook = new Ebook("PDF", 5.5, "Delbirim", "Aitmatov", 1997);
        ebook.printBookInfo();
        ebook.bookType();

        PrintedBook printedBook = new PrintedBook(350, "Kyzyl army", "KelKel", "Tologon Kasymbekov", 186);
        printedBook.printBookInfo();
        printedBook.bookType();
    }

    public static class Book {
        protected String title;
        protected String author;
        protected int published;

        public Book(String author, String title, int published) {
            this.author = author;
            this.title = title;
            this.published = published;
        }

        public void printBookInfo() {
            System.out.println("Author: " + author + ", Title: " + title + ", Publish Year: " + published);
        }

        public String getBookInfo() {
            return "Author: " + author + ", Title: " + title + ", Publish Year: " + published;
        }
    }

    public static class Ebook extends Book {
        private String fileFormat;
        private double fileSizeMB;

        public Ebook(String fileFormat, double fileSizeMB, String title, String author, int published) {
            super(author, title, published);
            this.fileFormat = fileFormat;
            this.fileSizeMB = fileSizeMB;
        }

        @Override
        public void printBookInfo() {
            System.out.println("Author: " + author + ", Title: " + title + ", File Format: " + fileFormat +
                    ", File Size: " + fileSizeMB + " MB, Published: " + published);
        }

        @Override
        public String getBookInfo() {
            return "Author: " + author + ", Title: " + title + ", File Format: " + fileFormat +
                    ", File Size: " + fileSizeMB + " MB, Published: " + published;
        }

        public void bookType() {
            System.out.println("This is an eBook.");
        }
    }

    public static class PrintedBook extends Book {
        private int numberOfPages;
        private String publisher;

        public PrintedBook(int numberOfPages, String publisher, String title, String author, int published) {
            super(author, title, published);
            this.numberOfPages = numberOfPages;
            this.publisher = publisher;
        }

        @Override
        public void printBookInfo() {
            System.out.println("Author: " + author + ", Title: " + title + ", Publisher: " + publisher +
                    ", Number of Pages: " + numberOfPages + ", Published: " + published);
        }

        @Override
        public String getBookInfo() {
            return "Author: " + author + ", Title: " + title + ", Publisher: " + publisher +
                    ", Number of Pages: " + numberOfPages + ", Published: " + published;
        }

        public void bookType() {
            System.out.println("This is a printed book.");
        }
    }
}
