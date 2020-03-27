package gl51.movie.service.impl

import io.micronaut.test.annotation.MicronautTest
import spock.lang.Specification

import javax.inject.Inject

@MicronautTest
class MovieRegistryImplTest extends Specification {

    @Inject
    MovieRegistryImpl registry

    void"inject should work"() {
        expect:
        registry != null
    }

    void"favorites should be empty"() {
        expect:
        registry.listFavorites() == []
    }

    void "adding a favorites should fill in the database"() {
        when:
        registry.addMovieToFavorites("aaaaa")
        then:
        registry.listFavorites().size() == 1
    }
}