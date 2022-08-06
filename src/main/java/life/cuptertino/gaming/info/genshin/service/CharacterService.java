package life.cuptertino.gaming.info.genshin.service;

import life.cuptertino.gaming.info.genshin.data.model.Character;
import life.cuptertino.gaming.info.genshin.data.service.CharacterDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    private CharacterDataService dataService;

    public List retrieveCharacters() {
        return dataService.retrieveCharacters();
    }

    public Character createCharacter(Character c) {
        return dataService.createCharacter(c);
    }

}
