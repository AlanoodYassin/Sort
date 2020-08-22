/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sort;

import java.util.Random;

/**
 *
 * @author AnooD
 */
public class RandomArray {
    int [] generateRandom() {
      Random rd = new Random(); 
      int max_size = 500;
      int[] arr = new int[rd.nextInt(max_size)];
      for (int i = 0; i < arr.length; i++) {
         arr[i] = rd.nextInt(); 
   }
      return arr;
    }
    
     public static void main(String[] args) {
   
    }
}
