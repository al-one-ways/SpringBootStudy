package study.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!");
        return "hello";
        //스프링 부트 템플릿 엔진 기본 viewName 매핑
        //'resources:tempelates/'+{viewName}+'.html'
    }
}
