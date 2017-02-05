package hero_app.dto;

import java.util.List;

/**
 * This class
 *
 * @author advortco
 */
public class HeroDTO {

    private long id;
    private String name;
    private String gender;
    private List<UniqueSkillsDTO> uniqueSkills;
    private List<SpecializationDTO> specializations;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public List<UniqueSkillsDTO> getUniqueSkills() {
        return uniqueSkills;
    }

    public void setUniqueSkills(List<UniqueSkillsDTO> uniqueSkills) {
        this.uniqueSkills = uniqueSkills;
    }

    public List<SpecializationDTO> getSpecializations() {
        return specializations;
    }

    public void setSpecializations(List<SpecializationDTO> specializations) {
        this.specializations = specializations;
    }


}
