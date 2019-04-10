package run.halo.app.model.dto.post;

import run.halo.app.model.enums.PostCreateFrom;
import run.halo.app.model.enums.PostType;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import run.halo.app.model.enums.PostCreateFrom;
import run.halo.app.model.enums.PostType;

/**
 * Page simple output dto.
 *
 * @author johnniang
 */
@Data
@ToString
@EqualsAndHashCode(callSuper = true)
public class PostSimpleOutputDTO extends PostMinimalOutputDTO {

    private PostType type;

    private String summary;

    private String thumbnail;

    private Long visits;

    private Boolean disallowComment;

    private String template;

    private Integer topPriority;

    private PostCreateFrom createFrom;

    private Long likes;
}