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
public class EX_03 {
    public static double cm;
    public static double kg;
    public static double m;
    public static double bmi;
  public static void 初始值(){
      System.out.println("===========================");
      System.out.println("---初始值---");
      
      cm = 170.0;
      kg = 70.5;
      m = cm / 100.0;
      bmi = kg / (m * m);
     
      
  }
  public static void 顯示資料(){
      System.out.println("===========================");
      System.out.println("---顯示資料---");  
      System.out.println("cm: "+cm);
      System.out.println("kg: "+kg);
      System.out.println("m: "+m);
      System.out.println("bmi :"+bmi);
      
  }
    public static void 評重(){
        System.out.println("---評重---");  
        if (kg >= 90.0){System.out.println("kg >= 90.0 很重");}
        else if(kg >= 70.0){System.out.println("kg >= 70.0 健康");}
        else if(kg >= 50.0){System.out.println("kg >= 50.0 有點輕");}
        else if(kg >= 30.0){System.out.println("kg >= 30.0 很輕");}
        
    }
    public static void BMI檢測(){
        System.out.println("=======================");
        System.out.println("---BMI檢測---"); 
        if(bmi <= 30){System.out.println("bmi <= 30 健康");}
        else if(bmi <= 20){System.out.println("bmi <= 20 可");}
        else {System.out.println("小心");}
        
    }}
    
        
    
    
       