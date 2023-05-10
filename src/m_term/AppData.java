package m_term;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class AppData {

    private 班級 c;
    private final String filename;

    public AppData(){
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
        this.c = (班級) ois.readObject();
        ois.close();
        fis.close();
    }

    public void set班級(班級 c){
        this.c = c;
    }

    public 班級 get班級(){
        return c;
    }


}

