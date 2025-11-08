package samwells.io.spring_graphql.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.AllArgsConstructor;
import samwells.io.spring_graphql.codegen.types.Artist;
import samwells.io.spring_graphql.service.artist.ArtistService;

import java.util.List;

@DgsComponent
@AllArgsConstructor
public class ArtistDataFetcher {
    private final ArtistService artistService;

    @DgsQuery
    List<Artist> getArtists() {
        return artistService.getArtists();
    }

    @DgsQuery
    Artist getArtist(@InputArgument String id) {
        return artistService.getArtist(id);
    }
}
