# android-support-mvc
- 实践简单的MVC架构思想，截至到2015年底。
- 适配到Android 5.0
- 

## 发布
- 最新版本
| groupId | artifactId | version |
| -------- | -------- | -------- |
| com.amlzq.android | mvc |  |

* 使用
```
dependencies{
    ...
    // 方式一：远程依赖
    implementation 'com.amlzq.android:mvc:latest.integration'
    // 方式二：本地aar
    implementation files('libs/amlzq-android-mvc.aar')
}
```

## 工程结构
* ./mvc
> mvc architecture library
```
package: com.amlzq.android.architecture
```
* ./sample
> sample application
```
package: com.amlzq.asb
appName: MVC支持库
applicationId: com.amlzq.asb.mvc
```

## MVC实践
- 依赖Android Platform APIs
- 依赖Android Support APIs
- 早期Android开发环境，第三方类库不完善，大部分功能基于平台API开发，功能简单，接口数量少，

- 思路
```
原始，粗犷的实现MVC
事件发布订阅
```

- View
```

```

- 网络通信
```
Volley
```

- Image Load
```
Android-Universal-Image-Loader
```

- SQLite
```

```

- 事件总线
```
ObservableManager来源ANYEAPP
```

- Utils
```
xUtils2
```

## 参考
- [框架模式 MVC 在Android中的使用](https://blog.csdn.net/feiduclear_up/article/details/46363207)
- [Android mvc模式](https://www.jianshu.com/p/7cb29c9c08d1)
- [Android 使用ContentProvider在应用间共享数据](https://www.jianshu.com/p/f69c7e0a4ba5)
