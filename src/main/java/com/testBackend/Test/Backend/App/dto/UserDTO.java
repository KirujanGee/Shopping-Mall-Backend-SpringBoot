package com.testBackend.Test.Backend.App.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class UserDTO {
    private String uID;
    private String name;
    private String email;
    private String phoneNumber;
    private String shippingAddress;
}
