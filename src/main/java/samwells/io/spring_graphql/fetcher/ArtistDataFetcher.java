package samwells.io.spring_graphql.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.AllArgsConstructor;
import samwells.io.spring_graphql.codegen.types.Artist;
import samwells.io.spring_graphql.service.artist.ArtistService;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@DgsComponent
@AllArgsConstructor
public class ArtistDataFetcher {
    private final ArtistService artistService;

    @DgsQuery
    CompletableFuture<List<Artist>> getArtists() {
        return artistService.getArtists();
    }

    @DgsQuery
    CompletableFuture<Artist> getArtist(@InputArgument String id) {
        return artistService.getArtist(id);
    }
}
