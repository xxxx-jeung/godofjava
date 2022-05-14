package chapter08;

public class ReferenceConstructor {
    public static void main(String[] args) {
        ReferenceConstructor referenceConstructor = new ReferenceConstructor();
        referenceConstructor.makeMemberObject();
    }

    public void makeMemberObject() {
        MemberDTO dto1 = new MemberDTO();
        MemberDTO dto2 = new MemberDTO("Sangmin");
        MemberDTO dto3 = new MemberDTO("Sangmin", "010101010100101");
        MemberDTO dto4 = new MemberDTO("Sangmin", "010101010100101", "asd@asd.com");
    }
}
