package eu.badaa.catbook.crud.model.bloodpurity;

import eu.badaa.catbook.crud.model.rule.SimpleRule;
import eu.badaa.generic.crud.model.GenericModel;
import lombok.*;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.List;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class BloodPurity extends GenericModel {

    private String name;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SimpleRule> rules;

}
