package ch.bbw.Deadzork.Mappers;

import ch.bbw.Deadzork.Models.Zorkies;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class ZorkiesMapper {

    public List<Zorkies> generateZorkies() throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader("src/main/resources/data/Zorkies.json"), new TypeToken<List<Zorkies>>() {
        }.getType());
    }

    public ZorkiesMapper() throws FileNotFoundException {
    }
}
