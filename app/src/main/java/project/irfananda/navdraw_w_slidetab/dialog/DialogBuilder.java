package project.irfananda.navdraw_w_slidetab.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;

import com.afollestad.materialdialogs.AlertDialogWrapper;
import com.afollestad.materialdialogs.MaterialDialog;

import project.irfananda.navdraw_w_slidetab.R;
import project.irfananda.navdraw_w_slidetab.object.Film;

public class DialogBuilder extends MaterialDialog.Builder {

    private Film film;

    public DialogBuilder(Context context, Film film) {
        super(context);
        this.film = film;
    }

    public DialogBuilder(Context context) {
        super(context);
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

    public MaterialDialog showMenuDialog(){
        return new MaterialDialog.Builder(context)
                .title("Menu Dialog")
                .items(R.array.menu)
                .itemsCallback(new MaterialDialog.ListCallback() {
                    @Override
                    public void onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                        //do something to handle the onSelection click
                    }
                })
                .show();
    }

    public MaterialDialog showBasicDialog(){
        return new MaterialDialog.Builder(context)
                .title("Basic Dialog")
                .content("This is the content, write something here.. ")
                .positiveText("OK")
                .show();
    }

    public Dialog showAlertDialog(){
        return new AlertDialogWrapper.Builder(context)
                .setTitle("Alert Dialog")
                .setMessage("This is the content, write something here.. ")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .setNegativeButton("NO", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                })
                .show();
    }

    public MaterialDialog showIconDialog(){
        return new MaterialDialog.Builder(context)
                .title("Icon Dialog")
                .content("This is the content, write something here.. ")
                .positiveText("OK")
                .iconRes(R.drawable.ic_account_circle_black_18dp)
                .show();
    }

    public MaterialDialog showListSingleDialog(){
        return new MaterialDialog.Builder(context)
                .title("Single Choice Dialog")
                .items(R.array.menu)
                .itemsCallbackSingleChoice(-1, new MaterialDialog.ListCallbackSingleChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, View view, int which, CharSequence text) {
                        //do something to handle the onSelection click
                        return true;
                    }
                })
                .positiveText("Done")
                .show();
    }

    public MaterialDialog showListMultiDialog(){
        return new MaterialDialog.Builder(context)
                .title("Multi Choice Dialog")
                .items(R.array.menu)
                .itemsCallbackMultiChoice(null, new MaterialDialog.ListCallbackMultiChoice() {
                    @Override
                    public boolean onSelection(MaterialDialog dialog, Integer[] which, CharSequence[] text) {
                        return false;
                    }
                })
                .positiveText("Done")
                .show();
    }

}
