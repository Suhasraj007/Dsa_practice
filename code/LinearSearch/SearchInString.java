public class SearchInString {
    public static void main(String[] args) {
        String name = "Suhas";
        // search(name, 'h');
        int index = search(name, 'h');
        if (index == -1) {
            System.out.println("Element not found");
        } else {
            System.out.println("Element found at " + index + "th position");
        }

        System.out.println(search2(name, 'h'));
    }

    // boolean using for each loop
    private static boolean search2(String name, char c) {
        if (name.length() == 0) {
            return false;
        }
        for (char i : name.toCharArray()) {
            if (i == c) {
                return true;
            }
        }
        return false;
    }

    // return index or -1
    private static int search(String name, char c) {
        if (name.length() == 0) {
            return -1;
        }
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == c) {
                return i;
            }
        }
        return -1;
    }
}
