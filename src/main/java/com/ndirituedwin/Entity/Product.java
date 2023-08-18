package com.ndirituedwin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
@Entity
@Table(name = "product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {
//     product attribute
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long product_id;
    private String title;
    private String description;
    private int quantity;
    private BigDecimal price;
    private String imageName;

//    show relationship with category
     @ManyToOne(fetch = FetchType.EAGER,cascade = CascadeType.ALL)
     @JoinColumn(
             name = "product_category_fk",
             referencedColumnName = "category_id"

     )
    public Category category;

}
