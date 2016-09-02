// Generated code from Butter Knife. Do not modify!
package com.example.xyzreader.ui;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class ArticleDetailFragment$$ViewBinder<T extends com.example.xyzreader.ui.ArticleDetailFragment> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131624042, "field 'toolbar'");
    target.toolbar = finder.castView(view, 2131624042, "field 'toolbar'");
    view = finder.findRequiredView(source, 2131624057, "field 'collapsingToolbarLayout'");
    target.collapsingToolbarLayout = finder.castView(view, 2131624057, "field 'collapsingToolbarLayout'");
    view = finder.findRequiredView(source, 2131624046, "field 'tvArticleBody'");
    target.tvArticleBody = finder.castView(view, 2131624046, "field 'tvArticleBody'");
    view = finder.findRequiredView(source, 2131624045, "field 'tvArticleBy'");
    target.tvArticleBy = finder.castView(view, 2131624045, "field 'tvArticleBy'");
    view = finder.findRequiredView(source, 2131624058, "field 'ivPhoto'");
    target.ivPhoto = finder.castView(view, 2131624058, "field 'ivPhoto'");
  }

  @Override public void unbind(T target) {
    target.toolbar = null;
    target.collapsingToolbarLayout = null;
    target.tvArticleBody = null;
    target.tvArticleBy = null;
    target.ivPhoto = null;
  }
}
