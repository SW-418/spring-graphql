package samwells.io.spring_graphql.service.artist;

import samwells.io.spring_graphql.codegen.types.Artist;

import java.util.List;

public interface ArtistService {
    List<Artist> getArtists();
    Artist getArtist(String id);
}
