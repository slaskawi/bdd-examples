//GoingPostalAddedToFavoritesRepository
import com.github.bdd.core.favorites.*
import com.github.bdd.core.favorites.repository.*

scenario "Going Postal added to Favorites Repository", {

    given "empty Favorites Repository",{
        repository = new DefaultFavoritesRepository()
    }

    when "Going Postal is added to Favorites Repository", {
        book = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        repository.putFavorite(book);
    }

    then "favorite book is Going Postal", {
        goingPostal = new Book("9781407035406", "Terry Pratchett", "Going Postal");
        repository.database.get(Book).shouldBe goingPostal
    }

}




