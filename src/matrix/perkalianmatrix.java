/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matrix;

/**
 *
 * @author User
 */
public class perkalianmatrix {
     public static void main (String[] args){
        int[][] A = {
            {1, 3, 5},
            {2, 4, 6}
        };
        int [][] B = {
            {2, 2},
            {4, 4},
            {5, 5}
        };
        if (A[0].length == B.length) {
            //int [][] C = new int [2][2]
            int[][] C = new int[A.length] [B[0].length];
            for(int i=0; i<A.length; i++) { //i=0; i<
                for(int j=0; j<B[0].length; j++) {
                    for(int k=0; k<A[0].length; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }
            for (int[] c: C) {
                for(int i: c) {
                    System.out.print(i+" ");
                }
                System.out.println();
            }
        }
        else {
            System.out.println("ukursn kolom A tidak sama dengan baris B");
                }
            }
            
        }
    
