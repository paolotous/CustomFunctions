/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functions;

/**
 *
 * @author Paolo
 */
public class Functions {

   
    public static void main(String[] args) {
      
       int[] nums = {5, 3, 8, 0};
       int[] num2 = {2, 6, 9, 4};
       
       int[] total = merge(nums, nums.length, num2, num2.length);
       
       for(int i = 0; i < total.length; i++){
           System.out.println("Value: " + total[i]);
       }
      
    }
    
    //arrange array integers in ascending
    static int[] sortAsc(int[] nums, int size){
        int temp = 0;
        
        for(int i = 0; i < nums.length; i++){
          for(int j = i+1; j < nums.length; j++){
              if(nums[j] < nums[i]){
                  temp = nums[i];
                  nums[i] = nums[j];
                  nums[j] = temp;
              }
          }
        }
        
        return nums;
    }
    
    //print in reverse order
    static void printReverse(int[] nums, int size){
        
        for(int i = size; i >= 0; i--){
            System.out.println(nums[i]);
        }
    } 
    
    //checks if all elements are the same
    static boolean isUniform(int [] nums, int size){
        int temp = nums[0];
        for(int i = 0; i < size; i++){
            if(nums[i] != temp){
                return false;
            }
        }
        return true;
    } 
    
    //calculates total sum of elements of an array
    static int sumArray(int[] nums, int size){
        int total = 0;        
        for(int i = 0; i < size; i++){
            total += nums[i];
        }
        
        return total;
    } 
    
    //gets the highest number in the array
    static int max(int[] nums, int size){
        int max = 0;
        for(int i = 0; i < size; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        
        return max;
    } 
    
    //searches through the array for a specific value
    static boolean contains(int[] nums, int size, int search){ 
        
        for(int i = 0; i < size; i++){
            if(nums[i] == search){
                return true;
            }
        }
        
        return false;
    }  
    
    //reverses an array 
    static int[] reverse(int[] nums, int size){
      
        int[] temp = new int[size + 1];
        int counter = 0;
        
        for(int i = size; i >= 0; i--){
           temp[counter] = nums[i];
           counter ++;
        }
        return temp;
    }
    
    //arrange array integers in descending
    static int[] sortDesc(int[] nums, int size){
        int temp = 0;
        for(int i = 0; i < size; i++){
            for(int j = i+1; j < size; j++){
               if(nums[j] > nums[i]){
                   temp = nums[i];
                   nums[i] = nums[j];
                   nums[j] = temp;
               }
            }
        }
        
       return nums;
    }
    
    //merge two arrays
    static int[] merge(int[] nums, int size, int[] nums2, int size2){
        
        int[] total = new int[size+size2];
        
        for(int i = 0; i < size; i++){
           total[i] = nums[i];
        }
        
        int counter = size;
        for(int i = 0; i < size2; i++){
            total[counter] = nums2[i];
            counter++;
        }
        
        sortAsc(total, total.length);
        return total;
    }
}
