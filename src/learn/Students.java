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
public class Students {
    public String 名字;
    public int 英文成績;
    public int 數學成績;
    
   public void show(){
       System.out.println("名字 : " + this.名字);
       System.out.println("英文成績 : "  + this.英文成績);
       System.out.println("數學成績 : " + this.數學成績);
       System.out.println("總分 : " + 工具_1.加總(this.英文成績,this.數學成績));
       System.out.println("平均 : " + 工具_1.平均(this.英文成績,this.數學成績));
       System.out.println("=========================================");
       
   }
            
            
    
}
