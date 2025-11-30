package edu.icet.service;

import edu.icet.Repository.MemberRepository;
import edu.icet.model.entity.Member;

import java.util.List;

public class MemberService {

    MemberRepository memberRepository=new MemberRepository();


    public List<Member> getAll() {
        return memberRepository.getAll();
    }

    public void addMember(Member member) {
        memberRepository.addMember(member);
    }

    public void remove(String id) {
        memberRepository.remove(id);
    }

    public void merge(Member member) {
        memberRepository.merge(member);
    }
}
