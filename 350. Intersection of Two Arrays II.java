1import java.util.*;
2
3class Solution {
4    public int[] intersect(int[] nums1, int[] nums2) {
5        Map<Integer, Integer> map = new HashMap<>();
6        List<Integer> result = new ArrayList<>();
7
8        for (int num : nums1) {
9            map.put(num, map.getOrDefault(num, 0) + 1);
10        }
11
12        for (int num : nums2) {
13            if (map.getOrDefault(num, 0) > 0) {
14                result.add(num);
15                map.put(num, map.get(num) - 1);
16            }
17        }
18
19        int[] res = new int[result.size()];
20        for (int i = 0; i < result.size(); i++) {
21            res[i] = result.get(i);
22        }
23
24        return res;
25    }
26}
27
