# android-support-mvc
- dependencies Android API
- dependencies JDK

## 发布
- 最新版本
| groupId | artifactId | version |
| -------- | -------- | -------- |
| com.amlzq.android | mvc |  |

* 使用
```
dependencies{
    ...
    implementation 'com.amlzq.android:mvc:latest.integration'
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
- 思路
```
原始，粗犷的实现MVC
事件发布订阅
```
- 实现
```
model ContentProvider
controller Activity
view Fragment
```
- 其他组件
```
MVC + IO Schedulers + ArchRoom
```
- [框架模式 MVC 在Android中的使用](https://blog.csdn.net/feiduclear_up/article/details/46363207)
- [Android mvc模式](https://www.jianshu.com/p/7cb29c9c08d1)
- [Android 使用ContentProvider在应用间共享数据](https://www.jianshu.com/p/f69c7e0a4ba5)

- ObservableManager来源小说APP