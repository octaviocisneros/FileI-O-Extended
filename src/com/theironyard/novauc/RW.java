package com.theironyard.novauc;
import jodd.json.JsonParser;
import jodd.json.JsonSerializer;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


import static com.theironyard.novauc.Main.peopleMap;

public class RW {

    public RW() {
    }

    public void readwrite() throws IOException{


        File f = new File("people.txt");
        Scanner s = new Scanner(f);

        while (s.hasNext()) {
            String line = s.nextLine();
            System.out.println(line);
            String[] columns = line.split(",");
            Person people = new Person(String.valueOf(columns[0]), columns[1], columns[2], columns[3], columns[4], columns[5]); //object for people
            System.out.println("This person's name is " + line);

                if (peopleMap.containsKey(people.getCountry())) {

                peopleMap.get(columns[4]).add(people);
            }

            else {
               peopleMap.put(people.getCountry(), new ArrayList<>());
                    peopleMap.get(columns[4]).add(people);

            }
        }

        System.out.println(peopleMap);


        File q = new File("people.json");

        JsonSerializer serializer = new JsonSerializer();
        String json = serializer.deep(true).serialize(peopleMap);  //extra piece of code
        FileWriter fw = new FileWriter(q);
        fw.write(json);
        fw.close();

        System.out.println();
    }
}


