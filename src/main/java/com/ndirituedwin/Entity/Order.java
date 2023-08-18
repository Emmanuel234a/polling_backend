package com.ndirituedwin.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Order {
//     order attributes
@SequenceGenerator(
        name = "product_sequence",
        sequenceName = "order_sequence",
        allocationSize = 1
)
@Id
@GeneratedValue(strategy= GenerationType.SEQUENCE,
generator ="order_sequence")
private int id;

    private String orderId;

    @OneToOne
    @JoinColumn(name = "product_id",
            referencedColumnName = "product_id"
    )
    private Product product;


    @OneToOne
    @JoinColumn(name = "user_id_fk",
    referencedColumnName = "id")
    private User user;

    private int quantity;

    private String orderDate;  // 13-01-2022 10:00 PM

    private String deliveryStatus;

    private String deliveryDate;

    private String deliveryTime; // evening, afternoon....

    private String deliveryAssigned;

    private int deliveryPersonId;
}
