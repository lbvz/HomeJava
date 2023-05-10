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
public class 工具測試_1 {
    private static int eng;
    private static int math;
    
    
    public static void main(String[] args) {
        測試輸入();
        測試加總();
    }
   public static void 測試輸入(){
       //int eng;
       eng = 工具_1.輸入成績("請輸入英文成績: ");
       
       System.out.println("英文成績: " + eng);
       //int math;
       math = 工具_1.輸入成績("請輸入數學成績: ");
       System.out.println("數學成績: " +math);
       
   }
   public static void 測試加總(){
       int 結果;
      結果 = 工具_1.加總(eng,math);
       System.out.println("總分: " + 結果);
      if (結果 == eng+math){
          System.out.println("測試加總-->成功");
      }
      else {
          System.out.println("測試加總-->失敗");
      }      
      
   }
}
