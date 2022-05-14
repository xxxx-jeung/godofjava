package chapter12;

import java.util.Arrays;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    public MemberDTO(String name, String phone, String email) {
        this.name = name;
        this.phone = phone;
        this.email = email;
    }

    @Override
    public String toString() {
        return "MemberDTO{" +
                "name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    /*public String toString(){
        return "name = "+this.name+", phone = "+ this.phone +", email = " + this.email;
    }*/

    public static void main(String[] args) {
        MemberDTO memberDTO = new MemberDTO("user", "number", "email");
        System.out.println("memberDTO = " + memberDTO);

    }
}
