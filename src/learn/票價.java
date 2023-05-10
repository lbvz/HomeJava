/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 電影票價;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class 票價 {

    private static Scanner sc = new Scanner(System.in);
    public static int 全票;
    public static int 優票;
    public static int 兒票;
    public static int 早票;
    public static int 愛票;
    public static int 全票總價;
    public static int 優票總價;
    public static int 兒票總價;
    public static int 早票總價;
    public static int 愛票總價;
    public static int 總價;

    public static void 設定初始票價() {

        全票 = 310;//x
        優票 = 290;//y
        兒票 = 260;//z
        早票 = 280;//a
        愛票 = 155;//b
    }

    public static int 全票購票數量() {
        System.out.println("全票購票數量");
        int x;
        x = sc.nextInt();
        return x;
    }

    public static int 優票購票數量() {
        System.out.println("優票購票數量");
        int y;
        y = sc.nextInt();
        return y;
    }

    public static int 兒票購票數量() {
        System.out.println("兒票購票數量");
        int z;
        z = sc.nextInt();
        return z;
    }

    public static int 早票購票數量() {
        System.out.println("早票購票數量");
        int a;
        a = sc.nextInt();
        return a;
    }

    public static int 愛票購票數量() {
        System.out.println("愛票購票數量");
        int b;
        b = sc.nextInt();
        return b;
    }

    public static void 票價計算() {
        System.out.println("票價計算");
        全票總價 = 310 * 全票購票數量();
        優票總價 = 290 * 優票購票數量();
        兒票總價 = 260 * 兒票購票數量();
        早票總價 = 280 * 早票購票數量();
        愛票總價 = 155 * 愛票購票數量();
        總價 = (全票總價 + 優票總價 + 兒票總價 + 早票總價 + 愛票總價);
        System.out.println("票價:" + 總價);

    }

}
