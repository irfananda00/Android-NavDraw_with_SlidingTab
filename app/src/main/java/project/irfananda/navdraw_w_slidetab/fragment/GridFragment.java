package project.irfananda.navdraw_w_slidetab.fragment;

import android.os.Bundle;
import android.support.design.widget.Snackbar;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import project.irfananda.navdraw_w_slidetab.ClickListener;
import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.adapter.GridAdapter;
import project.irfananda.navdraw_w_slidetab.adapter.LinearAdapter;
import project.irfananda.navdraw_w_slidetab.object.DefineListFilm;
import project.irfananda.navdraw_w_slidetab.object.Film;
import project.irfananda.navdraw_w_slidetab.recyclerView.DividerItemDecoration;
import project.irfananda.navdraw_w_slidetab.recyclerView.RecyclerTouchListener;


public class GridFragment extends Fragment {

    private List<Film> filmList;
    private RecyclerView rv;
    private GridAdapter gridAdapter;

    public GridFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DefineListFilm defineListFilm = new DefineListFilm();
        filmList = defineListFilm.getFilmListSmall();
        gridAdapter = new GridAdapter(filmList,getActivity());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_list, container, false);

        rv = (RecyclerView) v.findViewById(R.id.rv);

        rv.setHasFixedSize(true);
        final GridLayoutManager mLayoutManager = new GridLayoutManager(getActivity(),3);
        mLayoutManager.setOrientation(GridLayoutManager.VERTICAL);
        rv.setLayoutManager(mLayoutManager);
//
//        rv.addItemDecoration(new DividerItemDecoration(getActivity(), LinearLayoutManager.VERTICAL));
//        rv.setItemAnimator(new DefaultItemAnimator());

        rv.setAdapter(gridAdapter);

        rv.addOnItemTouchListener(new RecyclerTouchListener(getActivity(), rv, new ClickListener() {
            @Override
            public void onClick(View view, int position) {
                Film film = filmList.get(position);
                RelativeLayout rl_card = (RelativeLayout) view.findViewById(R.id.rl_title);
                TextView txt_price = (TextView) view.findViewById(R.id.txt_price);
                if (film.isOrdered()) {
                    rl_card.setBackgroundColor(getResources().getColor(R.color.cardview_light_background));
                    txt_price.setTextColor(getResources().getColor(R.color.colorSecondaryText));
                    film.setOrdered(false);
                } else {
                    rl_card.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                    txt_price.setTextColor(getResources().getColor(R.color.colorText));
                    film.setOrdered(true);
                }
            }

            @Override
            public void onLongClick(View view, int position) {
                Film film = filmList.get(position);

            }
        }));

        return v;
    }


}
