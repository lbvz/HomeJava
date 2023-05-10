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
public class learn_3 {
    public static String 名字;
    public static int 英文成績;
    public static int 數學成績;
    
public static void 初值(){
    System.out.println("---初值---");
    名字 = "文";
    英文成績 = 0;
    數學成績 = 1;
}
public static void 顯示(){
    System.out.println("---顯示---");
    System.out.println(名字);
    System.out.println(英文成績);
    System.out.println(數學成績);
    
  }
    
public static void 修改(){
    System.out.println("---修改---");
    名字 = "Tom";
    英文成績 = 100;
    數學成績 = 99;
    
}
}
