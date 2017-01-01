package com.example.android.busymode;

/**
 * Created by paudelroshan93 on 12/31/2016.
 */
public class Information {
    int id;
    Boolean editFlag = false;
    Boolean selected = false;
    String messageSub;
    String messageDes;

    public Information(){

    }

    public Information(int id, Boolean editFlag, Boolean selected, String messageSub, String messageDes){
        this.id=id;
        this.editFlag=editFlag;
        this.selected=selected;
        this.messageSub=messageSub;
        this.messageDes=messageDes;
    }

    public Information(String messageSub, String messageDes){
        this.messageSub=messageSub;
        this.messageDes=messageDes;
    }

    public Boolean getFlag(){
        return this.editFlag;
    }

    public void setFlag(Boolean editFlag){
        this.editFlag = editFlag ;
    }

    public Boolean getSelected(){
        return this.selected;
    }

    public void setSelected(Boolean editFlag){
        this.editFlag = selected ;
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
