/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learn;
import java.util.Scanner;
/*
 *
 * @author user
 */
public class 學生_1 {
    private static Scanner sc = new Scanner(System.in,"Big5");
    
    public static String 名字;
    public static int 英文;
    public static int 數學;
    
    public static String 輸入姓名(String 訊息){
    System.out.println(訊息);
    String x;
    x = sc.next();
    return x;
    }
}
