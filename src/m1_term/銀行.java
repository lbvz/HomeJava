package m1_term;



import java.io.Serializable;
import java.util.ArrayList;

public class 銀行 implements Serializable {
    public String 名稱;
    public ArrayList<客戶> 客戶們;

    public 銀行(){
        this.客戶們 = new ArrayList();
        System.out.println("--------- 銀行建構完成 ---------");
    }

    public void 加入客戶(客戶 x){
        this.客戶們.add(x);
        System.out.println("加入客戶 " +  x.name);
    }

    public void 顯示資料(){
        System.out.println("========== " + this.名稱 + " ==========");
        for (客戶 x :客戶們){
            System.out.println(x.toString());
        }
    }
}
