package cn.lexu.smstest;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import cn.lexu.smstest.db.DaoMaster;
import cn.lexu.smstest.db.DaoSession;

/**
 * @author Lexu
 * @date 2018/7/9
 */
public class App extends Application {
    private DaoSession mDaoSession;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        setDataBase();
    }

    private void setDataBase() {
//        DaoMaster.DevOpenHelper mHelper = new DaoMaster.DevOpenHelper(this, "person", null);
        MySQLiteOpenHelper mHelper = new MySQLiteOpenHelper(this, "person", null);
        SQLiteDatabase db = mHelper.getWritableDatabase();
        // 注意：该数据库连接属于 DaoMaster，所以多个 Session 指的是相同的数据库连接。
        DaoMaster mDaoMaster = new DaoMaster(db);
        mDaoSession = mDaoMaster.newSession();
    }

    public DaoSession getDaoSession() {
        return mDaoSession;
    }
    public static App getInstance() {
        return instance;
    }
    public static App instance;
}
