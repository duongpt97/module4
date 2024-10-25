package com.maskman97a.bookingsalon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLRestriction;

import java.math.BigDecimal;

@Entity
@Table(name = "loaisanpham")
@Getter
@Setter
public class CategoryEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_loai_sp")
    private Long id;

    @Column(name = "ten_loai_sp")
    private String name;


}
