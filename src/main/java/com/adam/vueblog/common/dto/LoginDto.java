package com.adam.vueblog.common.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;

@Data
public class LoginDto implements Serializable {

    @NotBlank(message = "Please enter valid username")
    private String username;

    @NotBlank(message = "Please enter valid password")
    private String password;

}
