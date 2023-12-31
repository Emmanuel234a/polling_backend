package com.ndirituedwin.Dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SignupRequest {


    private Long id;
    @NotBlank
    @Size(min = 3,max = 40)
    private String name;
    @NotBlank
    @Size(min = 3,max = 15)
    private String username;

    @NotBlank
    @Size(min = 3,max=50)
    @Email
    private String email;
    @NotBlank
    @Size(min= 6,max=50)
    private String password;
//    private Set<Role> roles=new HashSet<>();

}
