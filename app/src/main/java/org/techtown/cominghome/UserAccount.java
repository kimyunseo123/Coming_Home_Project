package org.techtown.cominghome;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class UserAccount extends AppCompatActivity {


    private String idToken;
    private String emailId;
    private String password;

    public UserAccount(){}
    public String getIdToken(){return idToken;}
    public void setIdToken(String idToken){this.idToken=idToken;}

    public String getEmailId(){return emailId;}
    public void setEmailId(String emailId){this.emailId=emailId;}
    public String getPassword(){return password;}
    public void setPassword(String password){this.password=password;}


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_account);
    }
}