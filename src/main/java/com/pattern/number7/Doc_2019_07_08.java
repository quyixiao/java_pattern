package com.pattern.number7;

public class Doc_2019_07_08 {
    // 如果有一组算法，那么就将每一组算法封装起来，使得它们可以互换
    // 从上面的代码片断可以看出，客户端依赖于基类类型，而变量的真实类型则是具体的策略类，这是具体的策略角色可以 即插即用的 关键
    // 合成模式
    // 合成模式，通过使用树结构的描述的整体与部分的关系，从而可以将单纯的元素与复合元素的同行看待，由于单纯的元素和复合的元素都是抽象元素的
    // 子类，因此两者可都可以替代抽象元素出现的任何地方，合成模式的简略图如下图所示
    // 代理模式给对象提供了一个代理对象，并由代理对控制对原对象的引用，代理模式能够成立的关键，就在于代理模式与真实的模式都是抽象角色子类
    // 客户端知道抽象主题，而代理主题可以替代抽象主题出现在任何需要的地方，而将真实主题隐藏幕后，
    // 里氏替换原则讲的是基类与子类之间的关系，只有当这种关系存在时，里氏替换关系才存在，反之则不存在，如果有两个具体的类 A 和 B 之间的关系
    // 违反了里氏替换原则设计，根据具体的情况，下面两种情况中选择一种
    // 这个，只要 width 或 height 被赋值，那么 width和 height 会被同时赋值，从而是使长方形的长和宽总是相等的，
    // 代码重构
    // 根据墨子在两千多年
    // 正如本书在专题抽象类一章中所指出的，应当尽量众抽象类继承，而不从具体的类继承，Quadrangle 接口相当于抽象类，使用这个抽象角色解决了
    // 两个具体的类和 Suqare 具体的继承关系的问题
    // 依赖倒转原则
    // 实现开闭原则关键是抽象化，并且从抽象化导出具体的实现，如果 说 开闭 原则是面向对象的设计的目标的话，依赖倒转原则就是这个面向对象的设计的主要
    // 机制
    // 依赖倒转原则讲的是要依赖于抽象，不要依赖于具体的
    // 为什么要使用倒转，一词，依赖倒转的意义是
    // 简单的来说，传统的过程性系统的设计办法倾向于使用高层次的模块依赖于低层次的模块依赖，抽象层依赖于具体的层，倒转原则就是要把这个
    // 借误的依赖关系倒转过来，这就是依赖倒转原则
    // 抽象层次依赖于具体的层次的含义是什么，抽象层次包含的是应用系统的商务逻辑和宏观的，对整个系统来说中重要的战略性决定，是必然的，
    // 的体现，而具体的层次则含有一些次要的与实现有关的算法和逻辑，以及战术性的的决定的，带有相当大的偶然性的选择，具体的层次代码与实现
    // 有关的算法变化立即而抽象层次依赖于具体的的层次，使许多的具体的层次细节的算法变化立即影响到了抽象层次的宏观的商务逻辑，导致微观的决定
    // 层次，导致微观的决定宏观，战术决定战战略，偶然决定必然，下图，
    // 依赖倒转原则是 COM,CORBA，JaVABean ，以及 EJB 等构建设计模型背后的基本的原则
    // 复用与可维护性的倒转
    // 从复用的角度来看，高层次的模块是设计者应当复用的，但是传统的过程性的设计中，复用却侧重于具体的层次的复用，比如算法的复用，数据结构的
    // 复用，函数库的复用，都不可为避免的是具体的层次模块的复用，较高层次的结构依赖于较低层次的结构，层次的结构又依赖于更加低层次的结构，
    // 如此继续，直到依赖于每一行的代码，较低层次的修改，会造成较高层次的修改，直到高层次的逻辑的修改
    // 同样的，传统的做法也是强调具体上的可维护性，包括一个函数，数据结构，等的可维护性，而不是高级层次上的可维护性
    // 从复用的意义上来讲，既然抽象层次含有一个应用系统的最重要的宏观商务逻辑，是做战略判断的决定的地方，那么抽象层次就应当较为稳重，应当
    // 是重点中的重点，由于由于现有的复用侧重于模块和细节的复用，因此，倒转，一词，则是指定利用应当的将复用的重点放在抽象层次上，如果抽象
    // 层次的模块相对于具体的层次的模块的话，那么抽象层次的模块的利用便是相对较为容易的了
    // 两样的，最重要的宏观的商务逻辑也应当是维护的重点，而不是相反的
    // 因此，遵守依赖倒转的原则会带来复用和可维护性的倒转，好了，现在我们就来看看依赖倒转的原则是怎样的表述的吧
    // 依赖倒转的原则，关系有什么种类
    // 三种耦合的关系
    // 在面向对象的系统里
    // 两个类之间可以发生三种不同的耦合关系
    // 零耦合： 如果两个类没有耦合关系，我们称为零耦合关系
    // 具体的耦合关系，具体性耦合发生在两个具体的可实例化的类之间，经由一个类对另一个类的具体的直接的引用造成的
    // 抽象耦合关系：抽象耦合关系发生成一个具体的类和一个抽象的类，或者 java接口之间的，使两个类必须发生类之间的存在的最大的灵活性的关系
    //

