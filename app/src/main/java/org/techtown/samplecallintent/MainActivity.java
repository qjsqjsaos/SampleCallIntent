package org.techtown.samplecallintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);//뷰 객체 참조하기

        editText = findViewById(R.id.editText);

        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String data = editText.getText().toString(); //입력상자에 입력된 전화번호 확인, 겟텍스트로 문자형식으로 가져오기(전화번호를)

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("\""+ data +"\"")); //해결 완료
                //Uri.parse 값에 데이터 값이 들어간다. 이것은 전화걸기 화면을 보여줄 인텐트 객체이다.
                startActivity(intent); //액티비티 띄우기
            }
        });
    }
}