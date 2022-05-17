package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book coreJava = new Book("Core Java Volume I – Fundamentals", 928);
        Book effectiveJava = new Book("Effective Java", 412);
        Book testDriven = new Book("Test-Driven", 470);
        Book someBook = new Book("Some Book", 464);
        Book[] devBooks = {coreJava, effectiveJava, testDriven, someBook};
        System.out.println("Set name book: \"Clean Code\"");
        someBook.setName("Clean Code");
        print(devBooks);
        System.out.println("\nReplace books, and print:");
        replace0to3(devBooks);
        print(devBooks);
        System.out.println("\nPrint \"Clean Code\" book if present:");
        for (Book book : devBooks) {
            if ("Clean Code".equals(book.getName())) {
                System.out.println(book.getName() + ", " + book.getNumberOfPages() + " pages");
            }
        }
    }

    public static void print(Book[] books) {
        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + ", " + book.getNumberOfPages() + " pages");
        }
    }

    public static void replace0to3(Book[] books) {
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
    }
}
