package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.web.frontcontroller.ModelView;

import java.util.Map;

public class MemberFormControllerV4 implements ControllerV4 {

    @Override
    public String process(final Map<String, String> paramMap, final Map<String, Object> model) {
        return "new-form";
    }
}
