package com.core.design.pattern.behavioural.iterator;

import java.util.ArrayList;
import java.util.List;

public class MyIteratorImpl implements MyIterator {
    private List<User> userList = null;
    private int length = 0;
    private int position = 0;

    public MyIteratorImpl(List<User> userList) {
        this.userList = userList;
        this.length = userList.size();
    }

    @Override
    public boolean hasNext() {
        return position < length;
    }

    @Override
    public Object next() {
        User user = userList.get(position);
        position+=1;
        return user;
    }
}
