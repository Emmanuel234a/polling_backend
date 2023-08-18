package com.ndirituedwin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Category {
//    attributes
@SequenceGenerator(
        name = "category_sequence",
        sequenceName = "category_sequence",
        allocationSize = 1
)
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE,
        generator = "category_sequence"
)
    private Long category_id;
    private String title;
    private String description;

}
