package m1_term;

import java.io.Serializable;

public class 客戶 implements Serializable {
    public String name;
    public int 一般帳戶;
    public int 基金帳戶;

    public String getName(){
        return name;
    }

    public int get一般帳戶() {
        return 一般帳戶;
    }
    public int get基金帳戶(){
        return 基金帳戶;
    }
    @Override
    public String toString(){
        return "name=" + name + ", 一般帳戶=" + 一般帳戶 + ", 基金帳戶=" +基金帳戶;
    }
}
