package samwells.io.spring_graphql.service.artist;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClient;
import samwells.io.spring_graphql.codegen.types.Artist;

import java.util.List;

@Slf4j
@Service
@AllArgsConstructor
public class ArtistServiceImpl implements ArtistService {
    private final RestClient artistsClient;
    private static final String ARTISTS_BASE = "/artists";

    @Override
    public List<Artist> getArtists() {
        log.info("Retrieving all artists");
        // TODO: Error handling
        return artistsClient.get().uri(ARTISTS_BASE).retrieve().body(new ParameterizedTypeReference<>() {});
    }

    @Override
    public Artist getArtist(String id) {
        log.info("Retrieving artist {}", id);
        String uri = String.format("%s/%s", ARTISTS_BASE, id);
        // TODO: Error handling
        return artistsClient.get().uri(uri).retrieve().body(Artist.class);
    }
}
