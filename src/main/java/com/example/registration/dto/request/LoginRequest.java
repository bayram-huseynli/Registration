package com.example.registration.dto.request;

import com.example.registration.entity.ERole;
import com.example.registration.entity.Role;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.FieldDefaults;

@FieldDefaults(level = AccessLevel.PRIVATE)
@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginRequest {

    @NotEmpty
    @Size(min = 4, max = 15)
    String username;

    @NotEmpty
    @Size(min = 6, max = 12)
    String password;

    ERole eRole;
}
