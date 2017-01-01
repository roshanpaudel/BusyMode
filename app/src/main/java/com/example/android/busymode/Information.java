package com.example.android.busymode;

/**
 * Created by paudelroshan93 on 12/31/2016.
 */
public class Information {
    int id;
    Boolean selected = false;
    String messageSub;
    String messageDes;

    public Information(){

    }

    public Information(int id,Boolean selected, String messageSub, String messageDes){
        this.id=id;
        this.selected=selected;
        this.messageSub=messageSub;
        this.messageDes=messageDes;
    }

    public Information(String messageSub, String messageDes){
        this.messageSub=messageSub;
        this.messageDes=messageDes;
    }

    public Information(Boolean selected){
        this.selected=selected;
    }


    public Boolean getSelected(){
        return this.selected;
    }

    public void setSelected(Boolean editFlag){
        this.selected = selected ;
    }

    public int getID(){
        return this.id;
    }

    public void setID(int id){
        this.id=id;
    }

    public String getMessageSub(){
        return this.messageSub;
    }
    public void setMessageSub(String messageSub){
        this.messageSub = messageSub;
    }

    public String getMessageDes(){
       return this.messageDes;
    }
    public void setMessageDes(String messageDes){
        this.messageDes = messageDes;
    }


}
