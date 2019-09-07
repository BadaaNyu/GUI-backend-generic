package eu.badaa.generic.crud.dao;

import eu.badaa.generic.crud.model.GenericModel;
import org.springframework.data.repository.CrudRepository;

public interface GenericCrudRepository<V extends GenericModel,K> extends CrudRepository<V,K> {

}
