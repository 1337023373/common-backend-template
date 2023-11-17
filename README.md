# common-backend-template（通用后端模板）

## 介绍
项目基础模板，提供基础的功能模块，base on yupi，具体如下：
1. B站完整介绍教程：https://www.bilibili.com/video/BV1jN4y1S7eC/?spm_id_from=333.999.list.card_archive.click&vd_source=3c68c4954142f1c67c2386ed8e28d42c
2. 权限认证框架：Sa-token，国产轻量级框架，官方文档：https://sa-token.cc/index.html
3. 日志记录工具：Logback+Knife4j
4. 文件工具（OSS集成）：Minio
5. 定时任务：Quartz
6. 数据库：Druid数据源+Mysql+Redis+Mybatis Plus
7. 通用返回类使用用例：User mvc代码demo
8. 众多工具类：Hutool、Gson、commons-lang3等，更多请看pom文件
9. 项目模块打包教程和配置请看【B站程序员鱼皮】的视频教程：【还不会部署微服务项目？保姆级教程来啦！】 【精准空降到 05:00】 https://www.bilibili.com/video/BV1Cp4y1F7eA/?share_source=copy_web&vd_source=94ede5bc6f02894a117d8a97f9dd685e&t=300
10. 其他依赖：mail、ws、enc，可自行实现使用

## 软件架构
1. sspuoj-admin模块：管理项目的配置类、配置文件
2. sspuoj-common模块：管理项目的通用类、常量、工具类等
3. sspuoj-domain模块：管理项目的实体类、枚举类、接口类等
4. sspuoj-quartz模块：管理项目的定时任务类
5. sspuoj-system模块：管理项目的系统模块，业务逻辑的设计就在其中


## 安装教程

1. git clone https://gitee.com/cct_4/common-backend-template
2. 等待依赖安装完成
3. 自定义修改配置文件
4. 项目，启动！
5. 启动成功页面：
![](https://picst.sunbangyan.cn/2023/11/17/d63c6af825fc8247ff7e6b13716959b7.png)

## 使用说明
0. 全局搜索和替换的idea快捷键：Ctrl+Shift+F、Ctrl+Shift+R
1. 全局替换包名成自己的：sspu.zzx.sspuoj - > 你自己的包名，如com.zzx.demo；然后修改包目录的名字
2. 根据需要配置yml文件：通过全局搜索`todo`
3. logback.xml文件中的有关路径的配置请看其中注释后修改（这个是日志保存和样式配置）
4. 支持分页查询，详情可以查看user相关demo的impl实现类
5. 查看可修改的点，可全局搜索`todo`


## 后勤
有其他问题可至我的B站私信反馈（请标明来处和目的）：https://space.bilibili.com/1198127286?spm_id_from=333.1007.0.0
![bilibili](https://picdl.sunbangyan.cn/2023/11/17/0629277188fb42abe56b5417e7d09b95.png)

## 项目完整目录结构：
```lua
├─.idea
├─sspuoj-admin
│  └─src
│      └─main
│          ├─java
│          │  └─sspu
│          │      └─zzx
│          │          └─sspuoj
│          │              └─config
│          │                  └─properties
│          └─resources
│              ├─mapper
│              ├─META-INF
│              └─static
├─sspuoj-common
│  └─src
│      └─main
│          └─java
│              └─sspu
│                  └─zzx
│                      └─sspuoj
│                          ├─common
│                          ├─constant
│                          ├─exception
│                          └─utils
│                              └─file
│                                  └─minio
├─sspuoj-domain
│  └─src
│      └─main
│          └─java
│              └─sspu
│                  └─zzx
│                      └─sspuoj
│                          └─model
│                              ├─dto
│                              │  ├─file
│                              │  └─user
│                              ├─entity
│                              ├─enums
│                              ├─judge
│                              │  └─model
│                              └─vo
├─sspuoj-quzrtz
│  └─src
│      └─main
│          └─java
│              └─sspu
│                  └─zzx
│                      └─sspuoj
│                          ├─job
│                          └─task
└─sspuoj-system
    └─src
        └─main
            └─java
                └─sspu
                    └─zzx
                        └─sspuoj
                            ├─aop
                            │  └─annotation
                            ├─controller
                            ├─mapper
                            └─service
                                └─impl
                                    └─sys