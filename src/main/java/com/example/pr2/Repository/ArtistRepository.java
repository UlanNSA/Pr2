package com.example.pr2.Repository;

import com.example.pr2.db.Artist;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ArtistRepository extends CrudRepository<Artist, Long> {

    List<Artist>  findArtistByGenre(String str);
}
