package edu.icet.controller;

import edu.icet.model.entity.Member;
import edu.icet.service.MemberService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("memberInfo")

public class MemberController {

    MemberService memberService=new MemberService();



    @GetMapping("all")
    public List<Member> getAll(){
        return memberService.getAll();
    }







}
