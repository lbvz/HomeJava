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
  public class 學生測試 {
    public static String 姓名;
    public static int 英文;
    public static int 數學;
  
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //姓名 = 學生_1.輸入姓名("請輸入姓名: ");
        //System.out.println("姓名: " + 姓名);
        姓名 = 學生_1.輸入姓名("請輸入姓名 :");
        
        英文 = 工具_1.輸入成績("請輸入英文成績: ");
        數學 = 工具_1.輸入成績("請輸入數學成績: ");
        System.out.println("學生: "+ 姓名);
        System.out.println("英文成績: " + 英文);
        System.out.println("數學成績: " + 數學);
        System.out.println("總分: " + 工具_1.加總(英文, 數學));
        System.out.println("平均: " + 工具_1.平均(英文, 數學));
       
       
    }
    
}
