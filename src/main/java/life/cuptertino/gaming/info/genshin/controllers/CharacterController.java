package life.cuptertino.gaming.info.genshin.controllers;

import life.cuptertino.gaming.info.genshin.data.model.Character;
import life.cuptertino.gaming.info.genshin.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/characters")
public class CharacterController {

    @Autowired
    private CharacterService service;

    @RequestMapping(method = RequestMethod.GET)
    public List<Character> retrieveCharacters() {
        return service.retrieveCharacters();
    }

    @RequestMapping(method = RequestMethod.POST)
    public Character createCharacter(@RequestBody Character c) {
        return service.createCharacter(c);
    }

}
