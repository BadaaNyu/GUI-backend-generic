package eu.badaa.catbook.crud.service.rule;

import eu.badaa.catbook.crud.dao.rule.SimpleRuleDao;
import eu.badaa.catbook.crud.model.rule.SimpleRule;
import eu.badaa.generic.crud.service.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SimpleRuleService extends GenericCrudService<SimpleRule,String> {

    @Autowired
    private SimpleRuleDao simpleRuleDao;

    @Override
    public SimpleRuleDao getRepository() {
        return simpleRuleDao;
    }
}
