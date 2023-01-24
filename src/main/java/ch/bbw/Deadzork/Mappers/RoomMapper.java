package ch.bbw.Deadzork.Mappers;

import ch.bbw.Deadzork.Models.Room;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class RoomMapper {
    public List<Room> generateWeapons() throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader("src/main/resources/data/Rooms.json"), new TypeToken<List<Room>>() {
        }.getType());
    }

    public RoomMapper() throws FileNotFoundException {
    }
}
