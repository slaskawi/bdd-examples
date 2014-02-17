package pl.payu.dictionary.client.exception.steps;

import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.repository.DefaultFavoritesRepository;
import com.github.bdd.core.favorites.repository.FavoritesRepository;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.fest.assertions.api.Assertions.assertThat;

public class EmptyRepositoryStepDefinitions {

    private FavoritesRepository repository = new DefaultFavoritesRepository();;

    @Given("^empty Favorites Repository$")
    public void Empty_Favorites_Repository() throws Throwable {
        repository = new DefaultFavoritesRepository();
    }

    @When("^there is nothing added to the repository$")
    public void there_is_nothing_added_to_the_repository() throws Throwable {

    }

    @Then("^favorite book is null$")
    public void Favorite_book_is_null() throws Throwable {
        assertThat(repository.getFavorite(Book.class)).isNull();
    }
}
