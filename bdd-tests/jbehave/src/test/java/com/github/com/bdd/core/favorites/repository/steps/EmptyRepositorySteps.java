package com.github.com.bdd.core.favorites.repository.steps;

import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;
import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.repository.DefaultFavoritesRepository;
import com.github.bdd.core.favorites.repository.FavoritesRepository;

import static org.fest.assertions.api.Assertions.assertThat;

public class EmptyRepositorySteps {

    private FavoritesRepository repository = new DefaultFavoritesRepository();;

    @Given("empty Favorites Repository")
    public void givenEmptyFavoritesRepository() {

    }


    @When("there is nothing added to the repository")
    public void whenThereIsNothingAddedToTheRepository() {

    }

    @Then("favorite book is null")
    public void thenFavoriteBookIsNull() {
        assertThat(repository.getFavorite(Book.class)).isNull();
    }
}
