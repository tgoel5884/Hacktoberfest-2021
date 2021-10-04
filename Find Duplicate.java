public class Solution{  
    public static int duplicateNumber(int[] arr){
    
    int i = 0;   
        
	while(i<arr.length)
    { int temp=arr[i];
     boolean ans = false ;
          for(int j=0;j<arr.length;j++)
          { 
          if(i==j)
                  {
                  continue;
                  }
                 else
                 {
                     if(temp == arr[j])
                     {
                         ans = true  ; 
                         break ;
                     }
                 }
              }
             if(ans==true)
             {
                 return arr[i] ;
             }  
          i++ ;    
          }
     return -1 ; 
  }
}
