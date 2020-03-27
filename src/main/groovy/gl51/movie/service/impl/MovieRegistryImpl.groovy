package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieRegistry


import javax.inject.Singleton

@Singleton
class MovieRegistryImpl implements gl51.movie.service.MovieRegistry {

    private List<Movie> internalRegistry = []


    @Override
    void addMovieToFavorites(String imdbID) {
        internalRegistry << new Movie(imbdID: imbdID)
    }

    @Override
    List<Movie> listFavorites() {
        internalRegistry
        "ok"
    }
}
