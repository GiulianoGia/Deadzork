package ch.bbw.Deadzork.Mappers;

import ch.bbw.Deadzork.Models.Weapon;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.List;

public class WeaponMapper {

    public List<Weapon> generateWeapons() throws FileNotFoundException {
        Gson gson = new Gson();
        return gson.fromJson(new FileReader("src/main/resources/data/Weapons.json"), new TypeToken<List<Weapon>>() {
        }.getType());
    }

    public WeaponMapper() throws FileNotFoundException {
    }
}
