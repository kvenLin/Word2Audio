# Word2Audio
对接科大讯飞语音合成api整合工具
## 项目结构
    |——tar: 需要在你的maven仓库安装的jar包
    |——src
    |——|——main
    |——|——|——java
    |——|——|——com.clf.word2audio
    |——|——|——|——xunfei: 讯飞语音合成的工具包
    |——|——|——|——ConvertUtils: 音频文件转换格式工具
    |——|——|——|——Test: 测试main
    |——|——|——|——WaveHeader: Wav转Mp3需要的header
## 使用方法
```shell script
git clone https://github.com/kvenLin/Word2Audio.git
```
```shell script
cd Word2Audio/jar/
```
```shell script
 mvn install:install-file -Dfile=okhttp-3.13.1.jar -DgroupId=com.clf -DartifactId=okhttp -Dversion=3.13.1 -Dpackaging=jar
```
```shell script
mvn install:install-file -Dfile=okio-1.15.0-20180330.135339-9.jar -DgroupId=com.clf -DartifactId=okio -Dversion=1.15.0 -Dpackaging=jar
```
1. 注册[讯飞开放平台](https://www.xfyun.cn/)开发账号
2. 修改[XunFei.java](src/main/java/com/clf/word2audio/xunfei/XunFei.java)主要参数配置
3. 运行测试类
4. [参考博客](https://blog.csdn.net/Box_clf/article/details/104733850)