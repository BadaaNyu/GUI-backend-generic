package eu.badaa.catbook.crud.model.location;

import eu.badaa.catbook.crud.model.bloodpurity.BloodPurity;
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
public class City extends GenericModel {

    private String name;
    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<BloodPurity> bloodPurityList;

}
