// Java string related

// iteration over a string
String s = "hello";
s.charAt(0); // "h"

s.length(); // length of string s

char[] temp = s.charAtArray(); // converts string to character array
Arrays.sort(temp); // sort the character array

String s = "leetcode";
s.substring(i, j);
// extracts substring from index i to index j-1
s.substring(1, 5); // output : "eetc"

int charToNum = Integer.parseInt("5"); // converts "5" to integer 5

// String Builder
StringBuilder sb = new StringBuilder();
sb.append(__);
sb.toString(); // convert sb to string

// Min Heap store minimum/smallest element at top
// Min Heap creation for storing pairs (a, b)
// pairs are sorted in ascending order of a 
PriorityQueue<int[]> minHeap = new PriorityQueue<>((a,b) -> a[0] - b[0]);
// pushing into min heap
minHeap.offer(new int[]{_, _});
minHeap.size(); // size of heap
minHeap.poll(); // pop the top
minHeap.poll()[i]; // pop the top and access element at index i
minHeap.isEmpty(); // true if heap is empty

// Hash Map creation
Map<Integer, Integer> mp = new HashMap<>();
// store elements and their frequency
for(int x : elements) {
  // mp[x]++
  mp.put(x, mp.getOrDefault(x, 0) + 1);
}
// iterate over map to access key-value pairs
for(Map.Entry<Integer, Integer> entry : mp.entrySet()) {
  int element = entry.getKey();
  int freq = entry.getValue();
}

mp.containsKey(key); // return true if mp contains key
mp.get(key).add(value); // mp[key] = value

