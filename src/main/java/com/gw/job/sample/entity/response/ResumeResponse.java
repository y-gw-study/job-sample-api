package com.gw.job.sample.entity.response;

import com.gw.job.sample.entity.result.ResumeResult;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@Schema(description = "レジュメ情報レスポンス")
public class ResumeResponse {

    @Schema(description = "ユーザーID", example = "1")
    private long userId;

    @Schema(description = "苗字", example = "苗字")
    private String lastName;

    @Schema(description = "名前", example = "名前")
    private String firstName;

    @Schema(description = "生年月日 yyyy-MM-ddの形式", example = "1990-10-10")
    private String birthDate;

    @Schema(description = "職務要約", example = "プログラマーとして働いていました。")
    private String jobDescription;
}
