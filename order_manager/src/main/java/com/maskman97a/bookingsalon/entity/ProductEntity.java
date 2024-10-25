package com.maskman97a.bookingsalon.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.SQLRestriction;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "sanpham")
@Getter
@Setter
public class ProductEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ma_sp")
    private Long id;

    @Column(name = "ten_sp")
    private String name;

    @Column(name = "gia_sp")
    private Double price;

    @Column(name = "tinh_trang_sp")
    private String status;

    @ManyToOne
    @JoinColumn(name = "ma_loai_sp")
    private CategoryEntity category;


}
