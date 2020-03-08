package com.clf.word2audio.xunfei;

import lombok.Data;

/**
 * @Author: clf
 * @Date: 2020-03-08
 * @Description: TODO
 */
@Data
public class JsonData {
    private int status;  //标志音频是否返回结束  status=1，表示后续还有音频返回，status=2表示所有的音频已经返回
    private String audio;  //返回的音频，base64 编码
    private String ced;  // 合成进度
}
