package tannt275.crazyarrange;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EActivity;
import org.androidannotations.annotations.ViewById;

import java.lang.ref.WeakReference;

import tannt275.crazyarrange.fragments.CalculatorFragment;
import tannt275.crazyarrange.fragments.CalculatorFragment_;
import tannt275.crazyarrange.utils.CounterLoader;

@SuppressLint("Registered")
@EActivity(R.layout.activity_main)
public class MainActivity extends AppCompatActivity {
    @ViewById(R.id.displayTime)
    public TextView mDisplayTime;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        CounterLoader.activity_weakReference = new WeakReference<>(this);
    }

    @AfterViews
    public void afterView(){
        initView();
    }

    private void initView(){
        CalculatorFragment calculatorFragment = CalculatorFragment_.builder().build();
        replaceFragment(calculatorFragment);
    }

    private void replaceFragment(Fragment fragment) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        fragmentManager.beginTransaction().add(R.id.container, fragment).addToBackStack(null).commitAllowingStateLoss();
    }
}
