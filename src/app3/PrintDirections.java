package app3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.Scanner;
import static app3.Keywords.*;

public class PrintDirections {

    public void Direction(String fileName) throws IOException {
        Reader r = new FileReader(fileName);
        BufferedReader br = new BufferedReader(r);
    

        while(true){
            // Allow the user to input the direction
            Scanner scanner = new Scanner(">>>> please enter direction: north, south, east, west");
            String sc = scanner.nextLine();

            String line;
            while((line = br.readLine())!= null){
                line = line.trim();
                if(line.length()<=0){
                    continue;
                } 
                
                String[] lines = line.split(":");

                if(lines[0].equals(DIRECTION)){

                } else if(lines[0].equals(DIRECTION)){

                } else if(lines[0].equals(ROOM)){

                }
            }
        }
    }

    public void parseDirection(){
        
    }
    
}
