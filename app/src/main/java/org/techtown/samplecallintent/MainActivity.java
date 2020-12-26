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
                String data =  editText.getText().toString();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse(data));
                startActivity(intent); //다시 이렇게 하니까 되었다.
                //확실하지는 않지만, 와이파이에서는 잘 안됬고, 랜선에서 잘된거 보니,
                //이 차이로 인한 영향일 수도 있다는 유추를 해볼 수 있다.
                //이 원인을 알기에 내 역량은 아직 부족하므로, 더 성장하고 와서 다시 살펴보겠다.
            }
        });
    }
}