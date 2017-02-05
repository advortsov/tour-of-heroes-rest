package hero_app;

import hero_app.dao.HeroRepositoryCustom;
import hero_app.dao.entity.Gender;
import hero_app.dao.entity.HeroEntity;
import hero_app.dao.entity.SpecializationEntity;
import hero_app.dao.entity.UniqueSkillEntity;
import hero_app.service.HeroService;
import hero_app.service.HeroServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(new Class<?>[] {Application.class, JpaConfig.class}, args);

//
//        HeroService service = new HeroServiceImpl();
//
//        List<SpecializationEntity> specs = new ArrayList<>();
//        specs.add(new SpecializationEntity("Uhvatskaya"));
//        specs.add(new SpecializationEntity("Kolovratskaya"));
//        specs.add(new SpecializationEntity("Ignatskaya"));
//
//        List<UniqueSkillEntity> skills = new ArrayList<>();
//        skills.add(new UniqueSkillEntity("skill1"));
//        skills.add(new UniqueSkillEntity("skill2"));
//
//        HeroEntity hero1 = new HeroEntity();
//        hero1.setName("Ignato");
//        hero1.setGender(Gender.MALE);
//        hero1.setHeroSpecializations(specs);
//        hero1.setUniqueSkills(skills);
//
//        service.createHero(hero1);
    }
}
