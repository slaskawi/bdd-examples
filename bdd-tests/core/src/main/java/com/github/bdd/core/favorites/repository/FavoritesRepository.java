package com.github.bdd.core.favorites.repository;

import com.github.bdd.core.favorites.Favorite;

public interface FavoritesRepository {

    public <T extends Favorite> T getFavorite(Class<T> favoriteClass);

    public <T extends Favorite> void putFavorite(T favorite);
}
