package chapter12.c.inheritance;

import java.util.Objects;

public class MemberDTO {
    public String name;
    public String phone;
    public String email;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MemberDTO memberDTO = (MemberDTO) o;

        if (name != null ? !name.equals(memberDTO.name) : memberDTO.name != null) return false;
        if (phone != null ? !phone.equals(memberDTO.phone) : memberDTO.phone != null) return false;
        return email != null ? email.equals(memberDTO.email) : memberDTO.email == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (phone != null ? phone.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        return result;
    }

    public MemberDTO(String name) {
        this.name = name;
    }

    public MemberDTO(String name, String phone) {
        this.name = name;
        this.phone = phone;
        System.out.println();
    }

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

}
