/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 工具_1 {

    private static Scanner sc = new Scanner(System.in);

    public static int 輸入成績(String 訊息) {
        System.out.println(訊息);
        int x;
        x = sc.nextInt();
        return x;

    }

    public static int 加總(int x, int y) {
        int sum;
        sum = x + y;
        return sum;

    }

    public static double 平均(int x, int y) {

        double 平均a = (x + y) / 2.0;

        return 平均a;

    }

}
