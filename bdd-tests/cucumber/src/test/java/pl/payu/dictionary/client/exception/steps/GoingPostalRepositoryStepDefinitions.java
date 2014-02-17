package pl.payu.dictionary.client.exception.steps;

import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.repository.DefaultFavoritesRepository;
import com.github.bdd.core.favorites.repository.FavoritesRepository;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import static org.fest.assertions.api.Assertions.assertThat;

public class GoingPostalRepositoryStepDefinitions {

    private FavoritesRepository repository = new DefaultFavoritesRepository();

    @When("^Going Postal is added to Favorites Repository$")
    public void whenGoingPostalIsAddedToFavoritesRepository() {
        Book book = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        repository.putFavorite(book);
    }

    @Then("^favorite book is Going Postal$")
    public void thenFavoriteBookIsGoingPostal() {
        Book goingPostal = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        assertThat(repository.getFavorite(Book.class)).isEqualTo(goingPostal);
    }

}
