package cn.lexu.smstest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //        String result = SmsUtils.getInstance().sendSms("18503213415","main");
        //        System.out.println("result : "+result);

        Person p = new Person();
        p.setName("beeeeeob");
        p.setAge(21);
        p.setSex("asdasdasdasd");
        App.getInstance().getDaoSession().getPersonDao().insert(p);

    }
}
