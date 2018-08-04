import java.util.Scanner;
import java.util.stream.*;
import java.util.Arrays;
public class MatrixMult{
   public static String next(Scanner in){
     return in.nextLine();
   }
    public static int sumUp(int numlist[], int[] inlist){
        int[]out = new int[inlist.length];
        for(int i = 0; i < numlist.length; i++){
            out[i] =  numlist[i] *  inlist[i];
        }
        int bl = IntStream.of(out).sum();
        return bl;
    }
    public static int[][] MatrixConstructor( int[][]A, int[][]B  ){
       int[][] matrix = new int[A.length][B[0].length];
				try{
        //int[][] matrix = new int[A.length][B[0].length];
        int[][] B2nd = new int[B[0].length][B.length];
				if(A[0].length != B.length){
						System.out.println("Invalid input.");
						System.exit(0);
				}
       for(int i = 0; i < B[0].length; i ++){  //int[] aline = new int[B.length];
            for(int k = 0; k < B.length; k ++){
               B2nd[i][k] = B[k][i];}
        }
      for(int z = 0; z < matrix.length; z ++){
        for(int zz = 0; zz< matrix[0].length; zz ++){

            matrix[z][zz] = sumUp(A[z], B2nd[zz]);
          }
      }
        return matrix;
    }
    catch(Exception e){
        System.out.println("Invalid input.");
        System.exit(0);
    }
    return matrix;
    }
    public static int[][] InputMatrixConstructor(int a,int b, Scanner input){
        int[][] out = new int[a][b];
				try{
        //int[][] out = new int[a][b];
       for(int i = 0; i < a; i ++){
            String[] inter = next(input).split(" ");
            
    for(int k = 0; k < b; k ++){
    out[i][k] = Integer.parseInt(inter[k]);  
                }
            }
        return out;
			}
    catch(Exception e){
        System.out.println("Invalid input.");
        
        System.exit(0);
       }
       return out;
    }
  
    public static void main(String[] args){
     
        Scanner input = new Scanner(System.in);
        String[] temp = next(input).split(" ");
        int[] temArr = new int[temp.length];
        for(int i = 0; i < temp.length; i ++){
            temArr[i] = Integer.parseInt(temp[i]);   
        }
        if(temArr[0] != temArr[3] & temp.length > 4){
            System.out.println();
            System.out.println("Invalid input");
            System.exit(0);
        }
       //Transforming the imput matrixies into 2d integer arrays
        int[][] mA = InputMatrixConstructor(temArr[1], temArr[0],input);
        int[][] mB = InputMatrixConstructor(temArr[3], temArr[2],input);
       if(mA.length == 0 & mB.length == 0){
					 System.out.println("0");
					System.exit(0);
			 }
     System.out.println();
        System.out.println("Result: "); 
    System.out.println();
    for(int o = 0; o < MatrixConstructor(mA,mB).length; o++){
      System.out.println(Arrays.toString(MatrixConstructor(mA,mB)[o]));
        }
 System.out.print("\n");  
        }
    
    }
