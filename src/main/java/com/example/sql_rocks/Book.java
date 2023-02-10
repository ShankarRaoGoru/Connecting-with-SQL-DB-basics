package com.example.sql_rocks;

import javax.persistence.*;

@Entity
@Table(name="book_info")
public class Book {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String name;

    private int pages;
    @ManyToOne
    @JoinColumn
    Author author;

    public Book() {
    }

    public Book(int id, String name, int pages, Author author) {
        this.id = id;
        this.name = name;
        this.pages = pages;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}
