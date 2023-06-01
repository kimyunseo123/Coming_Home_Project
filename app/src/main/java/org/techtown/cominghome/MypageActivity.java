package org.techtown.cominghome;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;

public class MypageActivity extends AppCompatActivity {

    private static final String TAG = "MypageActivity";
    private FirebaseAuth mAuth;
    private FirebaseAuth mFirebaseAuth;
    private TextView tv_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        mFirebaseAuth = FirebaseAuth.getInstance();

        Intent intent = getIntent();
        String nickName = intent.getStringExtra("nickName");

        tv_result = findViewById(R.id.tv_result);
        tv_result.setText("Nickname: " + nickName);

        Button btn_logout = findViewById(R.id.btn_logout);
        btn_logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                mFirebaseAuth.signOut();

                Intent intent = new Intent(MypageActivity.this, AnimalActivity.class);
                startActivity(intent);
                finish(); // 앱끄기
            }
        });

        //탈퇴 처리
        //mFirebaseAuth.getCurrentUser().delete();
    }
}