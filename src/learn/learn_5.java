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
public class learn_5 {
  public static String 名字;
  public static double 國文成績;
  public static double 英文成績;
  public static double 總分;
  public static double 平均;
  
 public static void 定初值(){
     System.out.println("---定初值---");
     名字 = "文";
     國文成績 = 99.6;
     英文成績 = 99.4;
     總分 = 國文成績 + 英文成績;
     平均 = 總分 / 2;        
 }
   public static void 顯示(){
       System.out.println("名字: " + 名字);
       System.out.println("國文成績: " + 國文成績 + " 分");
       System.out.println("英文成績: " + 英文成績 + " 分");   
       System.out.println("總分: " + 總分 + " 分");
       System.out.println("平均: " + 平均 + " 分");
   }
           
    
}
