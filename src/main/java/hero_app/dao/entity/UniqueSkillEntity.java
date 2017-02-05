package hero_app.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.List;

/**
 * @author advortco
 */
@Entity
@Table(name = "unique_skills")
public class UniqueSkillEntity {

    @Id
    @SequenceGenerator(name = "unique_skills_skill_id_seq",
            sequenceName = "unique_skills_skill_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "unique_skills_skill_id_seq")
    @Column(name = "skill_id", updatable = false)
    private Long id;

    @Column(name = "skill_name")
    private String skillName;

    @ManyToOne
    @JoinColumn(name = "hero_id_fk")
    @JsonBackReference
    private HeroEntity hero;

    public UniqueSkillEntity() {
    }

    public UniqueSkillEntity(String skillName) {
        this.skillName = skillName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return skillName;
    }

    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

    public HeroEntity getHero() {
        return hero;
    }

    public void setHero(HeroEntity hero) {
        this.hero = hero;
    }
}
