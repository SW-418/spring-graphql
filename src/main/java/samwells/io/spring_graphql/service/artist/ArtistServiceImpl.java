package samwells.io.spring_graphql.service.artist;

import lombok.AllArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import samwells.io.spring_graphql.codegen.types.Artist;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Service
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {
    private final RestClient artistsClient;
    private static final String ARTISTS_BASE = "/artists";

    @Async
    @Override
    public CompletableFuture<List<Artist>> getArtists() {
        // TODO: Error handling
        return CompletableFuture.completedFuture(
                artistsClient.get().uri(ARTISTS_BASE).retrieve().body(new ParameterizedTypeReference<>() {})
        );
    }

    @Async
    @Override
    public CompletableFuture<Artist> getArtist(String id) {
        String uri = String.format("%s/%s", ARTISTS_BASE, id);
        // TODO: Error handling
        return CompletableFuture.completedFuture(
                artistsClient.get().uri(uri).retrieve().body(Artist.class)
        );
    }
}
