package hero_app.dao.entity;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author advortco
 */
@Entity
@Table(name = "hero")
public class HeroEntity {

    @Id
    @SequenceGenerator(name = "hero_hero_id_seq",
            sequenceName = "hero_hero_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "hero_hero_id_seq")
    @Column(name = "hero_id", updatable = false)
    private Long id;

    @Column(name = "name")
    private String name;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @OneToMany(mappedBy = "hero", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JsonManagedReference
    private List<UniqueSkillEntity> uniqueSkills = new ArrayList<>();

    @ManyToMany
    @JoinTable(
            name = "specialization",
            joinColumns = @JoinColumn(name = "hero_id", referencedColumnName = "hero_id"),
            inverseJoinColumns = @JoinColumn(name = "spec_id", referencedColumnName = "spec_id"))
    private List<SpecializationEntity> heroSpecializations;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public List<SpecializationEntity> getHeroSpecializations() {
        return heroSpecializations;
    }

    public void setHeroSpecializations(List<SpecializationEntity> heroSpecializations) {
        this.heroSpecializations = heroSpecializations;
    }

    public List<UniqueSkillEntity> getUniqueSkills() {
        return uniqueSkills;
    }

    public void setUniqueSkills(List<UniqueSkillEntity> uniqueSkills) {
        this.uniqueSkills = uniqueSkills;
    }
}
