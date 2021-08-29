class Solution {
    public String kthLargestNumber(String[] a, int k) {
        String ans = "";
        Map<Integer, List<String>> numbers = new TreeMap<>();
        int n = a.length;
        for (int i = 0; i < n; ++i) {
            int currentLength = a[i].length();
            if (numbers.containsKey(currentLength)) {
                List<String> currentList = numbers.get(currentLength);
                currentList.add(a[i]);
                numbers.put(currentLength, currentList);
            } else {
                List<String> currentList = new ArrayList<>();
                currentList.add(a[i]);
                numbers.put(currentLength, currentList);
            }
        }
        Integer[] lengths = numbers.keySet().toArray(new Integer[0]);
        for (int i = lengths.length - 1; i >= 0; i--) {
            int totalElementsWithCurrentLength = numbers.get(lengths[i]).size();
            if (k > totalElementsWithCurrentLength) {
                k -= totalElementsWithCurrentLength;
            } else {
                List<String> answerList = numbers.get(lengths[i]);
                answerList.sort(Comparator.naturalOrder());
                ans = answerList.get(totalElementsWithCurrentLength - k);
                break;
            }
        }
        return ans;
    }
}