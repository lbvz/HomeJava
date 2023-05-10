package m1_term;




public class Test1_存檔 {
    public static void main(String[] args) {
        客戶 x1;
        客戶 x2;
        銀行 c1;

        x1 = new 客戶();
        x1.name = "博文1";
        x1.一般帳戶 = 10000;
        x1.基金帳戶 = 99999;

        x2 = new 客戶();
        x2.name = "博文2";
        x2.一般帳戶 = 90000;
        x2.基金帳戶 = 88888;

        c1 = new 銀行();
        c1.名稱 = "博文銀行";
        c1.加入客戶(x1);
        c1.加入客戶(x2);
        c1.顯示資料();

        AppData_1 appData;
        appData = new AppData_1();
        appData.set銀行(c1);

        try {
            appData.存檔();
            System.out.println("存檔成功");
        }
        catch (Exception e){
            System.out.println("存檔失敗");
            System.out.println(e.toString());
        }
    }
}
