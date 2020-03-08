package com.magus.fortniteminitracker;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.magus.fortniteminitracker.ui.userquery.UserQueryFragment;

public class UserQuery extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.user_query_activity);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, UserQueryFragment.newInstance())
                    .commitNow();
        }
    }
}
