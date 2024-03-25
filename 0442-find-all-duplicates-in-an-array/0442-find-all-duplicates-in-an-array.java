class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        

    List<Integer> resultSet = new ArrayList<>();

    // Set to store unique numbers
    Set<Integer> uniqueSet = new HashSet<>();
    for (int num : nums) {

      // If already present, then it is a duplicate
      if (uniqueSet.contains(num))
        resultSet.add(num);

      // Add the number to the set
      uniqueSet.add(num);
    }

    return resultSet;
  }

}
    
