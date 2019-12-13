package softmobile.storemanagement.activity;

import android.view.View;
import android.widget.EditText;

import softmobile.storemanagement.R;

public class LoginActivity extends BaseActivity
{
    private EditText userName;
    private EditText userPassword;

    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void setViews()
    {
        userName = (EditText) findViewById(R.id.userText);
        userPassword = (EditText) findViewById(R.id.passwordText);
    }

    public void login(View view)
    {
        setViews();
        if(validateLogin(userName.getText().toString(), userPassword.getText().toString()))
        {
            goToActivity(this, MainDashboardActivity.class);
        }
        else
        {
            showMessage(this, "Usuario y/o contraseña incorrectos");
        }
    }

    private boolean validateLogin(String userName, String password)
    {
        return (userName.equals("usuario") && password.equals("1234"));
    }
}