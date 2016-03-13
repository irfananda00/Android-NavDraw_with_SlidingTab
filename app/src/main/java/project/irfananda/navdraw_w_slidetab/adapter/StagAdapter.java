package project.irfananda.navdraw_w_slidetab.adapter;

import android.content.Context;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import java.util.List;

import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.object.Film;

public class StagAdapter extends RecyclerView.Adapter<StagAdapter.MyViewHolder>  {

    private List<Film> filmList;
    private Context context;

    public StagAdapter(List<Film> filmList, Context context) {
        this.filmList = filmList;
        this.context = context;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_film_stag, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        Film film = filmList.get(position);
        holder.txt_title.setText(film.getTitle());
        holder.txt_category.setText(film.getCategory());
        holder.txt_price.setText("$ " + film.getPrice());
        holder.img_poster.setImageResource(film.getImg());
//        if (film.isOrdered()) {
//            holder.rl_card.setBackgroundColor(context.getResources().getColor(R.color.colorAccent));
//            holder.txt_price.setTextColor(context.getResources().getColor(R.color.colorText));
//        } else {
//            holder.rl_card.setBackgroundColor(context.getResources().getColor(R.color.cardview_light_background));
//            holder.txt_price.setTextColor(context.getResources().getColor(R.color.colorSecondaryText));
//        }
    }

    @Override
    public int getItemCount() {
        return filmList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {
        public TextView txt_title, txt_category, txt_price;
        public ImageView img_poster;
        public CardView cv;
        public RelativeLayout rl_card;

        public MyViewHolder(View view) {
            super(view);
            cv = (CardView) view.findViewById(R.id.cv);
            txt_title= (TextView) view.findViewById(R.id.txt_title);
            txt_category= (TextView) view.findViewById(R.id.txt_category);
            txt_price= (TextView) view.findViewById(R.id.txt_price);
            img_poster= (ImageView) view.findViewById(R.id.img_poster);
            rl_card = (RelativeLayout) view.findViewById(R.id.rl_title);
        }
    }

}
