package samwells.io.spring_graphql.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.graphql.data.federation.EntityMapping;

import java.time.Instant;
import java.time.Year;

@Entity
@Getter
@EntityMapping
@NoArgsConstructor
@Table(name = "record_label")
public class RecordLabel {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String name;

    Year established;

    @CreationTimestamp
    @Column(name = "created_at")
    Instant createdAt;

    @CreationTimestamp
    @Column(name = "updated_at")
    Instant updatedAt;

    @Version
    Long version;
}
