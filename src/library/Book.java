package library;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by davidkyere & jerrypisagih on 6/5/17.
 */
public class Book {

    String id;
    String title;
    String author;
    String publisher;
    String year_publish;
    String category;
    String keywords;
    String status;

    public Book(String id, String title, String author, String publisher, String year_publish, String category, String keywords, String status){
        this.id = id;
        this.author = author;
        this.title = title;
        this.publisher = publisher;
        this.year_publish = year_publish;
        this.category = category;
        this.keywords = keywords;
        this.status = status;
    }

    public Book(){

    }

    public String getTitle(){
        return this.title;
    }

    public void setTitle(String title){
        this.title = title;
    }

    public void setId(String id){
        this.id = id;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getId(){
        return this.id;
    }

    public String getAuthor(){
        return this.author;
    }

    public String getCategory() {
        return category;
    }

    public String getKeywords() {
        return keywords;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getYear_publish() {
        return year_publish;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public void setKeywords(String keywords) {
        this.keywords = keywords;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setYear_publish(String year_publish) {
        this.year_publish = year_publish;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

    @Override
    public String toString() {
        return id + " "+ title + " "+ author + " "+ publisher + " "+ year_publish + " "+ category + " "+ keywords +" " + status;
    }
    s
}
