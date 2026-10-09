class Solution {
    public int[] productExceptSelf(int[] arr) {
         int len = arr.length;
      int prod =1; int zerocount =0;
      for(int i=0;i<len;i++){
          if(arr[i] == 0){
              zerocount++;
          }
          else
          prod *= arr[i];          
      }
      int array[] = new int[len]; 
      for(int j=0;j<len;j++){
          if(zerocount > 1){
              array[j] = 0;
          }
          else if(zerocount ==1){
              if(arr[j] == 0) {
                  array[j] = prod;
              }
              else array[j] = 0;
          }
          else array[j] =   prod/arr[j];
      }      
      return array;
    }
}