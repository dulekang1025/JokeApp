package ld.jokeapp.Services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chunkNorrisQuotes;

    public JokeServiceImpl() {
        this.chunkNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Override
    public String getJoke() {
        return chunkNorrisQuotes.getRandomQuote();
    }
}
