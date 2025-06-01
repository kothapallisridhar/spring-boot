package com.sri.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {

    @RequestMapping(path = "/crate/order", method = RequestMethod.GET)
    public ModelAndView createOrder() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("message");
        modelAndView.addObject("response", "Order Created successfully. Order Id is: " + Math.random());
        return modelAndView;
    }

    @RequestMapping(path = "/cancel/order", method = RequestMethod.GET)
    public ModelAndView cancelOrder() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("message");
        modelAndView.addObject("response", "Order Cancelled successfully");
        return modelAndView;
    }
}
