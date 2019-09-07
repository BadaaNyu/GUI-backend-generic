package eu.badaa.catbook.crud.dao.rule;

import eu.badaa.catbook.crud.model.rule.SimpleRule;
import eu.badaa.generic.crud.dao.GenericCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SimpleRuleDao extends GenericCrudRepository<SimpleRule,String> {
}
