/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package 計算;



/**
 *
 * @author user
 */
public class EX_04 {
    public static double r;
    public static int 英文成績;
    public static double y;
    public static int 數學成績;
    
   
    public static void 初值(){
        r = Math.random();
        y= Math.random();
    
        System.out.println("===========================");
        
   }
   public static void 顯示英文結果(){
       System.out.println("---顯示結果---");
       System.out.println("英文亂數: "+r);   
   }
   public static void 顯示數學結果(){
       //System.out.println("---顯示結果---");
       System.out.println("數學亂數: "+y);   
   }
   public static void 產生英文成績(){
       
       英文成績 = (int)(r * 101);
      }
   public static void 顯示英文成績(){
       System.out.println("---顯示英文成績---");
       System.out.println("英文成績: " + 英文成績);
     }  
   
    public static void 英文評語(){
       if(英文成績 >= 90) {System.out.println("英文成績 >= 90 : 超棒");}
          else if(英文成績 >= 80) {System.out.println("英文成績 >= 80 : 很棒");}
          else if(英文成績 >= 70) {System.out.println("英文成績 >= 70 : 棒");}
          else {System.out.println("英文成績 <= 70 : 待加強");}
      
      
    }
       public static void 產生數學成績(){
       
       數學成績 = (int)(y * 101);
      }
   public static void 顯示數學成績(){
       System.out.println("---顯示數學成績---");
       System.out.println("數學成績: " + 數學成績);
     }  
   
    public static void 數學評語(){
       if(數學成績 >= 90) {System.out.println("數學成績 >= 90 : 超棒");}
          else if(數學成績 >= 80) {System.out.println("數學成績 >= 80 : 很棒");}
          else if(數學成績 >= 70) {System.out.println("數學成績 >= 70 : 棒");}
          else {System.out.println("數學成績 <= 70 : 待加強");}
      
      
    }
    public static void 跑流程(){
       System.out.println("---跑流程---");
    
    初值(); 顯示英文結果();顯示數學結果();產生英文成績();顯示英文成績();英文評語();
    產生數學成績();顯示數學成績();數學評語();
    
}   }
            
    

