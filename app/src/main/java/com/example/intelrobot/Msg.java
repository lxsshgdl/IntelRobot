package com.example.intelrobot;

public class Msg {
    public static final int TYPE_RECEIVED = 0;//收到消息
    public static final int TYPE_SENT = 1;//发出消息
    private String content;//消息内容
    private int type;//消息类型

    public Msg(String content, int type) {
        this.content = content;
        this.type = type;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}
