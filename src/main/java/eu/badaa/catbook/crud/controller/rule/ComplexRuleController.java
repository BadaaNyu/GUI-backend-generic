package eu.badaa.catbook.crud.controller.rule;

import eu.badaa.catbook.crud.model.rule.ComplexRule;
import eu.badaa.catbook.crud.service.rule.ComplexRuleService;
import eu.badaa.generic.crud.controller.GenericCrudController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/complex-rule")
public class ComplexRuleController extends GenericCrudController<ComplexRule, String> {

    @Autowired
    private ComplexRuleService complexRuleService;

    @Override
    public ComplexRuleService getService() {
        return complexRuleService;
    }
}
