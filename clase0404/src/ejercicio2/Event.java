package ejercicio2;

import java.util.Date;

/**
 * Created by iv on 04/04/17.
 */
public class Event {

    private Date date;
    private String event;

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public String getEvent(){
        return event;
    }

    public void setEvent(String event){
        this.event = event;
    }
}
