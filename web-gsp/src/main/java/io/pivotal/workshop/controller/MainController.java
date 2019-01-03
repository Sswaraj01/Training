package io.pivotal.workshop.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.pivotal.workshop.domain.Marketing;

@RestController
public class MainController {

    @RequestMapping("/")
    public ModelAndView home() {

        @SuppressWarnings("serial")
        List<Marketing> offers = new ArrayList<Marketing>() {{
           
        }};


        Map<String, Object> model = new HashMap<String, Object>();
        model.put("today", new Date());
        model.put("offers", offers);


        return new ModelAndView("views/home", model);
    }

}