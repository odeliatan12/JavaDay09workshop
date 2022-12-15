package zork;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Location {
    
    // Obtain the characteristics of the location
    private String room;
    private String name;
    private String description;
    private String direction;

    // Use a hashmap to store all the information
    private Map<String, String> map = new HashMap<>();

    // Obtain getters and setters for the location
    public String getRoom() {
        return room;
    }
    public void setRoom(String room) {
        this.room = room;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDirection() {
        return direction;
    }
    public void setDirection(String direction) {
        this.direction = direction;
    }

    // I want to put in the details of the location into my hashmap 
    /**
     * @param data
     * @return
     */
    public static Map<String, Location> buildWorldMap(ArrayList<String> data) {
       Map<String, Location> locations = new HashMap<>();

       for (String location : data) {
           String[] split = location.split(": ");
       }

       return locations;


    }
}
