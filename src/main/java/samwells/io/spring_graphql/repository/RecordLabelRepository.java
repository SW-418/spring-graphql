package samwells.io.spring_graphql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import samwells.io.spring_graphql.entity.RecordLabel;

@Repository
public interface RecordLabelRepository extends JpaRepository<RecordLabel, Long> { }
