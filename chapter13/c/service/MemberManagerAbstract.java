package chapter13.c.service;

import chapter13.c.model.MemberDTO;

public abstract class MemberManagerAbstract implements IMemberManager{
    public abstract boolean addMember(MemberDTO member);
    public abstract boolean removeMember(String name, String phone);
    public abstract boolean updateMember(MemberDTO member);
    public void printLog(String data) {
        System.out.println("data = " + data);
    }
}
