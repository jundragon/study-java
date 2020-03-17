package algorithm;

public class MinimalUpdateCost {

    public static void main(String[] args) {

        System.out.println(minimalCost("SUNDAY", "SATURDAY"));
        System.out.println(minimalCost("CAT", "CAR"));

    }

    public static int minimalCost (String str1, String str2) {
        if (str1.isEmpty())
            return str2.length();

        if (str2.isEmpty())
            return str1.length();

        if(str1.charAt(0) == str2.charAt(0))
            return minimalCost(str1.substring(1), str2.substring(1));

        int d, u, i;
        d = minimalCost(str1.substring(1), str2);
        u = minimalCost(str1.substring(1), str2.substring(1));
        i = minimalCost(str1, str2.substring(1));

        if (d < u) {
            return (d < i ? d : i) + 1;
        } else {
            return (u < i ? u : i) + 1;
        }

    }
}
