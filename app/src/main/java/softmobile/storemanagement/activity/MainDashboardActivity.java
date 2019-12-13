package softmobile.storemanagement.activity;

import android.view.View;

import softmobile.storemanagement.R;

public class MainDashboardActivity extends BaseActivity
{
    @Override
    public void setLayout()
    {
        setContentView(R.layout.activity_main_dashboard);
    }

    @Override
    public void setViews() {}

    public void onClickButton(View view)
    {
        switch (view.getId())
        {
            case R.id.clothingByStoreButton: goToActivity(this, ClothingByStoreActivity.class);
            break;
            case  R.id.salesByStoreButton: goToActivity(this, LoginActivity.class);
            break;
        }
    }
}