package eu.badaa.catbook.crud.controller.rule;

import eu.badaa.catbook.crud.model.rule.SimpleRule;
import eu.badaa.catbook.crud.service.rule.SimpleRuleService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simple-rule")
public class SimpleRuleController extends GenericCrudController<SimpleRule, String> {

    @Autowired
    private SimpleRuleService simpleRuleService;

    @Override
    public SimpleRuleService getService() {
        return simpleRuleService;
    }
}
