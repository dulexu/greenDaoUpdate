package cn.lexu.smstest;

import com.hdkj.media.sms.SmsUtils;

/**
 * @author Lexu
 * @date 2018/7/5
 */
public class Test {
    public static void main(String[] a){
        String result = SmsUtils.getInstance().sendSms("18503213415","12300000");
        System.out.println("result : "+result);
    }


}
