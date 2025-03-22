package sme.hub.common.base;


import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import java.io.Serializable;
import java.time.LocalDateTime;

@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Getter
public abstract class BaseEntity implements Serializable {
    @CreatedDate
    @Column(nullable = false, updatable = false)
    protected LocalDateTime createdAt;

    @LastModifiedDate
    @Column
    protected LocalDateTime updatedAt = LocalDateTime.now();

    @CreatedBy
    @Column(nullable = false, updatable = false)
    protected String createdBy;

    @LastModifiedBy
    @Column
    protected String updatedBy;
//    @PrePersist
//    private void onCreate() {
//            this.createdAt =  LocalDateTime.now();
//            this.updatedAt =  LocalDateTime.now();
//    }
//    @PreUpdate
//    private void onUpdate() {
//        this.updatedAt = LocalDateTime.now();
//    }
}