package com.gowhich.androidmenu;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
//        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
//        return super.onOptionsItemSelected(item);
        switch (item.getItemId()){
            case R.id.create_new:
                Intent intent = new Intent(MainActivity.this, SysMenuActivity.class);
                item.setIntent(intent);
                Toast.makeText(MainActivity.this, "创建菜单", Toast.LENGTH_SHORT).show();
                break;
            case R.id.open:
                Toast.makeText(MainActivity.this, "打开菜单", Toast.LENGTH_SHORT).show();
                break;
            case R.id.save:
                Toast.makeText(MainActivity.this, "保存菜单", Toast.LENGTH_SHORT).show();
                break;
            case R.id.load:
                Toast.makeText(MainActivity.this, "加载菜单", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);

    }
}
