package main;

import java.io.IOException;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.List;

public class Logs {
    // Read all data from 'log.txt'.
// Each line represents a log message from a web server
// Write a function that returns an array with the unique IP adresses.
// Write a function that returns the GET / POST request ratio.
    public static void main(String[] args) {
        Path path = Paths.get("log.txt");
        List<String> content = new ArrayList<String>();
        try {
            content = Files.readAllLines(path);

        } catch (IOException e1) {
            e1.printStackTrace();
        }
        unique(content);
        System.out.println(getPostRatio(content));
    }

    public static List<String> unique(List<String> content) {

        List<String> uni = new ArrayList<String>();
        for (int i = 0; i < content.size(); i++) {
            String ip = content.get(i).split("\\s+")[5]; // \\s+ --> min 1 space. Creates a String with the ip-s
            if (!uni.contains(ip)) {                             // awesome type
                uni.add(ip);
            }
        }
        //System.out.println(uni.size());
        //System.out.println(uni);
        return null;
    }

    public static float getPostRatio(List<String> content) {
        int getCount = 0;
        int postCount = 0;
        String getOrPost = new String();
        for (int i = 0; i < content.size(); i++) {
            //getOrPost += content.get(i).split("\\s+")[6];
            if (content.get(i).split("\\s+")[6].equals("GET")) {
                getCount++;
            }
            if (content.get(i).split("\\s++")[6].equals("POST")) {
                postCount++;
            }

        }
        //System.out.println(getCount);
        //System.out.println(postCount);
        return (float) getCount / postCount;
    }
}
