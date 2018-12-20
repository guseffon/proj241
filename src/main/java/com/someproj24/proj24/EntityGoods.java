package com.someproj24.proj24;

import javax.persistence.*;

@Entity
@Table(name = "table_goods", catalog = "bd20")
public class EntityGoods {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "goods_id")
    private Long id;

    @Column(name = "goods_name")
    private String name;

    @Column(name = "goods_price")
    private Float price;

    public EntityGoods() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }
}
