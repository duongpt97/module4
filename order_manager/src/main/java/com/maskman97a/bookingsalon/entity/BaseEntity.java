package com.maskman97a.bookingsalon.entity;

import com.maskman97a.bookingsalon.dto.enums.DeleteEnum;
import jakarta.persistence.*;
import lombok.Generated;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.FieldNameConstants;
import lombok.experimental.SuperBuilder;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@FieldNameConstants
@SuperBuilder
@EntityListeners(AuditingEntityListener.class)
public class BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    protected Long id;
    @Column(name = "created_at")
    protected LocalDateTime createdAt;
    @Column(name = "created_by")
    protected String createdBy;
    @Column(name = "updated_at")
    protected LocalDateTime updatedAt;
    @Column(name = "updated_by")
    protected String updatedBy;
    @Column(name = "is_deleted", nullable = false, columnDefinition = "tinyint(1)")
    protected Integer isDeleted;

    public BaseEntity() {
        this.createdAt = LocalDateTime.now();
        this.createdBy = "admin";
        this.updatedAt = LocalDateTime.now();
        this.updatedBy = "admin";
        this.isDeleted = DeleteEnum.NO.getValue();
    }
}
