package saeedi;
import java.util.Scanner;
import java.util.Arrays;         //مرتب سازی
import java.text.DecimalFormat;  //ممیز گذاری
    public class Main{
        public static void main  (String[] args) {
            Scanner input = new Scanner (System.in);
            int [][] one =new int[3][4];
            for (int i=0;i<3;i++)
                 {
                 for (int j=0;j<4;j++)
                       {
                       System.out.printf("one[%d][%d]",i,j);                  one[i][j]= input.nextInt();
                       }
                 }
            int [][] two =new int[3][4];
            for (int i=0;i<3;i++)
                {
                for (int j=0;j<4;j++)
                   {
                    System.out.printf("tow[%d][%d]",i,j);                     two[i][j]= input.nextInt();
                   }
                }
            int [][]three=new int[3][4];
            for(int i=0;i<3;i++)
                {
                for (int j=0; j<4; j++)
                    {
                    three[i][j] = one[i][j] + two[i][j];
                    }
                }
            System.out.println();                           System.out.println("one==>"+"one[3][4]");
            for (int i=0 ; i<3 ; i++)
            {
                for ( int j=0 ; j<4 ; j++)
                {
                    System.out.print(one[i][j]+" ");
                }
                System.out.println();
            }System.out.println();                           System.out.println("two==>"+"two[3][4]");
            for (int i=0 ; i<3 ; i++)
            {
                for ( int j=0 ; j<4 ; j++)
                {
                    System.out.print(two[i][j]+" ");
                }
                System.out.println();
            }System.out.println();                  System.out.println( "one[i][j] + two[i][j]");
            for(int i=0;i<3;i++)
               {
               for(int j=0;j<4;j++)
                   {
                   System.out.print(three[i][j]+" ");
                   }
                System.out.println();
               }



        }
    }



