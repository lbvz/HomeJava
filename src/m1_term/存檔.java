package m1_term;




public class 存檔 {
    public static void main(String[] args) {
        客戶 x1;
        客戶 x2;
        客戶 x3;
        客戶 x4;
        銀行 c1;

        x1 = new 客戶();
        x1.name = "劉德華";
        x1.一般帳戶 = 99999999;
        x1.基金帳戶 = 88888888;

        x2 = new 客戶();
        x2.name = "梁朝偉";
        x2.一般帳戶 = 77777777;
        x2.基金帳戶 = 66666666;

        x3 = new 客戶();
        x3.name = "洪金寶";
        x3.一般帳戶 = 55555555;
        x3.基金帳戶 = 44444444;

        x4 = new 客戶();
        x4.name = "周星馳";
        x4.一般帳戶 = 33333333;
        x4.基金帳戶 = 22222222;

        c1 = new 銀行();
        c1.名稱 = "劉博文銀行";
        c1.加入客戶(x1);
        c1.加入客戶(x2);
        c1.加入客戶(x3);
        c1.加入客戶(x4);
        c1.顯示資料();

        AppData appData;
        appData = new AppData();
        appData.set銀行(c1);

        try {
            appData.存檔();
            System.out.println("========== 存檔成功 ===========");
        }
        catch (Exception e){
            System.out.println("=========== 存檔失敗 ==========");
            System.out.println(e.toString());
        }
    }
}
