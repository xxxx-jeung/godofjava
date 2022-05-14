package chapter13.c.util;

import chapter13.c.model.MemberDTO;

public class FinalReferenceType {
    final MemberDTO dto = new MemberDTO();

    public static void main(String[] args) {
        FinalReferenceType finalReferenceType = new FinalReferenceType();
        finalReferenceType.checkDTO();
    }

    public void checkDTO(){
        System.out.println(dto);
        dto.name="jeung";
        System.out.println("dto = " + dto);
    }
}
