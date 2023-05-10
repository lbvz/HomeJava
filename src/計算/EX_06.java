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
public class EX_06 {
    public static int 開戶金額;
    public static double a;
    public static int 異動金額;
    public static int 餘額;
    public static int 總額 = 異動金額 + 餘額;
    
     public static void 初值(){
      
         餘額= 5000+異動金額;
         a= Math.random();
         餘額= 5000+異動金額;
        
        System.out.println("===============================");
        System.out.println("帳戶名稱 : 王小明"); 
        System.out.println("帳戶餘額 : " + 餘額 + "元");
     }
    public static void 產生存款亂數(){
        異動金額 = (int) (a * 10001);}
    
    public static void 顯示存款亂數(){
        System.out.println("顯示存款亂數 :" + 異動金額);  
        }
    
     public static void 顯示存款金額(){
       System.out.println("---顯示存款金額---");
       System.out.println("存款金額: " + 異動金額 +"元");
     }
     
      public static void 總額(){
        總額 =  異動金額 + 餘額;
        System.out.println("總額 :" + 總額 +"元");
     }
      public static void 跑程_1_1(){
        System.out.println("---跑程---"); 
        初值();產生存款亂數();顯示存款亂數(); 顯示存款金額();
        總額();
    }
     public static void 顯示提款亂數(){
        System.out.println("顯示提款亂數 :" + 異動金額);  
         }
     public static void 顯示提款金額(){
       System.out.println("---顯示提款金額---");
       System.out.println("提款金額: " + 異動金額 +"元");
     }
     public static void 提款後餘額(){
         餘額 = 總額 - 異動金額;
      if (異動金額 < 總額){System.out.println("提款成功 餘額: "+ 餘額 +"元");
      }
      else {System.out.println("提款失敗");}
         
         
     }
     public static void 跑程_1_2(){
        System.out.println("---跑程---"); 
        初值();產生存款亂數();顯示提款亂數(); 顯示提款金額();
        提款後餘額();}
     
      public static void 跑程_1_3(){
        System.out.println("---跑程迴路---"); 
        
        
       }
      
}
