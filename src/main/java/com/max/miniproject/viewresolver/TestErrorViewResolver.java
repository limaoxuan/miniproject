package com.max.miniproject.viewresolver;

import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;
import org.thymeleaf.expression.Maps;


import javax.servlet.http.HttpServletRequest;
import java.util.Map;

@Component
public class TestErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        return new ModelAndView("redirect:/main");
    }
}
