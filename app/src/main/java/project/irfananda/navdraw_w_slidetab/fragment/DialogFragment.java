package project.irfananda.navdraw_w_slidetab.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.dialog.DialogBuilder;


public class DialogFragment extends Fragment {

    public DialogFragment() {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_dialog, container, false);
        Button btn_basic = (Button) v.findViewById(R.id.btn_basic);
        btn_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity());
                dialogBuilder.showBasicDialog();
            }
        });
        Button btn_alert = (Button) v.findViewById(R.id.btn_alert);
        btn_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity());
                dialogBuilder.showAlertDialog();
            }
        });
        Button btn_icon = (Button) v.findViewById(R.id.btn_icon);
        btn_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity());
                dialogBuilder.showIconDialog();
            }
        });
        Button btn_menu = (Button) v.findViewById(R.id.btn_menu);
        btn_menu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity());
                dialogBuilder.showMenuDialog();
            }
        });
        Button btn_listSingle = (Button) v.findViewById(R.id.btn_listSingle);
        btn_listSingle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity());
                dialogBuilder.showListSingleDialog();
            }
        });
        Button btn_listMulti = (Button) v.findViewById(R.id.btn_listMulti);
        btn_listMulti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity());
                dialogBuilder.showListMultiDialog();
            }
        });


        return v;
    }
}
