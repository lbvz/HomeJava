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
public class learn_6 {
    public static double 攝氏;
    public static double 華氏;
   
    
    public static void 初值(){
        System.out.println("---初值---");  
        攝氏 = 37.0;
        華氏 = 攝氏 * 9.0 / 5.0 + 32.0;
        
  }
    public static void 顯示(){
        System.out.println("---顯示---");
        System.out.println("攝氏 :" + 攝氏);
        System.out.println("華氏 :" + 華氏);
        
   
    }
}
