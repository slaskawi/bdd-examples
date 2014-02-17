package com.github.bdd.core.favorites.repository;

import java.util.HashMap;
import java.util.Map;
import com.github.bdd.core.favorites.Favorite;

public class DefaultFavoritesRepository implements FavoritesRepository {

    Map<Class<? extends Favorite>, Object> database = new HashMap<>();

    @Override
    public <T extends Favorite> T getFavorite(Class<T> favoriteClass) {
        return favoriteClass.cast(database.get(favoriteClass));
    }

    @Override
    public <T extends Favorite> void putFavorite(T favorite) {
        database.put(favorite.getClass(), favorite);
    }

}
