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
public class learn_4 {
    public static double cm;
    public static double kg;
    public static double m;
    public static double bmi;
public static void 設初值(){
    System.out.println("---設初值---");
    cm = 170.5;
    kg = 70.5;
    m = cm / 100.0;
    bmi = kg / (m * m);
    
   }
        
public static void 顯示(){
    System.out.println("---顯示---");
    System.out.println("cm: " + cm + " cm");
    System.out.println("kg: " + kg + " kg");
    System.out.println("m: "+ m + " m");
    System.out.println("bmi: " + bmi + " bmi");
    
}
    
}
