package chapter13.c.service;

import chapter13.c.model.MemberDTO;

public class MemberManagerImpl2 extends MemberManagerAbstract{

    public static void main(String[] args) {
        MemberManagerImpl2 memberManagerImpl2 = new MemberManagerImpl2();
        MemberDTO memberDTO = new MemberDTO();
        System.out.println(memberManagerImpl2.addMember(memberDTO));
    }
    @Override
    public boolean addMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean removeMember(String name, String phone) {
        return false;
    }

    @Override
    public boolean updateMember(MemberDTO member) {
        return false;
    }

    @Override
    public boolean Test(MemberDTO member) {
        return false;
    }
}
