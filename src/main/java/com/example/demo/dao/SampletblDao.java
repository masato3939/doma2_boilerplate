package com.example.demo.dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.demo.entity.Sampletbl;

/**
 * @author k_kawasaki
 */
@Dao
@ConfigAutowireable
public interface SampletblDao {

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(Sampletbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(Sampletbl entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(Sampletbl entity);

    @Select
    Sampletbl selectid();
}