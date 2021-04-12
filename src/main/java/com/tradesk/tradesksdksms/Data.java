/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.tradesk.tradesksdksms;

/**
 *
 * @author wilzkipkoech
 */
public class Data {

    private String message;
    private String app_key;
    private String app_secret;
    private String receipients[];

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApp_key() {
        return app_key;
    }

    public void setApp_key(String app_key) {
        this.app_key = app_key;
    }

    public String getApp_secret() {
        return app_secret;
    }

    public void setApp_secret(String app_secret) {
        this.app_secret = app_secret;
    }

    public String[] getReceipients() {
        return receipients;
    }

    public void setReceipients(String[] receipients) {
        this.receipients = receipients;
    }
}
