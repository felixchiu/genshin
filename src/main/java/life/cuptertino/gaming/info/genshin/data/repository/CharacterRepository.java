package life.cuptertino.gaming.info.genshin.data.repository;

import life.cuptertino.gaming.info.genshin.data.model.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Long> {

}
