import java.util.*;
import java.util.concurrent.*;

public class Test {
    public static void main(String[] args) {
        Test test = new Test();
        String param = "abcabcbb";
        test.lengthOfLongestSubstring(param);
    }

    void lengthOfLongestSubstring(String s){
        String[] str = s.split("");
        String[] arr = new String[str.length];



        for(int select1 = 0; select1 < str.length; select1++){

        }



    }

    void LinkedListQueue(){
        Deque<Integer> deq = new ConcurrentLinkedDeque<>();
        Queue<Integer> deqConQue = new ConcurrentLinkedQueue<>();
        Queue<Integer> queue = new LinkedList<>();

    }

    void stackTest(){
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.pop();
        System.out.println(stack.size());
    }

    void HashCodeTest(){
        TestVo testVo1 = new TestVo(1, "오제웅", "10");
        System.out.println(testVo1);
        System.out.println(testVo1.hashCode());

        TestVo testVo2 = new TestVo(1, "오제웅", "10");
        System.out.println(testVo2);
        System.out.println(testVo2.hashCode());

        System.out.println(testVo1.equals(testVo2));
    }

    void HashMapTest(){
        var map1 = new HashMap<String, Object>();
        map1.put("test1", "t123123");
        map1.put("test2", "t123123");
        map1.put("test3", "t123123");
        map1.put("test4", "t123123");
        map1.put("test5", "t123123");
        map1.put("test6", "t123123");
        map1.put("test7", "t123123");
        map1.put("test8", "t123123");
        map1.put("test9", "t123123");
        map1.put("test10", "t123123");
        map1.put("test11", "t123123");
        var concurrent = new ConcurrentHashMap<String, Object>();
        var queList = new ArrayDeque<String>();
        var conQueList = new ConcurrentLinkedDeque<String>();
        new ConcurrentLinkedQueue<>();
        new LinkedBlockingDeque<>();
        new ArrayList<>();
        new HashSet<>();
        new Stack<>();
        new ArrayDeque<>();
        new TreeSet<>();
        new TreeMap<>();
        NavigableSet<Integer> navigableSet = new TreeSet<>();
        //new PrimitiveIterator<>();
        new PriorityQueue<>();
        var Hashtable = new Hashtable<String, Object>();
        var syncTable = Collections.synchronizedMap(new HashMap<String, Object>());
        var linkHashMap = new LinkedHashMap<String, Object>();



        var map2 = new HashMap<String, Object>();
        map2.put("test2", "t123123");
        map2.put("test2", "t123123");

        System.out.printf("%d, %d \n", map1.hashCode(), map2.hashCode());
        System.out.println(map1.equals(map2));
    }

    public static int numberOfLeadingZeros(int i) {
        // HD, Count leading 0's
        if (i <= 0)
            return i == 0 ? 32 : 0;
        int n = 31;
        if (i >= 1 << 16) { n -= 16; i >>>= 16; }
        if (i >= 1 <<  8) { n -=  8; i >>>=  8; }
        if (i >= 1 <<  4) { n -=  4; i >>>=  4; }
        if (i >= 1 <<  2) { n -=  2; i >>>=  2; }
        return n - (i >>> 1);
    }
}




