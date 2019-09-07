package eu.badaa.catbook.crud.model.context;

import eu.badaa.catbook.crud.model.rule.ComplexRule;
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
public class Register extends GenericModel {

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<SimpleRule> simpleRules;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<ComplexRule> complexRules;

    public Register (String id){
        super.setId(id);
    }

}
