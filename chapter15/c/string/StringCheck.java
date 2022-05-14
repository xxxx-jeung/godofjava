package chapter15.c.string;

public class StringCheck {
    public static void main(String[] args) {
        StringCheck sample = new StringCheck();

        String addresses[] = new String[]{
                "서울시 구로구 신림동",
                "경기도 성남시 분당구 정자동 개발 공장",
                "서울시 구로구 개봉동",
        };
        //sample.containsAddress(addresses);
        sample.checkMatch();

    }

    public void checkMatch(){
        String text = "This is a text";
        String compare1 = "is";
        String compare2 = "this";

        System.out.println("text.regionMatches(2, compare1, 0, 1) = " + text.regionMatches(2, compare1, 0, 1));
        System.out.println("text.regionMatches(5, compare1, 0, 2) = " + text.regionMatches(5, compare1, 0, 2));
        System.out.println("text.regionMatches(true, 0, compare2, 0, 4) = " + text.regionMatches(true, 0, compare2, 0, 4));
    }

    public void checkAddress(String[] addresses){
        int startCount = 0, endCount = 0;
        String startText = "서울시";
        String endText = "동";
        for(String address : addresses){
            if(address.startsWith(startText)){
                startCount++;
            }
            if(address.endsWith(endText)){
                endCount++;
            }
        }
        System.out.println("startText = " + startText + " count is " + startCount);
        System.out.println("endText = " + endText + " count is " + endCount);
    }

    public void containsAddress(String[] addresses){
        int containCount = 0;
        String containText = "구로";
        for(String address : addresses){
            if(address.contains(containText)){
                containCount++;
            }
        }
        System.out.println("containText = " + containText + " count is " + containCount);
    }
}
