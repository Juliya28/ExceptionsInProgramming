//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task_1 {
    public static void main (String[]args) {
  
        int[] arr = new int[] { 1, 2, 3, 4, 5 };
        indexOf(arr, 3);
      }
      static int arrLength(int[] array, int find) {
    
        if (array.length < 10)
          return -1;
        return 1;
      }
      static int indexOf(int[] array, int find){
        if (array[2] == 10)
            return -2;
        return 2;
      }
      static int ifNull(int[] array, int find){
        if (array == null)
            return -3;
        return find;
      }
      
      
    
        
    
        
}