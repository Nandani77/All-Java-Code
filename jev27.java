package allJava;

public class jev27 {
    public static void main(String[] args){
        // sum of floating numbers
       // float[] marks ={45.4f, 67.8f,78.3f,88.0f,23.8f};
       // float sum = 0;
      //  for(float element:marks){
      //      sum= sum +element;
      //  }
     //   System.out.println("the value of sum :" +sum);

        // boolean true or false
      //  float[] marks = {45.4f, 67.8f,78.3f,88.0f,23.8f};
      //  float num = 45.4f;
    //    boolean isInArray = false;
     //   for(float element:marks){
     //       if(num==element){
     //           isInArray = true;
     //           break;
     //       }
      //  }
     //   if(isInArray){
     //       System.out.println("the value is present in the array");

     //   }
     //   else{
     //       System.out.println("this is not present in the array");

        //average of floats

      //   float[] marks ={45.4f, 67.8f,78.3f,88.0f,23.8f};
     //    float sum = 0;
     //     for(float element:marks){
      //        sum= sum +element;
     //     }
      //    System.out.println("the value of average marks is :" +sum/marks.length);
    //    int [][] mat1 = {{1, 2, 3},
    //                     {4, 5, 6}};
    //    int[][] mat2 = {{2, 6, 13},
     //                   {4, 7, 1}};
     //   int[][] result = {{0, 0, 0},
     //                    {0, 0, 0}};
     //   for(int i=0;i<mat1.length;i++){
     //       for(int j=0;j<mat2.length;j++){
     //           System.out.format("Setting value for i=%d and j=%d", i, j);
     //           result[i][j] = mat1[i][j] + mat2[i][j];
     //       }
     //       System.out.println("");
     //   }
        int [] arr = {1, 32, 43, 55, 54, 3, 23 };
        int l = arr.length;
        int n = Math.floorDiv(1,2);
        int temp;
        for(int i=0;i<n; i++){
            temp = arr[i];
            arr[i] = arr[l-i-1];
            arr[l-i-1] = temp;

        }
        for(int element: arr){
            System.out.println(element + "");
        }
        }
    }

