package com.example.demo.entity;

import java.math.BigDecimal;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.Table;

@Entity
@Table(name = "sampletbl")
public class Sampletbl {

    /**  */
    @Column(name = "id")
    public BigDecimal id;

    /**  */
    @Column(name = "name")
    public String name;
}