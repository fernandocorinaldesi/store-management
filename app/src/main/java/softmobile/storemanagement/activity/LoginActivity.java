package softmobile.storemanagement.activity;

import android.text.method.HideReturnsTransformationMethod;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;

import softmobile.storemanagement.R;

public class LoginActivity extends BaseActivity
{
    private EditText userName;
    private EditText userPassword;
    private CheckBox showPassword;

    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_login);
    }

    @Override
    public void setViews()
    {
        userName = (EditText) findViewById(R.id.userText);
        userPassword = (EditText) findViewById(R.id.passText);
        showPassword = (CheckBox) findViewById(R.id.checkBox);
        showPassword.setOnCheckedChangeListener(new LoginOnCheckedChangeListener());
    }

    public void login(View view)
    {
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

    private class LoginOnCheckedChangeListener implements CompoundButton.OnCheckedChangeListener
    {
        @Override
        public void onCheckedChanged(CompoundButton buttonView, boolean isChecked)
        {
            if (!isChecked)
            {
                userPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
            else
            {
                userPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
            }
        }
    }
}