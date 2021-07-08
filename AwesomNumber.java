public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(totalAwesome(s));
    }

    public static int totalAwesome(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                if (isAwesome(s.substring(i, j)))
                    count++;
            }
        }
        return count;
    }

    public static boolean isAwesome(String s) {
        int count = (int) Arrays.asList(s.split("")).stream().filter(n -> n.equals("1")).count();
        return count != 0 ? s.length() % count == 0 : false;
    }

}
