package hero_app.service;

import hero_app.dao.HeroRepositoryCustom;
import hero_app.dao.entity.HeroEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author advortco
 */
@Service("heroService")
@Transactional
public class HeroServiceImpl implements HeroService {

    @Autowired
    HeroRepositoryCustom heroRepository;

    @Override
    public List<HeroEntity> getAllHeroes() {
        List<HeroEntity> res = heroRepository.findAll();
        return res;
    }

    @Override
    public void deleteHero(HeroEntity hero) {
        heroRepository.delete(hero);
    }

    @Override
    public void deleteHeroById(Long id) {
        heroRepository.delete(id);
    }

    @Override
    public HeroEntity createHero(HeroEntity hero) {
        return heroRepository.save(hero);
    }

    @Override
    public HeroEntity updateHero(HeroEntity hero) {
        return heroRepository.save(hero);
    }

    @Override
    public HeroEntity findHeroById(long id) {
        return heroRepository.findOne(id);
    }
}
