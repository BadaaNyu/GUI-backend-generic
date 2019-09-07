package eu.badaa.catbook.crud.dao.location;

import eu.badaa.catbook.crud.model.location.Province;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProvinceDao extends GenericCrudRepository<Province,String> {
}
