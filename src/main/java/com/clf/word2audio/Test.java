package com.clf.word2audio;

import com.clf.word2audio.xunfei.XunFei;

/**
 * @Author: clf
 * @Date: 2020-03-08
 * @Description: TODO
 */
public class Test {
    public static void main(String[] args) throws Exception {
        //这里保存文件必须是pcm结尾
        XunFei.convertText2Pcm("大丈夫です", "test.pcm");
    }
}
