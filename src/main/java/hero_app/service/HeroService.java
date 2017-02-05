package hero_app.service;

import hero_app.dao.entity.HeroEntity;

import java.util.List;

/**
 * @author advortco
 */
public interface HeroService {

    List<HeroEntity> getAllHeroes();

    void deleteHero(HeroEntity hero);

    void deleteHeroById(Long id);

    HeroEntity createHero(HeroEntity hero);

    HeroEntity updateHero(HeroEntity hero);

    HeroEntity findHeroById(long id);
}
