package eu.badaa.catbook.crud.model.context;

import eu.badaa.catbook.crud.model.location.Province;
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
public class Sell extends GenericModel {

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Province> provinces;

    public Sell(String id) {
        super.setId(id);
    }

}
