package samwells.io.spring_graphql.fetcher;

import com.netflix.graphql.dgs.DgsComponent;
import com.netflix.graphql.dgs.DgsQuery;
import com.netflix.graphql.dgs.InputArgument;
import lombok.AllArgsConstructor;
import samwells.io.spring_graphql.codegen.types.RecordLabel;
import samwells.io.spring_graphql.service.recordlabel.RecordLabelService;

import java.util.List;

@DgsComponent
@AllArgsConstructor
public class RecordLabelFetcher {
    private final RecordLabelService recordLabelService;

    @DgsQuery
    List<RecordLabel> getRecordLabels() {
        return recordLabelService.getRecordLabels();
    }

    @DgsQuery
    RecordLabel getRecordLabel(@InputArgument String id) {
        return recordLabelService.getRecordLabel(id);
    }
}
