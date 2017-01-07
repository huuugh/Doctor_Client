package doctorclient.slinph.com.doctor_client.Fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;

import doctorclient.slinph.com.doctor_client.R;

/**
 * Created by hugh on 2017/1/6.
 *
 */
public class MeFragment extends BaseFragment {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    protected String setFragmentTitle() {
        return "我的";
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    @Override
    protected View addFragmentLayout() {
        View meView = LayoutInflater.from(mContext).inflate(R.layout.fragment_me_layout, null);
        return meView;
    }
}
