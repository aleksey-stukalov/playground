package com.company.playground.views.sample;

import com.haulmont.cuba.core.views.BaseEntityView;
import com.haulmont.cuba.core.views.scan.EntityViewName;
import com.haulmont.cuba.core.views.scan.ReplaceEntityView;
import com.haulmont.cuba.security.entity.User;

/**
 * Created by Aleksey Stukalov on 16/08/2018.
 */
@ReplaceEntityView(SampleMinimalView.class)
public interface SampleMinimalWithUserView extends SampleMinimalView {

    UserMinimalView getUser();

    void setUser(UserMinimalView val);

    @EntityViewName(UserMinimalView.NAME)
    interface UserMinimalView extends BaseEntityView<User> {
        String NAME = "user-minimal-view";

        String getLogin();
        void setLogin(String val);

        String getName();
        void setName(String val);
    }
}
