package eu.badaa.catbook.crud.service.rule;

import eu.badaa.catbook.crud.dao.rule.ComplexRuleDao;
import eu.badaa.catbook.crud.model.rule.ComplexRule;
import eu.badaa.generic.crud.service.GenericCrudService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ComplexRuleService extends GenericCrudService<ComplexRule,String> {

    @Autowired
    private ComplexRuleDao complexRuleDao;

    @Override
    public ComplexRuleDao getRepository() {
        return complexRuleDao;
    }
}
