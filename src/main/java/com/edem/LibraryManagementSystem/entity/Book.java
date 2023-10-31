package com.edem.LibraryManagementSystem.entity;

import lombok.*;

import javax.persistence.*;
import javax.swing.*;
import java.math.BigInteger;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @ManyToOne
    @JoinColumn(name="author_id",referencedColumnName ="author_id", nullable = false)
    private Author author;

    private String description;

    private BigInteger price;

//    @ManyToOne(fetch = FetchType.LAZY)
//    @JoinColumn(name = "instructor_id", referencedColumnName = "instructor_id", nullable = false)
//    private Instructor instructor;

}
