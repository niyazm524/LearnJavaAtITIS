package ml.bimdev.lesson31;

class BruteTask {
    public static void main(String[] args) {
        generateCombinationsRecursion("abc");
        //System.out.println(Arrays.toString(generateCombinationsRecursion("abc".toCharArray(), )));
    }

    private static void generateCombinationsRecursion(String str) {
        generateCombinationsRecursion("", str);
    }

    private static void generateCombinationsRecursion(String prefix, String str) {
        int n = str.length();
        if (n == 0) System.out.println(prefix);
        else {
            for (int i = 0; i < n; i++)
                generateCombinationsRecursion(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));
        }
    }

    /*
    abc
    acb
    bac
    bca
    cab
    cba

     */

}
