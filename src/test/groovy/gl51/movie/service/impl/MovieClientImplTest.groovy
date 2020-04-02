package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieClient
import io.micronaut.test.annotation.MicronautTest

import spock.lang.Specification
import javax.inject.Inject

@MicronautTest
class MovieClientImplTest extends Specification {

    @Inject
    MovieRegistryImpl registry
    @Inject
    MovieClient ClientMock = Mock()

    void "injection should work"(){
        expect:
        registry != null
        ClientMock != null
    }

    void "getting movie by it's imdbID should work"(){
        when:
        ClientMock.GetMovieDetail("aaaa1")
        then:
        Movie movie = new Movie(imdbID: "aaaa1")
        registry.addMovieToFavorites(movie.imdbID)
        registry.listFavorites().size() == 1

    }

}