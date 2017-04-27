package com.gardelito.gardelitoapp.view.admin;

import android.support.annotation.IdRes;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gardelito.gardelitoapp.R;
import com.gardelito.gardelitoapp.view.admin.fragment.MenuFragment;
import com.gardelito.gardelitoapp.view.admin.fragment.OrderFragment;
import com.gardelito.gardelitoapp.view.admin.fragment.RegisterFragment;
import com.gardelito.gardelitoapp.view.admin.fragment.ReportFragment;
import com.roughike.bottombar.BottomBar;
import com.roughike.bottombar.OnTabSelectListener;

public class ContainerAdminActivity extends AppCompatActivity {
    RegisterFragment registerFragment;
    MenuFragment menuFragment;
    OrderFragment orderFragment;
    ReportFragment reportFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_container_admin);

        BottomBar bottomBar = (BottomBar) findViewById(R.id.bottombar);
        bottomBar.setDefaultTab(R.id.register);

        bottomBar.setOnTabSelectListener(new OnTabSelectListener() {
            @Override
            public void onTabSelected(@IdRes int tabId) {
                switch (tabId) {
                    case R.id.register:
                        RegisterFragment registerFragment = new RegisterFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.admincontainer, registerFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                    case R.id.menu:
                        MenuFragment menuFragment = new MenuFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.admincontainer, menuFragment).
                                setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                    case R.id.order:
                        OrderFragment orderFragment = new OrderFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.admincontainer, orderFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                    case R.id.report:
                        ReportFragment reportFragment = new ReportFragment();
                        getSupportFragmentManager().beginTransaction().replace(R.id.admincontainer, reportFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE).addToBackStack(null).commit();
                        break;
                }
            }
        });
    }
}
