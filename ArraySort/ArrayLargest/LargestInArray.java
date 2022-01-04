package ArrayLargest;
public class LargestInArray{
            public static void main(String[] args) {
                
                int [] arr = {19,5,121,0,4,8};
                System.out.println(largestInArray(arr));
                
            }
        
            static int largestInArray(int [] a) {
                    int max = a[0];
                    for(int i=1;i<a.length;i++) {
                        if(a[i] > max) {
                            max = a[i];
                        }
                    }
                    return max;
            }
      }
