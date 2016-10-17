package item29;

import java.util.HashMap;
import java.util.Map;

public class Favorites {
    private Map<Class<?>, Object> favorites = new HashMap<>();

    public <T> void putFavorites(Class<T> clazz, T object) {
        favorites.put(clazz, clazz.cast(object));
    }

    public <T> T getFavorite(Class<T> clazz) {
        return clazz.cast(favorites.get(clazz));
    }

}
