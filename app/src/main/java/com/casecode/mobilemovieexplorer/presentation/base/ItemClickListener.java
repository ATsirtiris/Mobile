package com.casecode.mobilemovieexplorer.presentation.base;


import android.view.View;

/**
 * Created by Alexandros Tsirtiris on 12/27/223
 */
public @FunctionalInterface interface ItemClickListener<T> {
        void onItemClick(View view, T data);

}
