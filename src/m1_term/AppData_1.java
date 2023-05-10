package m1_term;



import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppData_1 {

    private 銀行 c;
    private final String filename;

    public AppData_1(){
        filename = "app.data";
    }

    public void 存檔() throws Exception{
        FileOutputStream fos = new FileOutputStream(filename);
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(this.c);
        oos.close();
        fos.close();
    }

    public void 讀檔() throws Exception{
        FileInputStream fis = new FileInputStream(filename);
        ObjectInputStream ois = new ObjectInputStream(fis);
        this.c = (銀行) ois.readObject();
        ois.close();
        fis.close();
    }

    public void set銀行(銀行 c){
        this.c = c;
    }

    public 銀行 get銀行(){
        return c;
    }


}
