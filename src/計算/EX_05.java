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
public class EX_05 {
    public static double a;
    public static int 存款;
    public static double b;
    public static int 提款;
    public static int 餘額;
    public static int 總額;
  public static void 初值(){
      
        餘額 = 5000;
        a= Math.random();
        b= Math.random();  
        System.out.println("===============================");
        System.out.println("帳戶名稱 : 王小明"); 
        System.out.println("帳戶餘額 : " + 餘額 + "元");
        
  }
  public static void 產生存款亂數(){
        存款 = (int) (a * 1001);
        
          }
    public static void 顯示存款亂數(){
        System.out.println("顯示存款亂數 :" + 存款);  
        
    }
     
    

        
     public static void 顯示存款金額(){
       System.out.println("---顯示存款金額---");
       System.out.println("存款金額: " + 存款 +"元");
     }
     
     public static void 總額(){
        總額 =  存款 + 餘額;
        System.out.println("總額 :" + 總額 +"元");
     }
     
         
     

    public static void 跑程_1(){
        System.out.println("---跑程---"); 
        初值();產生存款亂數();顯示存款亂數(); 顯示存款金額();
        總額();
    }

         public static void 產生提款亂數(){
        提款 = (int) (b * 1001);
     }
         public static void 顯示提款亂數(){
        System.out.println("顯示提款亂數 :" + 提款);  
         }
   


        
   
     
     public static void 顯示提款金額(){
       System.out.println("---顯示提款金額---");
       System.out.println("提款金額: " + 提款 +"元");
     }
     public static void 提款後餘額(){
         餘額 = 總額 - 提款;
      if (提款 < 總額){System.out.println("提款成功 餘額: "+ 餘額 +"元");
      }
      else {System.out.println("提款失敗");}
        
         
     }
public static void 跑程_2(){
        System.out.println("---跑程---"); 
        System.out.println("=========================");
        產生提款亂數();顯示提款亂數();顯示提款金額(); 提款後餘額();
        
    }
}
     
      
     

    


