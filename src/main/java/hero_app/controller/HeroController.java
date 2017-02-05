package hero_app.controller;

import hero_app.dao.entity.HeroEntity;
import hero_app.dao.entity.UniqueSkillEntity;
import hero_app.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;
import java.util.Collections;
import java.util.List;

@RestController
public class HeroController {

    @Autowired
    HeroService heroService;

    @RequestMapping("/heroes")
    public List<HeroEntity> getAllHeroes() {
        return heroService.getAllHeroes();
    }

    @RequestMapping(value = "delete/{id}", method = RequestMethod.DELETE)
    public ResponseEntity<Void> deleteHero(@PathVariable long id) {
        heroService.deleteHeroById(id);
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    @RequestMapping(value = "/hero", method = RequestMethod.POST)
    public ResponseEntity<?> createHero(@RequestBody HeroEntity hero) {
        return new ResponseEntity<HeroEntity>(heroService.createHero(hero), HttpStatus.CREATED);
    }

    @RequestMapping(value = "/hero/update", method = RequestMethod.PUT)
    public ResponseEntity<?> updateHero(@RequestBody HeroEntity hero) {
        return new ResponseEntity<HeroEntity>(heroService.updateHero(hero), HttpStatus.OK);
    }

    @RequestMapping(value = "hero/{id}", method = RequestMethod.GET)
    public ResponseEntity<Collection<UniqueSkillEntity>> getHeroesUniqueSkills(@PathVariable long id) {
        HeroEntity hero = heroService.findHeroById(id);

        return hero != null
                ? new ResponseEntity<>(hero.getUniqueSkills(), HttpStatus.OK)
                : new ResponseEntity<>(Collections.emptyList(), HttpStatus.NOT_FOUND);

    }

}
