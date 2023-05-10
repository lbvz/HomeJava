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
public class EX_02 {
     public static String 名字;
     public static int 國文成績;
     public static int 英文成績;
     public static int 總分; 
     public static double 平均;
     
    
    public static void 顯示(){
            名字 ="文文";
            國文成績 = 51;
            英文成績 = 79;
             總分 = 國文成績 + 英文成績;
             平均 = 總分/2.0;
             
             System.out.println("名字:"+名字);
             
             System.out.println("國文成績:"+國文成績);
            
             System.out.println("英文成績:"+英文成績);
             
             System.out.println("總分:"+總分);
            
             System.out.println("平均:"+平均);
          if(平均 >= 90) {System.out.println("超棒");}
          else if(平均 >= 80) {System.out.println("很棒");}
          else if(平均 >= 70) {System.out.println("棒");}
          else {System.out.println("待加強");}
          
       }        
                        
                  
          
             
             
             
           
                
            
            

    }       
    
    

