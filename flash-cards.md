# Boyer-Moore Majority Voting Algorithm
    - Can be used to find the majority element in an array i.e an element that occurs more than n/2 times in an array.
    - Select a candidate and if the current element matches the candidate increase the vote or else decreate the vote
      whenever the vote becomes zero we need to select a new candidate. The second step if do a second iteration to verify the majority element
    - This works becuase the majority element domicates the array.
    - Time complexity for this O(n) and space complexity is O(1)
