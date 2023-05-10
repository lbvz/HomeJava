package m_term;

public class Test讀檔 {

    public static void main(String[] args) {
        班級 c1;
        AppData appData;
        appData =new AppData();
        try {
            appData.讀檔();
            System.out.println("讀檔成功");
            c1 = appData.get班級();
            c1.顯示資料();
        }
        catch (Exception e){
            System.out.println("讀檔失敗");
            System.out.println(e.toString());
        }
    }
}
