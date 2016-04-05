package project.irfananda.navdraw_w_slidetab.fragment;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import project.irfananda.navdraw_w_slidetab.ClickListener;
import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.adapter.StagAdapter;
import project.irfananda.navdraw_w_slidetab.dialog.DialogBuilder;
import project.irfananda.navdraw_w_slidetab.object.DefineListFilm;
import project.irfananda.navdraw_w_slidetab.object.Film;
import project.irfananda.navdraw_w_slidetab.recyclerView.RecyclerTouchListener;


public class StaggeredFragment extends Fragment {

    private RecyclerView rv;
    private StagAdapter stagAdapter;
    private SwipeRefreshLayout swipeRefreshLayout;

    public StaggeredFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        stagAdapter = new StagAdapter(DefineListFilm.filmListRandom, getActivity());

        swipeRefreshLayout = (SwipeRefreshLayout) v.findViewById(R.id.swipeRefreshLayout);
        rv = (RecyclerView) v.findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        final StaggeredGridLayoutManager mLayoutManager = new StaggeredGridLayoutManager(2,2);
        mLayoutManager.setOrientation(StaggeredGridLayoutManager.VERTICAL);
        rv.setLayoutManager(mLayoutManager);

        rv.setAdapter(stagAdapter);

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
                Film film = DefineListFilm.filmListRandom.get(position);
                Snackbar.make(view, film.getTitle(), Snackbar.LENGTH_LONG)
                        .setAction("OK", new View.OnClickListener() {
                            @Override
                            public void onClick(View v) {

                            }
                        }).show();
            }

            @Override
            public void onLongClick(View view, int position) {
                Film film = DefineListFilm.filmListRandom.get(position);
                DialogBuilder dialogBuilder = new DialogBuilder(getActivity(),film);
                dialogBuilder.showListDialog();
            }
        }));

        return v;
    }


}
