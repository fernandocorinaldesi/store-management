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
        setCheckBox();
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
    public void setCheckBox(){
        EditText mEtPwd;
        CheckBox mCbShowPwd;
        userPassword = (EditText) findViewById(R.id.passText);
        mCbShowPwd = (CheckBox) findViewById(R.id.checkBox);

        mCbShowPwd.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                // checkbox status is changed from uncheck to checked.
                if (!isChecked) {
                    // show password
                    userPassword.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    // hide password
                    userPassword.setTransformationMethod(HideReturnsTransformationMethod.getInstance());
                }
            }
        });

    }

}