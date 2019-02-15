package com.impl;

import java.io.Serializable;
import java.util.List;

public interface IOption<T extends Serializable, PK extends Serializable> {
    public List<T> get(PK id);
    public void update(T entity);
    T delete(T entity);
}
