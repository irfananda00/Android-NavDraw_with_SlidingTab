package project.irfananda.navdraw_w_slidetab.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import project.irfananda.navdraw_w_slidetab.R;


public class LoginFragment extends Fragment {

    private Button btn_simple;
    private Button btn_flat;
    private Button btn_card;

    public LoginFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_login, container, false);
        btn_simple = (Button)v.findViewById(R.id.btn_simple);
        btn_simple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),SimpleLoginActivity.class);
//                startActivity(intent);
            }
        });
        btn_flat = (Button)v.findViewById(R.id.btn_flat);
        btn_flat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),FlatLoginActivity.class);
//                startActivity(intent);
            }
        });
        btn_card = (Button)v.findViewById(R.id.btn_card);
        btn_card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//                Intent intent = new Intent(getActivity(),CardLoginActivity.class);
//                startActivity(intent);

            }
        });

        return v;
    }
}
