package edu.icet.controller;

import edu.icet.model.entity.Member;
import edu.icet.service.MemberService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("memberInfo")

public class MemberController {

    MemberService memberService=new MemberService();



    @GetMapping("all")
    public List<Member> getAll(){
        return memberService.getAll();
    }

    @GetMapping("{id}")
    public Member getMember(@PathVariable String id){
        for (Member member:memberService.getAll()){
            if(member.getId().equalsIgnoreCase(id)){
                return member;
            }
        }
        return null;
    }

    @DeleteMapping("{id}")
    public void removeMember(@PathVariable String id){
        memberService.remove(id);
    }

    @PostMapping("add")
    public void addMember(@RequestBody Member member){
        memberService.addMember(member);

    }

    @PutMapping("update")
    public void merge(@RequestBody Member member){
        memberService.merge(member);
    }




}
