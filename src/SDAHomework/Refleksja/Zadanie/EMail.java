package SDAHomework.Refleksja.Zadanie;

import java.util.Date;

public class EMail extends Document {

    private String[] to;
    private String subject;

    public EMail(String[] to,
                 String subject,
                 Date date){
        super(date);
        this.to = to;
        this.subject = subject;
    }

    public String[] getTo() {
        return to;
    }

    public void setTo(String[] to) {
        this.to = to;
    }
}
