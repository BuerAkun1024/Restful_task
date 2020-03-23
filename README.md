## 任务

* Todo list

  使用node框架，构建一个Restful API，能够完成Todo list的以下功能。

  * 返回所有Todo任务
  * 创建一个新的Todo任务
  * 返回一个指定ID的Todo任务
  * 删除一个Todo任务

* Todo中一个任务的JSON格式定义为：

```json
  {
    "id": 1,
    "content": "Restful API homework",
    "createdTime": "2019-05-15T00:00:00Z"
  }
```

* 进一步的功能提示：需完成的四个功能的Restful API定义如下，实现即可。

```java
 GET /api/tasks/
 POST /api/tasks/
 GET /api/tasks/{id}
 DELETE /api/tasks/{id}
```



## 代码说明

* 在本任务中，选择springboot作为框架，进行增删改查操作。
* 由于在controller中，两个get方法 api/tasks 会导致重名，故将获取所有任务列表的api改为：api/taskALL



## Postman测试截图

* 接口：http://localhost:8080/api/taskALL   GET
 
 ![pic](https://github.com/BuerAkun1024/Restful_task/blob/master/GET.png)

* 接口:  http://localhost:8080/api/tasks       POST

![pic](https://github.com/BuerAkun1024/Restful_task/blob/master/POST.png)

* 接口:  http://localhost:8080/api/tasks?taskId=3     GET

![pic](https://github.com/BuerAkun1024/Restful_task/blob/master/GETbyID.png)

* 接口：http://localhost:8083/api/tasks?taskId=4     DELETE

![pic](https://github.com/BuerAkun1024/Restful_task/blob/master/DELETE.png)

