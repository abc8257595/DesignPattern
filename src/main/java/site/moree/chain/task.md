# 说明
按照责任链的顺序，依次处理各个handler，这种模式在tomcat、filter等很常见

# 责任链模式（Chain of Responsibility Pattern）
责任链模式是一种对象的行为模式。在责任链模式里，很多对象由每一个对象对其下家的引用而连接起来形成一条链。
请求在这个链上传递，直到链上的某一个对象决定处理此请求。发出这个请求的客户端并不知道链上的哪一个对象最终处理这个请求，这使得系统可以在不影响客户端的情况下动态地重新组织和分配责任。

# 核心类
`Handler`类定义了后继者`successor`和处理方法`handleRequest`，具体的实现类要实现`handleRequest`并调用`successor`接着处理。