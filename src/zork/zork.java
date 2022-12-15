package zork;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class zork {
    
    public static void main(String[] args) throws IOException {
        

        // To obtain and read the file contents
        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        // Initialize the hashmap
        Map<String, String> map = new HashMap<String, String>();

        // Read the file contents line by line
        String line;
        while ((line = br.readLine())!= null) {

            //Trim the line
            line = line.trim();

            // Skip the blank line
            if(line.length() <= 0){
                continue;
            }

            // Split the line with ":" to split the first character and the rest of the description
            String[] words = line.split(":");

            String firstWord = words[0];
            String secondWord = words[1];

            // Using a scanner to read the location input
            Scanner sc = new Scanner("Enter direction: north, south, west, east");
            String response = sc.nextLine();

            // Permutations to get the direction and the forest path
            if(response.equalsIgnoreCase("north")){
                // Get the value of the north and output the direction information
                map.put(response, secondWord);

            }

        }
    }

}
