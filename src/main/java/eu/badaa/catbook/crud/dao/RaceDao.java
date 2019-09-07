package eu.badaa.catbook.crud.dao;

import eu.badaa.catbook.crud.model.Race;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RaceDao extends GenericCrudRepository<Race,String> {
}
