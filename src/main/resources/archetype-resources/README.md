工程目录原则
1. 提倡约定俗称和视情况而定，不强制要求。
2. 提倡以业务为核心，解耦非业务代码。(分离业务复杂度与技术复杂度).

工程目录说明
1. api        ||  对外提供接口 ||  包括请求/响应对象/错误码定义
2. app-server ||  服务器      ||  关注服务器，容器，启动，停止脚本
3. core       ||  业务逻辑层   ||
4. dao        ||  核心模型以及dao层
5. infra      ||  基础设施层   ||  封装外部接口调用，缓存，消息中间件，监控
6. test       ||  测试用例