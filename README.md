# 设计模式
# 1.遥控器的代码实现代码
# 2.Java语言实现
## 2.1命令模式

### 要点

 1. **命令模式将请求封装成对象，这可以让你使用不同的请求，队列，或者日志请求来参数化其他对象。命令模式也支持撤销操作。**
 2. 命令模式将**发出请求的对象**和**执行请求的对象**解耦。
 3. 在被解耦的两者之间是通过命令对象进行沟通的。命令对象封装了接收者和一个（组）动作。
 4. 调用者通过调用命令对象的`execute()`发出请求，这会使得接收者的动作被调用。
 5. 调用者可以接受命令当做参数，甚至在运行时动态地进行。
 6. 命令可以支持撤销，做法是实现一个`undo()`方法来回到`execute()`被执行前的状态。
 7. 宏命令是命令的一种简单的延伸，允许调用多个命令。宏方法也支持撤销。
