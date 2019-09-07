package eu.badaa.catbook.crud.dao.location;

import eu.badaa.catbook.crud.model.location.City;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CityDao extends GenericCrudRepository<City,String> {

}
