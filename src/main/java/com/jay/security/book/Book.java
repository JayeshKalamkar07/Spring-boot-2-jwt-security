package com.jay.security.book;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Book {

    @Id
    @GeneratedValue
    private Integer id;
    private String author;
    private String isbn;

    @CreatedDate
//    @Column(
//            nullable = false,
//            updatable = false
//    )
    private LocalDateTime createdTs;

    @LastModifiedDate
//    @Column(insertable = false)
    private LocalDateTime modifiedTs;


    @CreatedBy
//    @Column(
//            nullable = false,
//            updatable = false
//    )
    private String createdBy;

    @LastModifiedBy
//    @Column(insertable = false)
    private String updatedBy;
}
