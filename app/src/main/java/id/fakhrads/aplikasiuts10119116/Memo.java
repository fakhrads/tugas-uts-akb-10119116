// Nama : Fakhri Adi Saputra
// NIM : 10119116
// Kelas : IF-3
package id.fakhrads.aplikasiuts10119116;

import androidx.annotation.NonNull;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Memo implements Serializable {
    private Date date;
    private String text, category, title;
    private boolean fullDisplayed;
    private static DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyy 'at' hh:mm aaa");

    public Memo(){
        this.date = new Date();
    }
    public Memo(long time, String text, String category, String title){
        this.date = new Date(time);
        this.text = text;
        this.category = category;
        this.title = title;
    }
    public String getDate(){
        return dateFormat.format(date);
    }
    public long getTime(){
        return date.getTime();
    }
    public void setTime(long time){
        this.date = new Date(time);
    }
    public void setText(String text){
        this.text = text;
    }
    public String getText(){
        return this.text;
    }
    public String getTtitle(){
        return this.title;
    }
    public String getCategory(){
        return this.category;
    }
    public String getShortText(){
        String temp = text.replaceAll("/n", " ");
        if (temp.length() > 25){
            return temp.substring(0, 25) + "...";
        }else{
            return temp;
        }
    }
    public void setFullDisplayed(boolean fullDisplayed){
        this.fullDisplayed = fullDisplayed;
    }

    public boolean isFullDisplayed() {
        return this.fullDisplayed;
    }

    @NonNull
    @Override
    public String toString() {
        return this.text;
    }

}
