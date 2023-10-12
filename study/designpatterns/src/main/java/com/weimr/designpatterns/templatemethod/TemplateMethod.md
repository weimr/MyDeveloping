1 悍马模型示例  
1）示例描述：悍马车有两个型号，H1和H2，且具有如下功能：    
（1）能启动  
（2）能停止  
（3）能鸣笛  
（4）引擎有声音  
（5）能跑
2）代码：before  
3）问题：两个实现类的run()方法都是完全相同的，那么这个run()方法的实现应该出现在抽象类，不应该出现在实现类上，抽象是所有子类的共性封装  
4）改造：将相同的代码抽取到抽象类，代码如：demo

2 模板方法模型的定义  
1）定义：定义一个操作中的算法框架，而将一些步骤延迟到子类中。使得子类可以不改变一个算法的结构即可重定义该算法的某些特定步骤  
2）注意  
（1）为了防止恶意操作，一般模板方法都加上final关键字，不允许被覆写  
（2）抽象模板中的基本方法尽量设计为protected类型，不需要暴露的属性或方法尽量不要设置为protected类型。  
（3）实现类若非必要，尽量不要扩大弗雷中的访问权限

3 模板方法模式的应用
1）优点  
（1）封装不变部分，扩展可变部分   
（2）提取公共部分代码，便于维护  
（3）行为由父类控制，子类实现  
2）缺点：子类对父类产生了影响，这在复杂的项目中，会带来代码阅读的难度，而且也会让新手产生不适感    
3）使用场景  
（1）多个子类有公有的方法，并且逻辑基本相同时  
（2）重要、复杂的算法，可以把核心算法设计为模板方法，周边的相关细节功能则由各个子类实现  
（3）重构时，模板方法模式是一个经常使用的模式，把相同的代码抽取到父类中，然后通过钩子函数约束其行为 

4 模板方法模式的扩展  
1）扩展描述：客户要求H1型号的悍马喇叭响让它响就响，H2型号的喇叭不要有声音  
2）抽象类中isAlarm的返回值就是影响了模板方法的执行结果，该方法就叫做钩子方法（Hook Method）

5 最佳实践  
1）父类怎么调用子类的方法  
（1）把子类传递到父类的有参构造中，然后调用  
（2）使用反射的方式调用  
（3）父类调用子类的静态方法  
2）总结：父类坚决不要调用子类的方法