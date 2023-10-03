package com.pratikkroy.designpatterns_archive.creational.builderPattern.simpleImpl.product;

public class BuilderPatternDemo {

    public static void start() {
        final String bookName = "Book name";
        final String authorName = "Book author name";
        final String publicationName = "Book publication name";

        System.out.println("Building book with "
                + "name=["+bookName+"] authorName=["+authorName+"] publicationName=["+publicationName+"]");
        com.pratikkroy.designpatterns.creational.builderPattern.simpleImpl.product.Book book =
                com.pratikkroy.designpatterns.creational.builderPattern.simpleImpl.product.Book.builder(bookName, authorName, publicationName)
                .pagesCount(10)
                .price(100)
                .build();

        System.out.println(book);
    }
}
