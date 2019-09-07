package eu.badaa.catbook.crud.model.rule;

import eu.badaa.generic.crud.model.GenericModel;
import lombok.*;

import javax.persistence.Entity;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class SimpleRule extends GenericModel {

    private String ruleName;
    private boolean mandatory;
    private String description;
    private String pattern;

}
