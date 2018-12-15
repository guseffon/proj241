package com.someproj24.proj24;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.Map;

@Controller
public class ControllerGoods {

    @Autowired
    private RepositoryGoods repositoryGoods;

    @GetMapping("/pg")
    public String getPage()
    {
        return "page";
    }

    @PostMapping("/pg")
    public String postPage(@RequestParam String name,
                           @RequestParam String price,
                           Map<String, Object> model)
    {
        //System.out.println("name: " + name);

        EntityGoods goods = new EntityGoods();

        goods.setName(name);
        goods.setPrice(Float.parseFloat(price));

        this.repositoryGoods.save(goods);

        Collection<EntityGoods> allGoods = repositoryGoods.findAll();

        model.put("allGoods", allGoods);


        return "page";
    }
}
