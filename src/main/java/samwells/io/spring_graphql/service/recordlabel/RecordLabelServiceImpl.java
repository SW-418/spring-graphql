package samwells.io.spring_graphql.service.recordlabel;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import samwells.io.spring_graphql.codegen.types.RecordLabel;
import samwells.io.spring_graphql.repository.RecordLabelRepository;

import java.util.List;
import java.util.concurrent.CompletableFuture;

@Slf4j
@Service
@AllArgsConstructor
public class RecordLabelServiceImpl implements RecordLabelService {
    private final RecordLabelRepository recordLabelRepository;

    @Override
    public List<RecordLabel> getRecordLabels() {
        log.info("Retrieving all record labels");
        return recordLabelRepository
                        .findAll()
                        .stream()
                        .map(r -> new RecordLabel(String.valueOf(r.getId()), r.getName(), r.getEstablished().toString()))
                        .toList();
    }

    @Override
    public RecordLabel getRecordLabel(String id) {
        log.info("Retrieving record label for id {}", id);
        return recordLabelRepository
                .findById(Long.valueOf(id))
                .map(r -> new RecordLabel(String.valueOf(r.getId()), r.getName(), r.getEstablished().toString()))
                .orElse(null);
    }
}
