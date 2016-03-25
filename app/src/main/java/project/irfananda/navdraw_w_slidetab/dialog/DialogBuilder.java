package project.irfananda.navdraw_w_slidetab.dialog;

import android.content.Context;
import android.view.View;

import com.afollestad.materialdialogs.MaterialDialog;

import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.object.Film;

public class DialogBuilder extends MaterialDialog.Builder {

    private Film film;

    public DialogBuilder(Context context, Film film) {
        super(context);
        this.film = film;
    }

    public MaterialDialog showListDialog(){
        return new MaterialDialog.Builder(context)
                .items(R.array.menu)
                .itemsCallback(new MaterialDialog.ListCallback() {
                    @Override
                    public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                        //do something to handle the onSelection click
                    }
                })
                .show();
    }

}
