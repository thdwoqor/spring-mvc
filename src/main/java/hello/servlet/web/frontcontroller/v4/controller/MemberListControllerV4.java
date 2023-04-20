package hello.servlet.web.frontcontroller.v4.controller;

import hello.servlet.domain.member.Member;
import hello.servlet.domain.member.MemberRepository;
import hello.servlet.web.frontcontroller.ModelView;

import java.util.List;
import java.util.Map;

public class MemberListControllerV4 implements ControllerV4{

    private final MemberRepository memberRepository = MemberRepository.getInstance();


    @Override
    public String process(final Map<String, String> paramMap, final Map<String, Object> model) {
        List<Member> members = memberRepository.findAll();

        model.put("members",members);

        return "members";
    }
}
