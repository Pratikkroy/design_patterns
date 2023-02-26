package com.pratikkroy.designpatterns.creational.builderPattern.simpleImpl.product;

public class Book {

    // required
    private final String name;
    private final String authorName;
    private final String publicationName;

    // optional
    private final int pagesCount;
    private final double price;

    public Book (final Builder builder) {
        this.name = builder.name;
        this.authorName = builder.authorName;
        this.publicationName = builder.publicationName;
        this.pagesCount = builder.pagesCount;
        this.price = builder.price;
    }

    public static Builder builder(
            final String name,
            final String authorName,
            final String publicationName
    ) {
        return new Builder(name, authorName, publicationName);
    }

    public static class Builder {
        private final String name;
        private final String authorName;
        private final String publicationName;

        // optional
        private int pagesCount;
        private double price;

        public Builder(
                final String name,
                final String authorName,
                final String publicationName
        ) {
            this.name = name;
            this.authorName = authorName;
            this.publicationName = publicationName;
        }

        public Builder pagesCount(final int pagesCount) {
            this.pagesCount = pagesCount;
            return this;
        }

        public Builder price(final double price) {
            this.price = price;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }

    @Override
    public String toString() {
        return "Book{" + "name='" + name + '\'' + ", authorName='" + authorName + '\'' + ", publicationName='"
                + publicationName + '\'' + ", pagesCount=" + pagesCount + ", price=" + price + '}';
    }
}
