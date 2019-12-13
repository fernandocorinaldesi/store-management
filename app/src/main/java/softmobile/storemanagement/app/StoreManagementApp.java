package softmobile.storemanagement.app;

import android.app.Application;
import android.content.Intent;

import softmobile.storemanagement.activity.LoginActivity;

public class StoreManagementApp extends Application
{
    @Override
    public void onCreate()
    {
        super.onCreate();
        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
    }
}