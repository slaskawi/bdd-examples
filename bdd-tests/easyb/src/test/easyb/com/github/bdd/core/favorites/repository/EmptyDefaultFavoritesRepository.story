//EmptyDefaultFavoritesRepository.story

import com.github.bdd.core.favorites.*
import com.github.bdd.core.favorites.repository.*

scenario "Empty Favorites Repository", {

    given "empty Favorites Repository",{
        repository = new DefaultFavoritesRepository()
    }

    when "there is nothing added to the repository", {

    }

    then "favorite book is null", {
        repository.database.get(Book).shouldBe null
    }

}




