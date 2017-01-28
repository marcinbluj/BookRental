package com.sda;

public class Book {

    String publishingHouse;
    String author;
    String title;
    String type;
    String id;

    public Book() {
    }

    public Book(String publishingHouse, String author, String title, String type, String id) {
        this.publishingHouse = publishingHouse;
        this.author = author;
        this.title = title;
        this.type = type;
        this.id = id;
    }

    public String getPublishingHouse() {
        return publishingHouse;
    }

    public void setPublishingHouse(String publishingHouse) {
        this.publishingHouse = publishingHouse;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
