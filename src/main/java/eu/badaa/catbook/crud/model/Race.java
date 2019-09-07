package eu.badaa.catbook.crud.model;

import eu.badaa.catbook.crud.model.context.Register;
import eu.badaa.catbook.crud.model.context.Sell;
import eu.badaa.generic.crud.model.GenericModel;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Getter
@Setter
@ToString
@AllArgsConstructor
@Entity
public class Race extends GenericModel {

    private String name;

    @OneToOne
    private Register register;

    @OneToOne
    private Sell sell;

    public Race() {
        this.register = new Register(super.getId());
        this.sell = new Sell(super.getId());
    }
}
