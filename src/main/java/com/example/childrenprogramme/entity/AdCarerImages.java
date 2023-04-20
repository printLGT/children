package com.example.childrenprogramme.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * @TableName ad_carer_images
 */
@TableName(value ="ad_carer_images")
@Data
public class AdCarerImages implements Serializable {
    private Long id;

    private Long carerInfoId;

    private String carerAuthImageUrl;

    private static final long serialVersionUID = 1L;
}