package tannt275.crazyarrange.fragments;


import android.support.v4.app.Fragment;
import android.widget.ImageView;
import android.widget.TextView;

import org.androidannotations.annotations.AfterViews;
import org.androidannotations.annotations.EFragment;
import org.androidannotations.annotations.ViewById;

import tannt275.crazyarrange.R;

/**
 * A simple {@link Fragment} subclass.
 */
@EFragment(R.layout.fragment_calculator)
public class CalculatorFragment extends Fragment {

    @ViewById(R.id.displayTime)
    public TextView mDisplayTime;
    @ViewById(R.id.displayScore)
    public TextView mDisplayScore;
    @ViewById(R.id.firstItem)
    public TextView mFirstItem;
    @ViewById(R.id.secondItem)
    public TextView mSecondItem;
    @ViewById(R.id.resultItem)
    public TextView mResultItem;
    @ViewById(R.id.firstOperator)
    public TextView mFirstOperator;
    @ViewById(R.id.secondOperator)
    public TextView mSecondOperator;
    @ViewById(R.id.wrongResult)
    public ImageView mWrongImg;
    @ViewById(R.id.rightResult)
    public ImageView mRightImage;

    @AfterViews
    public void afterView() {
        initView();
    }

    private void initView() {

    }
}
