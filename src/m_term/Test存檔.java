package m_term;

public class Test存檔 {
    public static void main(String[] args) {
        學生 x1;
        學生 x2;
        班級 c1;

        x1 = new 學生();
        x1.name = "Tom";
        x1.eng = 100;
        x1.math = 99;

        x2 = new 學生();
        x2.name = "Amy";
        x2.eng = 90;
        x2.math = 95;

        c1 = new 班級();
        c1.名稱 = "android班";
        c1.加入學生(x1);
        c1.加入學生(x2);
        c1.顯示資料();

        AppData appData;
        appData = new AppData();
        appData.set班級(c1);

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
