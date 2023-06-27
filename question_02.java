import java.util.HashMap;
public class question_02 {


    public int firstUniqChar(String s) {
        HashMap<Character, Integer> frequencyMap = new HashMap<>();

        // Update frequency map
        for (char c : s.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }

        // Find first non-repeating character
        for (int i = 0; i < s.length(); i++) {
            if (frequencyMap.get(s.charAt(i)) == 1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example 1
        String s1 = "leetcode";
        int result1 = solution.firstUniqChar(s1);
        System.out.println(result1);  // Output: 0

        // Example 2
        String s2 = "loveleetcode";
        int result2 = solution.firstUniqChar(s2);
        System.out.println(result2);  // Output: 2

        // Example 3
        String s3 = "aabb";
        int result3 = solution.firstUniqChar(s3);
        System.out.println(result3);  // Output: -1
    }
}

}
