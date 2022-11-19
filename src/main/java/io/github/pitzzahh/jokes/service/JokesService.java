package io.github.pitzzahh.jokes.service;

import io.github.pitzzahh.jokes.repository.JokesRepository;
import org.springframework.stereotype.Service;
import io.github.pitzzahh.jokes.model.Joke;
import java.util.List;

@Service
public record JokesService(JokesRepository jokesRepository) {

    /**
     * Generates a random joke from the list of jokes
     * @return a random joke
     */
    public Joke generateRandomJoke() {
        List<Joke> jokes = jokesRepository.getJokes();
        return jokes.get((int) (Math.random() * jokes.size()));
    }

}
