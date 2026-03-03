package Biweekly1;

public class Decode {
    static int Decodesolve(String s, int i){
        //base
        if(i == s.length()) return 1;
        //base2
        if(s.charAt(i) == '0') return 0;

        //doing recursive - 1 digit
        int ways = Decodesolve(s, i+1);

        //doing recursive - 2 digits
        if(i + 1 < s.length()) {
            int twoDigit = Integer.parseInt(s.substring(i, i + 2));

            if(twoDigit >= 10 && twoDigit <= 26) {
                ways += Decodesolve(s, i + 2);
            }
        }
        return ways;

    }

    public static void main(String[] args) {
        System.out.println(Decodesolve("226",0));
        System.out.println(Decodesolve("10",0));
        System.out.println(Decodesolve("110",0));
        System.out.println(Decodesolve("06",0));
        System.out.println(Decodesolve("1106",0));



    }

}
