
package com.shang.framework.mvp.ui.feed.opensource;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.shang.framework.mvp.R;
import com.shang.framework.mvp.data.network.model.OpenSourceResponse;
import com.shang.framework.mvp.di.component.ActivityComponent;
import com.shang.framework.mvp.ui.base.BaseFragment;

import java.util.List;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
* Created by sangbk92 on 14-12-2020.
*/



public class OpenSourceFragment extends BaseFragment implements
        OpenSourceMvpView, OpenSourceAdapter.Callback {

    private static final String TAG = "OpenSourceFragment";

    @Inject
    OpenSourceMvpPresenter<OpenSourceMvpView> mPresenter;

    @Inject
    OpenSourceAdapter mOpenSourceAdapter;

    @Inject
    LinearLayoutManager mLayoutManager;

    @BindView(R.id.repo_recycler_view)
    RecyclerView mRecyclerView;

    public static OpenSourceFragment newInstance() {
        Bundle args = new Bundle();
        OpenSourceFragment fragment = new OpenSourceFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_open_source, container, false);

        ActivityComponent component = getActivityComponent();
        if (component != null) {
            component.inject(this);
            setUnBinder(ButterKnife.bind(this, view));
            mPresenter.onAttach(this);
            mOpenSourceAdapter.setCallback(this);
        }
        return view;
    }

    @Override
    protected void setUp(View view) {
        mLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(mLayoutManager);
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mOpenSourceAdapter);

        mPresenter.onViewPrepared();
    }

    @Override
    public void onRepoEmptyViewRetryClick() {

    }

    @Override
    public void updateRepo(List<OpenSourceResponse.Repo> repoList) {
        mOpenSourceAdapter.addItems(repoList);
    }

    @Override
    public void onDestroyView() {
        mPresenter.onDetach();
        super.onDestroyView();
    }
}
