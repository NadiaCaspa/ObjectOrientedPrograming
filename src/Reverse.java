public class Reverse {
    public static void main(String[] args) {
        System.out.println(isExactReverse("ba", "a"));
        System.out.println(isExactReverse("desserts", "stressed"));
        System.out.println(isExactReverse("apple", "apple"));
        System.out.println(isExactReverse("regal", "lager"));
        System.out.println(isExactReverse("war", "raw"));
        System.out.println(isExactReverse("pal", "slap"));
    }

    public static boolean isExactReverse(String x, String y) {
        // start looping from the back so when
        String r = ""; //d to get the entire string we add a + r which gives us sed it keeps doing that till it gets the whole string in reverse.
        char a;    //d , e, s
        // the for loop starts from the beginning ie b , a then we add a which is the index at i to r
        for (int i = 0 ; i < x.length() ; i++) {
            a = x.charAt(i);
            r = a + r;

        }

        if (r.equals(y)){
            return true;
        }
        else{
            return false;
        }
    }


}
