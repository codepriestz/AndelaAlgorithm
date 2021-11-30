package com.andela;



public class Algorithm {


  public static void main(String[] args) {

    int[] input = new int[]{2,1,1,1,5,3,2};
    System.out.println("Result: " + maximSubArray(input, 7));
  }

  public static int maximSubArray(int[] painting, int price) {
    int[] sum = new int[painting.length];
    sum[0] = painting[0];
    for (int i = 1; i < painting.length; i++) {
      sum[i] = sum[i - 1] + painting[i];
    }
    int maxLength = Integer.MIN_VALUE;
    for (int i = painting.length - 1; i > 0; i--) {
      int curr = sum[i];
      for (int j = i - 1; j >= 0; j--) {
        int diff = curr - sum[j];
        if (diff <= price) {
          maxLength = Math.max(i - j, maxLength);
        }
      }
    }
    return maxLength;
  }
// [2,1,1,1,5,3,2]
   [2,3,]

}
