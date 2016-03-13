package project.irfananda.navdraw_w_slidetab.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.object.Film;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.MyViewHolder>  {

    private List<Film> filmList;
    private Context context;

    public CardAdapter(List<Film> filmList, Context context) {
        this.filmList = filmList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_film_card, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Film film = filmList.get(position);
        holder.txt_title.setText(film.getTitle());
        holder.txt_category.setText(film.getCategory());
        holder.txt_price.setText("$ "+film.getPrice());
        holder.img_poster.setImageResource(film.getImg());
        if (film.isOrdered()){
            holder.img_ordered.setImageResource(R.drawable.ic_check_circle_amber_500_24dp);
        }else {
            holder.img_ordered.setImageResource(R.drawable.ic_check_circle_grey_500_24dp);
        }
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_title, txt_category, txt_price;
        public ImageView img_poster, img_ordered;
        public CardView cv;

        public MyViewHolder(View view) {
            super(view);
            cv = (CardView) view.findViewById(R.id.cv);
            txt_title= (TextView) view.findViewById(R.id.txt_title);
            txt_category= (TextView) view.findViewById(R.id.txt_category);
            txt_price= (TextView) view.findViewById(R.id.txt_price);
            img_poster= (ImageView) view.findViewById(R.id.img_poster);
            img_ordered= (ImageView) view.findViewById(R.id.img_ordered);
        }
    }

}
