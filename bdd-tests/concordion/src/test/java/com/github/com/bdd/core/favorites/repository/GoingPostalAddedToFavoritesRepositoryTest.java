package com.github.com.bdd.core.favorites.repository;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;
import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.repository.DefaultFavoritesRepository;
import com.github.bdd.core.favorites.repository.FavoritesRepository;

import static org.fest.assertions.api.Assertions.assertThat;

@RunWith(ConcordionRunner.class)
public class GoingPostalAddedToFavoritesRepositoryTest {

    private FavoritesRepository repository = new DefaultFavoritesRepository();

    public void emptyFavoritesRepository() throws Exception {

    }

    public void whenGoingPostalIsAddedToFavoritesRepository() {
        Book book = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        repository.putFavorite(book);
    }

    public void thenFavoriteBookIsGoingPostal() {
        Book goingPostal = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        assertThat(repository.getFavorite(Book.class)).isEqualTo(goingPostal);
    }

}
