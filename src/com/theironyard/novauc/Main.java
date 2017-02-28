package com.theironyard.novauc;

import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import static com.sun.tools.internal.xjc.reader.Ring.add;


public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static HashMap<String, ArrayList<Person>> peopleMap = new HashMap();

    public static RW rw = new RW();

    public static void main(String[] args) throws IOException {

        rw.readwrite();

    }
}







