package nl.ckarakoc.media.repositories;

import nl.ckarakoc.media.models.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post, Long> {
}
