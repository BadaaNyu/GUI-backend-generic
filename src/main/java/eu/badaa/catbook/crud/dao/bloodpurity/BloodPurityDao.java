package eu.badaa.catbook.crud.dao.bloodpurity;

import eu.badaa.catbook.crud.model.bloodpurity.BloodPurity;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BloodPurityDao extends GenericCrudRepository<BloodPurity,String> {
}
