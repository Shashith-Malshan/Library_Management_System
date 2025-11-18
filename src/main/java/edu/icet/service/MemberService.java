package edu.icet.service;

import edu.icet.Repository.MemberRepository;
import edu.icet.model.entity.Member;

import java.util.List;

public class MemberService {

    MemberRepository memberRepository=new MemberRepository();


    public List<Member> getAll() {
        return memberRepository.getAll();
    }
}
