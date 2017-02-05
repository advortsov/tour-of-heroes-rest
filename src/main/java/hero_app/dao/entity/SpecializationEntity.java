package hero_app.dao.entity;

import javax.persistence.*;

/**
 * @author advortco
 */
@Entity
@Table(name = "specialization")
public class SpecializationEntity {

    @Id
    @SequenceGenerator(name = "specialization_spec_id_seq",
            sequenceName = "specialization_spec_id_seq",
            allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "specialization_spec_id_seq")
    @Column(name = "spec_id", updatable = false)
    private Long id;

    @Column(name = "specialization")
    private String specName;

//    @ManyToMany(mappedBy = "heroSpecializations", fetch = FetchType.LAZY)
//    private List<HeroEntity> heroes;


    public SpecializationEntity() {
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public SpecializationEntity(String specName) {
        this.specName = specName;
    }

    public String getSpecName() {
        return specName;
    }

    public void setSpecName(String specName) {
        this.specName = specName;
    }

//    public List<HeroEntity> getHeroes() {
//        return heroes;
//    }
//
//    public void setHeroes(List<HeroEntity> heroes) {
//        this.heroes = heroes;
//    }
}
