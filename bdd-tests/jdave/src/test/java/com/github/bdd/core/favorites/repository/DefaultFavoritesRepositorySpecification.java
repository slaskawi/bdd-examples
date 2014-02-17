package com.github.bdd.core.favorites.repository;

import org.junit.runner.RunWith;
import com.github.bdd.core.favorites.Book;
import com.github.bdd.core.favorites.Song;

import jdave.Group;
import jdave.Specification;
import jdave.junit4.JDaveRunner;

@RunWith(JDaveRunner.class)
@Group("basic")
public class DefaultFavoritesRepositorySpecification extends Specification<DefaultFavoritesRepository> {

    public class EmptyRepository {

        private FavoritesRepository repository = new DefaultFavoritesRepository();

        public FavoritesRepository create() {
            return repository;
        }

        public void hasEmptyBooks() {
            specify(repository.getFavorite(Book.class), must.equal(null));
        }

        public void hasEmptySongs() {
            specify(repository.getFavorite(Song.class), must.equal(null));
        }
    }

    public class RepositoryWithGoingPostalAdded {

        private FavoritesRepository repository;

        public FavoritesRepository create() {
            FavoritesRepository ret = new DefaultFavoritesRepository();
            Book book = new Book("9781407035406", "Terry Pratchett", "Going Postal");
            ret.putFavorite(book);
            repository = ret;
            return ret;
        }

        public void hasGoingPostalBook() {
            Book goingPostalBook = new Book("9781407035406", "Terry Pratchett", "Going Postal");
            specify(repository.getFavorite(Book.class), must.equal(goingPostalBook));
        }
    }
}
