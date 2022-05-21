package by.akimova.document_management_system.model;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.Column;
import javax.persistence.EntityListeners;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
public abstract class AbstractEntity {

    @Column(name = "created_on", updatable = false)
    @CreatedDate
    @com.fasterxml.jackson.annotation.JsonIgnore
    private LocalDateTime createdOn;

    @Column(name = "updated_on")
    @LastModifiedDate
    @com.fasterxml.jackson.annotation.JsonIgnore
    private LocalDateTime updatedOn;
}
