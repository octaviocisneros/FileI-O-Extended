package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class Person {

    String id;
    String first;
    String last;
    String email;
    String country;
    String ip;

    public Person(String id, String first, String last, String email, String country, String ip) {

        this.id = id;
        this.first = first;
        this.last = last;
        this.email = email;
        this.country = country;
        this.ip = ip;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    @Override //turn from memory to print like that...because its working in a survey object
    public String toString() {
        return String.format("%s %s from %s\n" , first, last, country);
    }
}