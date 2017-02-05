package hero_app.dao;

import hero_app.dao.entity.HeroEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author advortco
 */
public interface HeroRepositoryCustom extends JpaRepository<HeroEntity, Long> {
//    List<HeroEntity> getAllHeroes();
//
//    void createHeroEntity(HeroEntity hero);
//
//    HeroEntity updateHeroEntity(HeroEntity hero);
//
//    void deleteHeroEntityById(Long id);
}
