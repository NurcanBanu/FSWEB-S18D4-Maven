package com.workintech.s18d1.dao;

import com.workintech.s18d1.entity.BreadType;
import com.workintech.s18d1.entity.Burger;

import java.util.List;
import java.util.Set;

public interface BurgerDao {
    Burger save(Burger burger);

    List<Burger> findAll();

    Burger findById(long id);

    List<Burger> findByPrice(Integer price);

    List<Burger> findByBreadType(BreadType breadType);

    List<Burger> findByContent(String content);

    Burger update(Burger burger);

    Burger remove(long id);
}
