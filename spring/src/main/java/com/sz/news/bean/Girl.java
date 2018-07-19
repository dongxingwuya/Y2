package com.sz.news.bean;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Girl {

    private  String[] friends;
    private List<Integer> nos;
    private Set<Book> books;
    private Map<String,Food> favoriteFood;

    public Map<String, Food> getFavoriteFood() {
        return favoriteFood;
    }

    public void setFavoriteFood(Map<String, Food> favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public List<Integer> getNos() {
        return nos;
    }

    public void setNos(List<Integer> nos) {
        this.nos = nos;
    }



    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    @Override
    public String toString() {
        return "Girl{" +
                "friends=" + Arrays.toString(friends) +
                ", nos=" + nos +
                ", books=" + books +
                ", favoriteFood=" + favoriteFood +
                '}';
    }
}
