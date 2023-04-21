package com.example.th2taitt.Model;

import java.util.Date;

public class Book {
    public static int getMid() {
        return mid;
    }

    public static void setMid(int mid) {
        Book.mid = mid;
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublishDay() {
        return publishDay;
    }

    public void setPublishDay(String publishDay) {
        this.publishDay = publishDay;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public  static int mid = 1000;
    public  int  id ;
    public  String name;
    public  String author;

    public Book(int id, String name, String author, String publishDay, String publisher, double price) {
        this.id = this.mid++;
        this.name = name;
        this.author = author;
        this.publishDay = publishDay;
        this.publisher = publisher;
        this.price = price;
    }

    public String publishDay;
    public  String publisher;
    public  double price;
}
