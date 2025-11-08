package samwells.io.spring_graphql.service.recordlabel;

import samwells.io.spring_graphql.codegen.types.RecordLabel;

import java.util.List;

public interface RecordLabelService {
    List<RecordLabel> getRecordLabels();
    RecordLabel getRecordLabel(String id);
}
