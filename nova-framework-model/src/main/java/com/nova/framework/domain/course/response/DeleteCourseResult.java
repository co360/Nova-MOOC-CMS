package com.nova.framework.domain.course.response;

import com.nova.framework.model.response.ResponseResult;
import com.nova.framework.model.response.ResultCode;
import lombok.Data;
import lombok.ToString;

/**
 * @Author: HaoCong
 * @Description:
 * @Modified By:
 */
@Data
@ToString
public class DeleteCourseResult extends ResponseResult {
    public DeleteCourseResult(ResultCode resultCode, String courseId) {
        super(resultCode);
        this.courseid = courseid;
    }
    private String courseid;

}
