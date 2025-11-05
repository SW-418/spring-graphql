package samwells.io.spring_graphql.service.artist;

import samwells.io.spring_graphql.codegen.types.Artist;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public interface ArtistService {
    CompletableFuture<List<Artist>> getArtists();
    CompletableFuture<Artist> getArtist(String id);
}
