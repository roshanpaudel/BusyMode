package com.example.android.busymode;

/**
 * Created by paudelroshan93 on 12/31/2016.
 */
public class Information {
    int id;
    int selected = 0;
    String messageSub;
    String messageDes;

    public Information(){

    }

    public Information(int id,int selected, String messageSub, String messageDes){
        this.id=id;
        this.selected=selected;
        this.messageSub=messageSub;
        this.messageDes=messageDes;
    }

    public Information(String messageSub, String messageDes){
        this.messageSub=messageSub;
        this.messageDes=messageDes;
    }

    public Information(int selected){
        this.selected=selected;
    }


    public int getSelected(){
        return this.selected;
    }

    public void setSelected(int selected){
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
