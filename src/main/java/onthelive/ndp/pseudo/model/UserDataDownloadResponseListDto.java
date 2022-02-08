package onthelive.ndp.pseudo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataDownloadResponseListDto {
    private String kind;
    private int totalElements;
    private String nextDataPointer;
    private String previousDataPointer;
    private int totalDataSize;
    private boolean hasMore;
}
