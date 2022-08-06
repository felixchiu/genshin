package life.cuptertino.gaming.info.genshin.data.service;


import life.cuptertino.gaming.info.genshin.data.model.Character;
import life.cuptertino.gaming.info.genshin.data.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterDataService {

    @Autowired
    private CharacterRepository repository;

    public List retrieveCharacters() {
        return repository.findAll();
    }

    public Character createCharacter(Character c) {
        return repository.saveAndFlush(c);
    }

}
