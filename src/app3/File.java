package app3;

import java.util.Map;

public class File {
    private String room;
    private String name;
    private String description;
    private String direction;
    private Map<String,  String> files;

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
    public Map<String, String> getFiles() {
        return files;
    }
    public void setFiles(Map<String, String> files) {
        this.files = files;
    }

    @Override
    public String toString() {
        return "File{" + room + ", name" + name + ", direction" + direction + "}";
    }

    
    
}
