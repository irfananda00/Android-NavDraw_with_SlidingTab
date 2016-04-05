package project.irfananda.navdraw_w_slidetab.fragment;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;

import java.io.Serializable;
import java.util.List;

import project.irfananda.navdraw_w_slidetab.ClickListener;
import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.dialog.DialogBuilder;
import project.irfananda.navdraw_w_slidetab.object.DefineListFilm;
import project.irfananda.navdraw_w_slidetab.object.Film;
import project.irfananda.navdraw_w_slidetab.recyclerView.DividerItemDecoration;
import project.irfananda.navdraw_w_slidetab.adapter.LinearAdapter;
import project.irfananda.navdraw_w_slidetab.recyclerView.RecyclerTouchListener;

public class LinearFragment extends Fragment implements Serializable {

    private RecyclerView rv;
    private LinearAdapter linearAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    public LinearFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        linearAdapter = new LinearAdapter(DefineListFilm.filmListSmall, getActivity());

        swipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.swipeRefreshLayout);
        rv = (RecyclerView) v.findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        final LinearLayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(mLayoutManager);

        rv.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
        rv.setItemAnimator(new DefaultItemAnimator());

        rv.setAdapter(linearAdapter);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                //load new data here

                swipeRefreshLayout.setRefreshing(false);
            }
        });

        rv.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), rv, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Film film = DefineListFilm.filmListSmall.get(position);
                ImageView img_ordered = (ImageView) view.findViewById(R.id.img_ordered);
                if (film.isOrdered()) {
                    img_ordered.setImageResource(R.drawable.ic_check_circle_grey_500_24dp);
                    film.setOrdered(false);
                } else {
                    img_ordered.setImageResource(R.drawable.ic_check_circle_amber_500_24dp);
                    film.setOrdered(true);
                }
            }

            @Override
            public void onLongClick(View view, int position) {
                Film film = DefineListFilm.filmListSmall.get(position);
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity(),film);
                dialogBuilder.showListDialog();
            }
        }));

        return v;
    }
}
