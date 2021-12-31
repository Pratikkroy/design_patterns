package com.pratikkroy.designpatterns.creational.builderPattern.simpleImpl.product;

public class BuilderPatternDemo {

    public static void start() {
        final String bookName = "Book name";
        final String authorName = "Book author name";
        final String publicationName = "Book publication name";

        System.out.println("Building book with "
                + "name=["+bookName+"] authorName=["+authorName+"] publicationName=["+publicationName+"]");
        Book book = Book.builder(bookName, authorName, publicationName)
                .pagesCount(10)
                .price(100)
                .build();

        System.out.println(book);
    }
}
