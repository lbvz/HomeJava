package m1_term;



public class Test1_讀檔 {

    public static void main(String[] args) {
        銀行 c1;
        AppData_1 appData;
        appData =new AppData_1();
        try {
            appData.讀檔();
            System.out.println("讀檔成功");
            c1 = appData.get銀行();
            c1.顯示資料();
        }
        catch (Exception e){
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
        }
    }
}