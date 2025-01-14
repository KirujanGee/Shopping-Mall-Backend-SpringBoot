package com.testBackend.Test.Backend.App.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class User {
    @Id
    private String uID;
    private String name;
    private String email;
    private String phoneNumber;
    private String shippingAddress;
}
