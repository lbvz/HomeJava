package m1_term;



public class 讀檔 {

    public static void main(String[] args) {
        銀行 c1;
        AppData appData;
        appData =new AppData();
        try {
            appData.讀檔();
            System.out.println("----------- 讀檔成功 -----------");
            c1 = appData.get銀行();
            c1.顯示資料();
        }
        catch (Exception e){
            System.out.println("----------- 讀檔失敗 ------------");
            System.out.println(e.toString());
        }
    }
}