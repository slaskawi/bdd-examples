package com.github.com.bdd.core.favorites.repository.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.repository.DefaultFavoritesRepository;
import com.github.bdd.core.favorites.repository.FavoritesRepository;

import static org.fest.assertions.api.Assertions.assertThat;

public class GoingPostalRepositorySteps {

    private FavoritesRepository repository = new DefaultFavoritesRepository();;

    @Given("empty Favorites Repository")
    public void givenEmptyFavoritesRepository() {

    }

    @When("Going Postal is added to Favorites Repository")
    public void whenGoingPostalIsAddedToFavoritesRepository() {
        Book book = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        repository.putFavorite(book);
    }

    @Then("favorite book is Going Postal")
    public void thenFavoriteBookIsGoingPostal() {
        Book goingPostal = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        assertThat(repository.getFavorite(Book.class)).isEqualTo(goingPostal);
    }
}
