/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;

/**
 *
 * @author user
 */
public class 猜數字 {

    public static int 答案;
    public static int 你猜;

    public static void 設定答案() {
        答案 = (int) (Math.random() * 3);

    }

    public static void 隨機猜() {
        你猜 = (int) (Math.random() * 3);

    }

    public static void 比對() {
        if (答案 == 你猜) {
            System.out.println("你答對了");
        }
        //} else {
        if (答案 != 你猜) {
            System.out.println("你答錯了");
        }
    }
     public static void 顯示() {
        System.out.println("答案是: " + 答案);

        System.out.println("你猜 :" + 你猜);

    }

    public static void 跑流程() {
        設定答案();
        隨機猜();
        顯示();
        比對();
        
    }
}