    // 什么是依赖倒转原则
    // 简单的来说，依赖倒转原则要求客户端依赖于抽象的耦合，依赖倒转原则的表述是
    // 抽象不应当依赖于细节 ，细节应当依赖于抽象
    // 依赖倒转原则的另一种的表述是
    // 要针对接口编程，不应当针对实现编程
    // 第二种表述是 一书所强调的
    // 针对接口编程的意思就是说，应当使用 java 接口和抽象的 java 类进行变量的类型声明参量的类型声明，方法返回类型的声明，以及数据类型的转换
    // 要保证做到这一点的一个具体的 java 类应当只实现 java 接口和抽象java 类中的声明过的方法，而不应当给出多余的方法
    // 依赖关系强调的是一个系统的内部的实体之间的关系的灵活性，基本上，如果设计希望遵守开闭原则，那么依赖原则便是达到要求的途径
    // 变量的静态类型和真实类型
    // 变量被声明的类型叫做变量的静态类型，有些作者把静态类型称为明显类型，变量所以引用的对象的真实类型叫做变量的实际类型
    // List employees = new Vecto();
    // 显然，在上面的程序代码中，emplyees 变量的静态类型是 List,而它的实际类型是 Vector
    // 引用对象的抽象类型
    // 在很多的情况下，一个 java 程序需要引用一个对象，这个时候，如果这个对象有一个抽象类型的话，应当使用这个抽象类型作为变量的静态类型
    // 这就是针对接口的编程的含义
    // 如果蛋代表抽象，鸡代表具体，那么仍然套用先有鸡再有蛋的话题，依赖倒转原则相当于在说鸡应当依赖于蛋，而蛋不应当依赖于鸡，先有蛋再有鸡
    // 假设蛋 就是 java 接口或者 java 抽象类，鸡是一个具体的类，X 是一个变量，那么这个变量的声明应当是下面的样子
    // 蛋 x = new 鸡()
    // 而不应当是
    // 鸡 c = new 鸡（）;
    // 使用读者可能更常见的创建 employee 类的例子说明的话，就是尽量不要使用下面的声明语句
    //  Vector employee = new Vector();
    // 而应当使用下面的声明语句
    // List employee = new Vector();
    // 这两者的区别就是前者使用的是一个具体的类作为变量类型，而后者使用的是一个抽象的类型（LIst 是一个 java 接口）作为类型,后者的的好处
    // 当决定将 Vector()的类型转换成 ArrayList 类型的时候，改动的代码更加的少
    // list emplyee = new ArrayList();
    // 这样一来，程序具有一个更加好的灵活性，因此除了调用构造子一行语句外，程序的其余部分根本察觉不到什么变化（假设程序不需要多线程同步化）
    // 只要一个被引用的对象存在抽象类型，就应当在任何引用此对象的地方使用抽象类型，包括参量的类型声明，方法返回类型的声明，属性变量的类型
    // 声明
    // 前面的两个例子同时演示了对象的创建的过程，显然，emplyees 的静态类型是抽象的，但是实例创建过程所调用的构造子仍然必须是具体的类型的构造子
    // 一般而言，在创建一个对象时，java语言要求使用 new 关键词以这个类的本身，现是一旦这个对象已经被创建出来，那么就可以灵活的使用这个对象的抽象
    // 类型来引用它，因此，java 语言中创建一个对象的过程是违背了开闭原则以及依赖倒转原则的，虽然这个类被创建出来以后，可以通过多态性使得
    // 客户端依赖于其他抽象 的类型
    // 正是由于这个原因，设计模式给出了多个创建模式的，特别是几个工厂模式，用于解决对象创建过程的依赖倒转问题
    // 怎样做到依赖倒转原则
    // 以抽象方式耦合的依赖倒转原则的关键，由于一个抽象耦合关系涉及具体的从抽象继承，并且需要保证在任何引用到的地方都可以换成其他的子类
    // 因此，里氏替换原则是依赖倒转原则的基础
    // 在抽象层次上的耦合虽然有灵活性，但是也带来了额外的复杂性，在某些情况下，如果一个具体的类发生了变化的化可能性非常的小，那么抽象
    // 的好处就十分有限了，这里使用具体的耦合反而会更加好的
    // 依赖倒转原则是 oo 设计的原则，设计模式的研究和应用是以依赖原则 指导原则，下面就举个例子的来加以说明
    // 正如前面所谈到的，应当使消费对一个对象的客户端只依赖于对象的抽象类型，而不是他的具体的类型，但是 java 语言要求在将一个具体的
    // 实例化的时候，必须调用这个具体的类的构造子，所以 java 语言给出的是类的实例化方法无法做到的只依赖于抽象的类型
    // 但是设计模式给出的也解决这个问题的可行性方案就是工厂模式，工厂方法的模式是几个工厂模式中最典型的一个，下图就是工厂方法的简略图
    // 工厂模式将创建一个类的实例化过程封装起来，消费这个实例的客户端仅仅得到实例化的结果，以及这个实例化的抽象过程，当然任何方法都无法
    // 回避 java 语言所要求的 new 关键字和直接调用具体的类的构造子的做法，简单的工厂模式将这个违反了开闭原则以及依赖倒转原则的你无法封装
    // 到了一个类里面，而工厂方法模式将这个违反原则的做法推迟到了具体的工厂角色中，如下图所示
    //
    // 模版方法模式
    // 模版方法模式是依赖原则的具体的实现，模版方法模式的生产力类图如右图所示
    // 在模版方法里面，有一个抽象的类将重要的宏观的逻辑以具体的方法以及构造子的形式实现，然后声明一些抽象的方法来挥剑子类实现这些剩余的
    // 具体的细节上的逻辑，不同的子类 可以以不同的方式实现这些抽象的方法，从而对剩余的逻辑有不同的实现，模版方法模式支持依赖原则，如下图所示
    // 具体的子类不能影响抽象的宏观逻辑，而抽象的改变则会导致细节的逻辑的改变
    // 迭代子模式
    // 迭代的模式用一个工厂谢谢学姐向客户端提供了一个聚集的内部迭代功能，客户端得到的是一个 Iterator 抽象类型，并不知道迭代子具体的实现
    // 以及聚集的对象的内部结构，迭代模式的生产力类图如下图所示
    // 这样一来，聚集的内部结构的改变就不会涉及到客户端，从而实现了对抽象的接口的依赖
    // Java 对抽象类型的支持
    // 在 java 语言中，可以定义一种抽象的类型，并且提供这一抽象的类型的各种具体的实现
    // 实际上，java 语言提供了两种而不是一种机制做到了这一点，它们就是 java 接口和 java 抽象类
    // java 接口和抽象类的区别如下
    // 这两者最明显的区别，就是在于 java 抽象类可以提供某些提供某些方法的部分实现，而 java 接口则不可以，这大概是 java 抽象唯一的优点
    //  如果向一个抽象类加入一个新的具体的方法，那么所有的子类型一下子就都得到了这个新的具体的方法，而 java 接口做不到这一点，如果向一个接口
    // 加入了一个新的的具体的方法，而 java 接口做不到这一点，如果向一个 java 接口加入一个新的方法的话，所有的实现这个接口的类就不能全部成功
    // 的编译了，因为它们没有实现这个新的声明的方法，这显然是 java 接口的一个缺点
    //
    // 2. 一个抽象类的实现只能由这个抽象类的子类给出，也就说，这个实现的处在抽象类所定义出的继承等级结构中，由于 java 语言限制了一个类只能
    // 从最多的一个超类继承，因此将抽象类作为类型的定义工具的效能大打的折扣
    // 从代码重构的角度上讲，将一个单独的 java 具体的类重构成一个 java 接口的实现是很容易的，
    // 而为一个已经有的具体的类添加一个 java 抽象类作为抽象类型却不是那样的容易，因为这个具体的类有可能已经是一个超类，这样一来，这个新
    // 定义的类只能继续向上移动，变成这个超类的超类，如此循环，最后这个新定义的抽象类处于整个类型等级结构的最上端，从而使得等级结构
    //
    // 3代码重构的角度上来讲，将一个单独的 java 具体的类重构成一个 java 接口的实现是很容易的，如下图所示，只需要声明一个 java 接口，并将
    // java 接口是定义混合类型的理想工具，所谓混合类型，就是一个类的主类开之外的将要类型，一个混合类型表明一个类不仅仅具有某个主要类型的
    // 行为，而且其他的将要类型的行为
    // 比如 Hashtable 类就是具有多个类型，它的主要的类型是 map,这是一种 java 聚集，而 Cloneable 的状况中则给出一个次要的类型，这个类型
    // 说明这个类的实例是可以安全的克隆的，同样的 Serializable 也是一个次要的类型，它表明这个类的实例是可以串行化的，如右图所示
    // 联合使用 java 接口和 java 抽象类
    // 由于 java 抽象类具有提供缺省的实现的优点，而 ava 接口具有其他的所有的优点，所以联合使用是一个很好的选择
    // 首先声明类型的工作仍然是 java 接口承担的，但是同时给出的还有一个 java 抽象类，为这个接口给出的一个缺省的实现，其他的属于这个抽象类型
    // 具体的类可以实现这个 java接口，也可以选择继承自这个抽象类
    // 如果一个具体的类直接实现这个 java 接口的话，它就必须自行实现所有的接口，相反，如果它继承自抽象类的话，它可经活动一些不必要的方法，因为它可以从抽象类
    // 中看上去得到这些方法的缺省的实现
    // 如果需要向 java 接口加入一个新的方法的话，那么只要同时向这个抽象类加入这个方法的一个具体实现就可以了，因为所有继承息这个抽象类的子类
    // 都会从这个抽象类得到这个具体的方法
    // java 语言中的 API 中也是用了这种缺省的适配模式，而且全都最遵循一定的命名规范，Abstract+接口名，比如对于接口的 Collection，抽象
    //  类的名字是 AbstractCollection，如图所示
    //其他的例子还有 Map 与 AbstractMap，List 与 AbstractList，以及 Set 与 AbstractSet 等，这种联合的使用接口和抽象类的做法可以充分的
    // 利用这两者的优点和，克服两者的缺点
    // 一个例子账号，账号的种类和账号的状态
    //  为了创建一个实例，必须直接调用此具体的类的构造子，如果需要将一个具体的类替换成为另一个具体的类，而不改变创建此实例的方法，只有一个办法
    // 只胡一个办法，那就是将创建责任下的推给一个工厂类
    // 这个例子里，Acount 类依赖于 AcountType 和 AcountStatus 两个抽象类型，而不是它们的子类型，AcountType 有两个子类型
    // 储蓄账号： 以 Saving 具体的类代表
    // 支票账号，以 Checking 具体的类代表
    // AcountStatus 也有两个类型
    // 开状态： 以 Open 具体的代表
    // 超支状态： 以 Overdrawn 具体的类代表
    // Acount 类并不依赖于具体的类，因此当有新的具体的类加入到系统中来的时候，Acount 类不必改变，例如，如果系统引进了一种新的型号的
    // 接口隔离原则
    // 接口隔离原则讲是是，使用多个专门的接口比使用一个单一的接口更加的好
    // 从一个客户类的角度来讲，一个类对另一个类的依赖性应当建立是最小的接口上
    // 正如本书在专题的声明接口一样，一章所指出的那样，人们据说听接口，往往是不同的两种东西，一种是指 java语言的所有的严格定义的
    // interface接口，就是 java 接口，另一种就是一个类型所具有的方法的特征集合，对于这种接口，只是逻辑上的一种抽象
    // 对应于这两种不同的用词，接口隔离原则表达的以及含义都有所不同
    // 角色的合理划分
    // 将接口理解成一个类所提供的所有的方法的集合，也就是说一种在逻辑上才存在的概念，这样的话，接口的划分就是直接带来类型的划分
    // 一个接口相当于剧本中的一种角色，而引角色在一个舞台上由哪一个演员来演则相当于接口的实现原则，因此，一个接口应当简单的代表一个
    // 角色，而不是多个角色，如果系统涉及到多个角色的话，那么每一个角色应当都由一直特定的接口代表
    // 为了避免混淆，本书将所有的角色划分的原则叫做角色的隔离原则
    // 定制服务
    // 将接口理解成狭义的 java接口，这样一来，接口隔离原则讲的就是同一个角色提供宽，窄，不同的接口，以对付不同的客户端，这种办法
    // 在服务行业叫做定制服务，这也是本书给出的这种诠释了一个名字
    // 在上面的示意图中，有一个角色 Service 以及三个不同的客户端，这三个客户端需要的服务都是稍稍不同的，因此系统分别为它们提供了三个不同的
    // java接口，即 IService1,IService2，以及 IService3 ，显然，每一个 java 接口都是仅仅将客户端的需要的行为暴露给客户端，而没有将
    // 客户端所不需要的行为放到不同的接口中
    // 因此一个符合逻辑的推断，不应当将几个不同的角色都交给同一个接口，而应当交给不同的接口
    // 一个没有经验的设计师往往想交节省接口的数目，因此将一些看上去差不多的接口合并，一些人将这看做是代码的优化的一部分，这个是错误的
    // 准确而恰当的划分角色以及所对应的接口，是面向对象设计的一个重要的组成部分，将没有关系的接口合并在一起，形成一个大的臃肿的接口，
    // 这绝对是对接口的污染
    // 也迪米特法则的关系
    //迪米特法则要求任何的一个逻辑实例，尽量的不要和外界通信，即使必须进行通信，也应当尽量限制通信的，也应当通信的广度和深度
    // 显然，定制服务原则拒绝给客户端提供需要的行为，是符合迪米特法则的
    // 众在自己的环境中不不煽情发现问题和寻找问题的解决方案的时候，发现有一些问题及其解决方案不断的麻烦的面孔重复出现，但是这引进不同的面孔
    // 后面有着共同的本质，这些共同的本质就是模式
    // 那么模式是不是在某种环境下对某个问题的答案呢
    // 这不完全对，模式所描述的问题及问题的答案都应当具有代表性的的问题和问题的答案，所谓问题具有代表性，就是说它不同的形式重复出现，
    // 允许使用者举一反三，将它的应用到不同的环境中去，为了其他的人交流，通常还要示给这个问题的问题的答案一个名字
    // Alexander 认为，所有的生物，有用之物均包含有如下的质，自由性，整体性，完备性，舒适性，持久性，开放性，弹性，可变性，以及可塑性，
    // 使人感到充满活力，给人以满足感，并最终改善人类的生活
    // 门是一个通向质的管道，门 通过一个普遍的模式语言来体现的，这个模式语言使设计师能够创建多种形式上的设计，以满足多方面的需求
    // 门是普遍存在的，是这些模式之间的关系或是模式的以太，充满着一个特定的域
    // 道 又被称做是永恒的道
    // 利用道，从门演化到质，就是将一些特定的模式按照一定的顺序应用到系统的设计上的循序渐进的过程，
    // 一个角色隔离的原则的例子
    // 本节代码重构的角度讨论怎样将一个臃肿的角色重新分割成更加合适的较少的角色
    // 全文查询引擎的系统设计
    // 反面的例子
    // 首先，下图所示的一个不好的解决方案，一个叫做 BadExample 接口负责所有操作，从提供搜索建立索引的功能，甚至包括搜索结果集合的功能
    // 均在一个接口内提供
    // 这个解决方案违反了角色分割原则，把不同的功能接口放在一一起，由一个接口给出的包括搜索器角色，索引生成器角色以及搜索结果集角色在所有的
    // 角色中
    //
    // 角色的分割
    // 那么，遵守接口的隔离原则的做法是怎样的呢
    // 从图中可以看出，扫完引擎功能被分割成三个角色
    // 搜索器角色
    // 索引生成器角色
    // 搜索结果集角色
    // 以索引生成器角色为例， fileIndexer 类代表对诸如 *.txt,*.html,*.doc 以及*.pdf 等文件类型的数据生成全文索引 ，而 RDBIndex 则针对
    // 关系数据库的数据进行全文索引，这两个实现扮演的同为索引生成器的角色，就好像扮演同样的角色的两个不同的演员一样
    // 搜索器角色则是与索引生成器角色完全不同的角色，它提供用户全文搜索功能，用记传进一些关键字，搜索器角色则返回一个 ResultSet 对象
    // 搜索结果集角色就是 ResultSet，它给用户提供对集合进行迭代的韩文功能，如 first() ，将水洗标移到集合的一个元素，last()将光标移动
    // next()将光标移到集合成下一个元素，而 getExcerpt()则返回当前的记录的摘要，而 getFullRecord()则记录了全文的返回
    // 定制服务，也是一个重要的设计原则，它的意思是说，如果客户端仅仅需要某一个方法的话，那么就应当向客户端提供这些需要的方法，而不要提供
    // 不需要的方法
    //  这样做的效果
    // 1.这样的做的好处,从美学的角度上考虑，这是一个很好的做法，从这样的一个设计可以看出，设计师花了很多的时间在划分这些接口上面
    // 2.系统的可维护性，向客户端提供了一个 public 接口是一种承诺，一个 public 接口一旦提供，就很难撤回，作为软件提供商，没有人愿意
    // 做出过多的承诺，特别是不必要的承诺，过多的承诺会给系统的维扬带来不必要的负担
    //  如果这些接口仅仅是提供给公司内部的系统使用，那么将这些接口隔离开来，也可以降低维护的成本，因为如果一旦所提供的服务出现变化的话，
    // 客户端就会受到影响，
    // 备忘录模式：的用意就是在不破坏封装的条件下，捕捉到一个对象的状态，并将之韶华，从而可以将来合适的时候把这个对象还原到存储起来的状态
    // 备忘录模式的简略类图就是如下所示
    // 在这里，不破坏封装是一个关键词，为了做到这一点，心谤腹非使备忘录对象向外界提供双重接口，也即一个窄接口和一个宽接口
    // 宽接口是为发起人角色准备的，因为这个备忘录角色所存储的状态就是属于这个发起的角色的，而这个角色需要访问备忘录储存的信息以便恢复自己的状态
    // 迭代子模式
    // 迭代子模式提供了一个迭代的子对象，使得客户端可以有顺序的访问一个聚集中的元素，而不必暴露聚集的内部的表现，迭代子模式的都没问题图如下图所示
    // 上面的这个子系统的客户端和系统内部的迭代子系统接口遍历聚集的元素，而迭代子对象则需要知道聚集对象的内部的结构信息
    // 因此，聚集对象向不同客户端提供了不同的接口，一个宽接口，提供给迭代子对象，另一个窄接口，提供给系统的客户端
    // 关于迭代子模式，
    // 合成聚合复用原则，经常又叫做合成利用原则，合成聚合复用的原则又叫一个新的对象里使用的一些已有的对象，使之成为新的对象一部分，新的对象
    //  新的对象通过这些对象的委派过到复用自己的目的
    // 这个设计原则有另一个简短的表述，要尽量使用合成聚合，尽量不要使用继承
    // 合成一词的使用很广泛，经常导致混淆，看看合成和聚合的区别
    //























}