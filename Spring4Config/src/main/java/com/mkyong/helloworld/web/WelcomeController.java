package com.mkyong.helloworld.web;

import com.mkyong.helloworld.service.HelloWorldService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * Created by 205025 on 6/6/2016.
 */
@Controller
public class WelcomeController {
    private final Logger logger = LoggerFactory.getLogger(WelcomeController.class);
    private final HelloWorldService helloWorldService;
    @Value("${required.userName}")
    private String fromPropertyFile;

    @Autowired
    public WelcomeController(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {

        logger.debug("index() is executed!");

        model.put("title", helloWorldService.getTitle(""));
        logger.debug(fromPropertyFile);
        model.put("msg", fromPropertyFile);

                return "index";
    }

    @RequestMapping(value = "/hello/{name:.+}", method = RequestMethod.GET)
    public ModelAndView hello(@PathVariable("name") String name) {

        logger.debug("hello() is executed - $name {}", name);

        ModelAndView model = new ModelAndView();
        model.setViewName("index");

        model.addObject("title", helloWorldService.getTitle(name));
        model.addObject("msg", helloWorldService.getDesc());

        return model;

    }

}
