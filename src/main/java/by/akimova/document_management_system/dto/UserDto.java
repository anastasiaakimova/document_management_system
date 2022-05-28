package by.akimova.document_management_system.dto;

import by.akimova.document_management_system.model.enums.AuthProvider;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class UserDto {
    private Long id;
    private String name;
    private String email;
    private String password;
    private String imageUrl;
    private AuthProvider provider;
    private String providerId;
    private Boolean isActive;
    private LocalDateTime registeredTime;
    private LocalDateTime updatedTime;
}
