package com.czxy.xuecheng.domain.course.ext;

import com.czxy.xuecheng.domain.course.CourseBase;
import com.czxy.xuecheng.domain.course.CourseMarket;
import com.czxy.xuecheng.domain.course.CoursePic;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 *
 */
@Data
@NoArgsConstructor
@ToString
public class CourseView implements java.io.Serializable {
    private CourseBase courseBase;
    private CoursePic coursePic;
    private CourseMarket courseMarket;
    private TeachplanNode teachplanNode;
}
