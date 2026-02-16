package Recursion;

public class CroakFrogs {

    public static int minNumberOfFrogs(String croakSound) {

        int[] stage = new int[5];
        int active = 0;
        int max = 0;

        for (char ch : croakSound.toCharArray()) {

            switch (ch) {
                case 'c':
                    stage[0]++;
                    active++;
                    max = Math.max(max, active);
                    break;

                case 'r':
                    if (stage[0] == 0) return -1;
                    stage[0]--;
                    stage[1]++;
                    break;

                case 'o':
                    if (stage[1] == 0) return -1;
                    stage[1]--;
                    stage[2]++;
                    break;

                case 'a':
                    if (stage[2] == 0) return -1;
                    stage[2]--;
                    stage[3]++;
                    break;

                case 'k':
                    if (stage[3] == 0) return -1;
                    stage[3]--;
                    active--;
                    break;
            }
        }

        if (active != 0) return -1;
        return max;
    }

    public static void main(String[] args) {

        System.out.println(minNumberOfFrogs("croakcroak"));
        System.out.println(minNumberOfFrogs("crcoakroak"));
        System.out.println(minNumberOfFrogs("croakcrook"));
        System.out.println(minNumberOfFrogs("croakcroa"));
        System.out.println(minNumberOfFrogs("croak"));

    }
}
