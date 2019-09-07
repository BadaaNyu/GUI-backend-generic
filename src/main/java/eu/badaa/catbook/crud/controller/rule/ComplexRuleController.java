package eu.badaa.catbook.crud.controller.rule;

import eu.badaa.catbook.crud.model.rule.ComplexRule;
import eu.badaa.catbook.crud.service.rule.ComplexRuleService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class ComplexRuleController extends GenericCrudController<ComplexRule, String> {

    @Autowired
    private ComplexRuleService complexRuleService;

    @Override
    public ComplexRuleService getService() {
        return complexRuleService;
    }
}
