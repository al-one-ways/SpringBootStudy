package study.springstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @GetMapping("hello")
    public String hello(Model model) {
        model.addAttribute("data", "spring!");
        return "hello";
        //스프링 부트 템플릿 엔진 기본 viewName 매핑
        //'resources:tempelates/'+{viewName}+'.html'

        //서버 실행할땐 build/lib ~.jar 실행시키면 됨
        //java -jar {filename}
    }
    @GetMapping("hello-mvc")
    public String HelloMvc(@RequestParam(value = "name") String name, Model model){
        model.addAttribute("name", name);
        return "hello-template";
    }

    @GetMapping("hello-string")
    @ResponseBody //응답body부분에 직접 리턴값을 넣는것
    public String HelloString(@RequestParam("name")String name){
        return "hello " + name;
    }

    @GetMapping("hello-api")
    @ResponseBody //필요한 값 보기 command+p
    public Hello helloApi(@RequestParam("name") String name){
        Hello hello = new Hello();
        hello.setName(name);
        return hello;
    }


    static class Hello {
        private String name;
        //getter Setter command+n
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
