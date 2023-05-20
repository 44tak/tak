// Generated by view binder compiler. Do not edit!
package com.example.heung.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.heung.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityPostwriteBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView btnBack;

  @NonNull
  public final EditText postCont;

  @NonNull
  public final View postLine;

  @NonNull
  public final Button postSave;

  @NonNull
  public final EditText postTitle;

  @NonNull
  public final TextView title;

  private ActivityPostwriteBinding(@NonNull LinearLayout rootView, @NonNull ImageView btnBack,
      @NonNull EditText postCont, @NonNull View postLine, @NonNull Button postSave,
      @NonNull EditText postTitle, @NonNull TextView title) {
    this.rootView = rootView;
    this.btnBack = btnBack;
    this.postCont = postCont;
    this.postLine = postLine;
    this.postSave = postSave;
    this.postTitle = postTitle;
    this.title = title;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityPostwriteBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityPostwriteBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_postwrite, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityPostwriteBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_back;
      ImageView btnBack = ViewBindings.findChildViewById(rootView, id);
      if (btnBack == null) {
        break missingId;
      }

      id = R.id.post_cont;
      EditText postCont = ViewBindings.findChildViewById(rootView, id);
      if (postCont == null) {
        break missingId;
      }

      id = R.id.post_line;
      View postLine = ViewBindings.findChildViewById(rootView, id);
      if (postLine == null) {
        break missingId;
      }

      id = R.id.post_save;
      Button postSave = ViewBindings.findChildViewById(rootView, id);
      if (postSave == null) {
        break missingId;
      }

      id = R.id.post_title;
      EditText postTitle = ViewBindings.findChildViewById(rootView, id);
      if (postTitle == null) {
        break missingId;
      }

      id = R.id.title;
      TextView title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      return new ActivityPostwriteBinding((LinearLayout) rootView, btnBack, postCont, postLine,
          postSave, postTitle, title);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
