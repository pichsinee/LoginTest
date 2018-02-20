package sdu.cs58.pichsinee.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //1. Explicit ประกาศตัวแปรบน JAVA
    TextView nameTextView;
    String getNameString;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //2. Initial view ผูกตัวแปรบน Java กับอิลิเม้นท์บน UI
        nameTextView = findViewById(R.id.txvName);

        //รับค่า nameString จากหน้า Login
        getNameString = getIntent().getStringExtra("nameString");
        nameTextView.setText("ยินดีต้อนรับ " + getNameString + "  เข้าสู่ระบบ");

    }   //end onCreate

} //end Class
