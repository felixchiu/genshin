package life.cuptertino.gaming.info.genshin.controllers;

import life.cuptertino.gaming.info.genshin.data.model.Character;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(path = "/characters")
public class CharacterController {

    @RequestMapping(method = RequestMethod.GET)
    public List<Character> retrieveCharacters() {
        List<Character> result = new ArrayList<>();
        result.add(new Character("Chiu", "Felix", "DaVader"));
        result.add(new Character("Chiu", "Candace", "Twilight"));
        return result;
    }
}
