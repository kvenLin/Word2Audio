package com.clf.word2audio.xunfei;

import lombok.Data;

/**
 * @Author: clf
 * @Date: 2020-03-08
 * @Description: TODO
 */
@Data
public class ResponseData {
    private int code;
    private String message;
    private String sid;
    private JsonData data;
}
