package eu.badaa.catbook.crud.dao.rule;

import eu.badaa.catbook.crud.model.rule.ComplexRule;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ComplexRuleDao extends GenericCrudRepository<ComplexRule,String> {
}
