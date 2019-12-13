package softmobile.storemanagement.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public abstract class BaseActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setLayout();
        setViews();
    }

    public abstract void setLayout();

    public abstract void setViews();

    public void goToActivity(Context packageContext, Class<?> cls)
    {
        startActivity(new Intent(packageContext, cls));
    }

    public void showMessage(Context context, String message)
    {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}