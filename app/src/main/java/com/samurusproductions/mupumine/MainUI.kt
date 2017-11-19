package com.samurusproductions.mupumine;

import android.support.v4.content.ContextCompat
import android.view.View
import android.widget.ImageView
import android.widget.ListView
import com.samurusproductions.mupumine.R.drawable.minesweeper_xp_example
import kotlinx.android.synthetic.main.activity_main.view.*
import org.jetbrains.anko.*
import org.jetbrains.anko.appcompat.v7.toolbar
import org.jetbrains.annotations.NotNull;

/**
 * Created by Julius on 19.11.2017.
 */
class MainUI : AnkoComponent<MainActivity> {

    override fun createView(ui: AnkoContext<MainActivity>): View = with(ui) {
        return relativeLayout {
            backgroundColor = ContextCompat.getColor(ctx, R.color.abc_color_highlight_material)


//develop
        }
    }
}