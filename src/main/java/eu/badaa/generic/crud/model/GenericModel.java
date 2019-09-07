package eu.badaa.generic.crud.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.util.UUID;

@MappedSuperclass
@Getter
@Setter
@ToString
public class GenericModel {

    @Id
    private String id;

    public GenericModel() {
        this.id = UUID.randomUUID().toString();
    }
}
