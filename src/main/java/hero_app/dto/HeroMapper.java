package hero_app.dto;

import hero_app.dao.entity.HeroEntity;
import hero_app.dto.util.AbstractDTOMapper;

/**
 * @author advortco
 */
public class HeroMapper extends AbstractDTOMapper<HeroDTO, HeroEntity> {

    @Override
    public HeroDTO map(HeroEntity entity) {
        HeroDTO heroDTO = new HeroDTO();
//        heroDTO.setName(entity.getName());
//        heroDTO.setGender(entity.getGender().toString());
//        heroDTO.setHeroSpecializations(entity.getHeroSpecializations());
//        heroDTO.setHeroSpecializations(entity.getHeroSpecializations());
        return heroDTO;
    }
}
