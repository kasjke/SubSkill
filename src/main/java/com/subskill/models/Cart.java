package com.subskill.models;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id", nullable = false)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "id")
    private User user;

    @ManyToMany(mappedBy = "listOfMicroSkills")
    private List<MicroSkill> listOfMicroSkills;
}