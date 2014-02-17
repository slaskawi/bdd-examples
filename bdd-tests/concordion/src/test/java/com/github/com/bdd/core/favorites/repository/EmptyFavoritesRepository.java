package com.github.com.bdd.core.favorites.repository;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.repository.DefaultFavoritesRepository;
import com.github.bdd.core.favorites.repository.FavoritesRepository;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(ConcordionRunner.class)
public class EmptyFavoritesRepository {

    private FavoritesRepository repository = new DefaultFavoritesRepository();

    public void emptyFavoritesRepository() throws Exception {

    }

    public void thereIsNothingAddedToTheRepository() throws Exception {

    }

    public void favoriteBookIsEmpty() throws Exception {
        assertThat(repository.getFavorite(Book.class)).isNull();
    }
}
