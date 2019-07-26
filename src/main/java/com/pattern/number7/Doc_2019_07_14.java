package com.pattern.number7;

public class Doc_2019_07_14 {

    // 工厂方法模式
    // 工厂方法的类的创建模式，又叫做虚拟的构造子模式或者多态性工厂模式
    // 工厂方法模式的用意定义一个创建产品的对象工厂接口，将实际创建工作推迟到类中
    // 简单工厂模式的优缺点
    // 正如本书在简单工厂模式一章里介绍过的，工厂模式 有简单工厂模式，工厂方法模式和抽象工厂模式几种
    // 在简单的工厂模式中，一个工厂类处于对产品类的实例化的中心位置上，它知道每一个产品，它决定哪一个产品类就当被实例化，这个模式的优点
    // 是允许客户端相对于产品的创建过程，并且在系统引入新产品的时候无需修改客户端，也就是说，它的某种程度上支持开闭原则
    // 这个模式的缺点是对开闭原则支持不够，因为如果有新的产品加入到系统中去的时候，就需要修改工厂类，将必要的逻辑加入到工厂类中
    // 工厂方法的模式的引进
    // 本章要对讨论工厂方法模式的简单工厂模式的进一步抽象和推广，由于使用了多态性，工厂方法模式保持了简单的工厂模式的优点，而且克服了它的
    // 缺点
    // 首先，在工厂方法模式中，核心的工厂类不再负责所有的产品的创建，而是将具体的创建工作交给子类去做，这个核心的类则摇身一变，成为一个
    // 一个抽象工厂角色，仅仅负责给出具体的子类必须实现的接口，而不去接触哪一个产品的类应当被实例化的这种细节
    // 这种进一步抽象化的结果，使得这种工厂方法模式可以用来允许系统在不修改具体的工厂角色的情况下引进新的产品，这一个特点无疑使得工厂工具有
    // 超过简单工厂模式的优越性
    // 平行的等级结构
    // 在一个系统设计中，常常首先有产品的角色，然后有工厂的角色，在可以应用工厂方法的模式情况下，一般都会有一个产品的等级结构，由一个
    // 甚至是多个抽象产品和多个具体的产品组成，产品的等级结构如图所示，树图中阴影是树枝型节点
    // 在上面的产品等级结构中，出现了多于一个抽象产品类，以及多于两个层次，这其实是真实系统中常常出现的情况，当将工厂方法模式应用于这个
    // 系统升级中去的时候，常常彩的一个做法是按照产品的等级结构设计一个同结构的工厂等级结构，工厂的等级结构如下图所示
    // 树图中的阴影是树枝型节点
    // 然后由相应的工厂角色创建相应的产品角色，工厂方法模式的应用如下图所示，图中的虚线代表的是创建依赖关系
    // 工厂方法模式并没有限制产品的等级结构层数，一般书籍中都以两个层次为例，第一层是抽象产品层，第二层是具体的产品层，但是实际的系统中
    // 产品常有更加复杂的层次
    // 结构与角色
    // 为了说明工厂方法模式的结构，下面以一个最简单的情形为例，这个示意性类图如下图所示
    // 抽象工厂角色：担任这个角色的工厂方法模式的核心，它是应用程序无关的，任何的模式中创建的工厂方法必须实现这个接口，在上面的系统中，
    // 这个角色由于java接口的Creator扮演，在实际的系统中，这个角色是常常使用抽象的java类实现
    // 具体的工厂角色：担任这个角色的实现了抽象工厂接口的具体的java类，具体的工厂角色含有应用密切相关的逻辑，并且受到应用程序的调用以
    // 创建产品对象，在本系统中给出了两个这样的角色，也就是具体的java类ConcreteCreator1和ConcreateCreator2
    // 抽象产品角色，工厂方法械所创建的对象是超类型的，也就是产品对象共同父类或共同拥有的接口，在本系统中，这个角色由java接口的product
    // 扮演，在实际的系统中，这个角色也常常使用抽象的java类的实现
    // 具体的产品角色：这个角色实现了抽象产品角色所声明的接口，工厂方法模式所创建的每一个对象都是某个具体的产品角色实例
    // 在本系统中，这个角色由具体的java类ConcreateProduct1和ConCreateProduct2扮演，它们都实现了java接口的product
    // 最后， 为了说明这个系统的使用办法，特地的引进了一个客户端角色Client，这个角色的创建工厂对象，然后调用工厂对象的工厂方法创建了相应的和产品对象
    // 工厂方法模式和简单的工厂模式
    // 工厂方法模式和简单的工厂模式在结构上的不同是很明显的，工厂方法模式的核心是个抽象的工厂类，而简单的工厂模式把核心放在一个工具类上，
    // 工厂方法模式可以允许很多的具体的工厂类从抽象工厂类中创建行为继承下来，而可以成为多个简单的工厂模式的综合，进而推广了简单的工厂模式
    // 从而可以成为多个简单的工厂模式的综合，从而可以成为多个简单工厂模式的综合，进而推广了简单的工厂模式
    // 工厂方法模式退化后，可以变得很像简单工厂模式，设想如果非常确定一个系统只需要一个具体的工厂类，那么就不妨将抽象工厂合并到具体的工厂类
    // 中去，由于只有一个具体的工厂类，所以不妨将工厂方法改为静态方法，这个时候，就得到了简单的工厂模式
    // 与简单的工厂模式中的情况一样的是，ConcreateCreator的factory()方法返回的数据类型是抽象类型Product,而不是哪一个具体的产品类型
    // 而客户端也不必知道所得到的产品的真实类型，这种多态设计将工厂类选择创建哪一个产品对象，如果创建这个对象的细节完全封装在具体的
    // 工厂类的内部
    // 工厂方法模式之所以有一个别名叫多态工厂模式，显然是因为具体的工厂类都有共同的接口，或者有共同的抽象父类
    // 如果系统需要加入一个新的产品，那么所需要的就是向系统中加入一个这个产品类以及它所对应的工厂类，没有必要修改客户端代码，也没有必要
    // 修改抽象工厂角色或者其他已有的具体的工厂角色，对增加的新的产品类而言，这个系统完全支持开闭原则
    // 工厂化
    // 使用java接口或者java抽象类
    // 抽象工厂角色和抽象产品角色都可以选择由java接口或者java抽象类来实现
    // 如果具体的工厂角色具有共同的逻辑，那么这些共同的逻辑就可以身上移动到抽象工厂角色中，这就意味着抽象工厂角色应当用一个
    // java抽象类来实现，并由抽象工厂角色提供默认的工厂方法，相反的话，就应当用一个java接口实现，并由抽象工厂角色提供默认的工厂方法
    // 相反的话，就应当用一个java接口实现，对抽象产品角色也是一样的，共同的逻辑应当移动到超类中去，如下图所示
    // 抽象工厂角色可以规定出多于一个工厂方法，从而使具体的工艺品硬解色实现这些不同的工厂方法，这些方法可以提供不同的
    // 商业逻辑，以满足提供不同的产品对象的任务
    // 最后，在给相关的类和方法取名字时，应当注意让别人一看便知道在系统设计中使用了什么工厂模式
    // 使用java接口或者java抽象类
    // 抽象工厂角色和抽象产品角色都可以选择由java接口或者java抽象类来代替
    // 如果具体的工厂角色具有共同的逻辑，那么这些共同的逻辑就可以向上移动到抽象工厂角色中，这也就意味着共同的逻辑，那么这些共同的
    // 共同的逻辑应当移动到超类中去
    // 关于java抽象类与java接口的区别，读者可以参阅配的专题抽象类，和专题java接口两章
    // 使用多个工厂方法
    // 抽象工厂角色可以规定出多于一个工厂方法，从而具体的工厂角色实现这些不同的工厂方法，这些方法可以提供不同的商业逻辑，以满足提供不同
    // 产品对象的任务
    // 产品的循环使用
    // 读者可以参阅本书在工厂方法模式，一章中做过的类似分析
    // 在前面给出的示意性系统中，工厂方法总是调用产品类的构造子以创建一个新的产品实例，然后将这个实例提供给客户端，而是实际的情形中，工厂
    // 方法所做的事情可以相当的复杂，
    // 一个常用的复杂工厂逻辑就是循环的使用产品对象，如果产品对象可能由内部状态表征的话，那么对每一个可能内部状态，往往仅需要
    // 一个产品实例
    // 这个时候，工厂对象就需要将已经创建过的产品对象登记到一个聚集里，然后根据客户端所请求的产品状态，向聚集进行相询，如果聚集中有这样的
    // 产品对象，那么就直接将这个产品对象返回给客户端，如果聚集中没有这个产品对象，那么就创建一个新的满足要求的对象，然后将这个
    // 对象登记到聚集中，再返回给客户端
    // 亨元模式使用了这样的我一的工厂模式，如下图所示
    // 多态性的丧失和模式的退化
    // 一个工厂方法模式的实现依赖于工厂角色和产品角色的多态性，在有些情况下，这个模式可以出现退化，其特征就是多态性的丧失
    // 工厂方法的创建对象
    // 正如前面所讨论的，工厂方法不一定每一次都返回一个新的对象，但是所返回的对象一定是他自己创建的，而不是一个外部对象里创建的
    // 然后传入到工厂对象中
    // 但是，这是否意味着凡是返还一个新的对象的方法都是工厂方法呢? 不一定
    // 工厂方法返回的应当是抽象类型，而不是具体的类型，只有这样才能保证针对产品的多态性，
    // 但是它所返回的对象一定是他自己创建的，而不是一个外部对象里面创建，然后传入到工厂对象中的
    // 但是，这是否意味着凡是返还一个新的对象方法都是工厂方法呢，不一定
    // 工厂方法返回还的类型
    // 工厂方法返还的应当是抽象类型，而不是具体的类型，只有这样，才能保证针对产品多态性，调用工厂方法的客户端可以针对抽象编程，依赖于一个
    // 抽象产品类型，而不是具体的产品类型
    // 在特殊情况下，工厂方法仅仅返的是一个表现针对产品角色的多态性的丧失，客户端从工厂方法静态类型可以得知将要得到的是什么类型的对象，
    // 而这个违背了方法模式的用意
    // 当工厂方法模式发生上面退化时，就不再是工厂模式了，在任何一个面向对象的这么认为里，都会有大量的方法返回一个新的对象，很多的设计师交过种方法
    // 都叫做工厂方法，但是并不是所有的这种工厂方法都是工厂方法模式，本章后面的
    // 工厂对象应当有一个抽象超类型，应当数个具体的工厂类作为一个抽象的超类型的具体的子类存在于工厂等级结构中，
    // 一个工厂方法模式的实现依赖于工厂角色和产品角色的多态性，在有些情况下，这个模式可以退化，其特征就是多态性的丧失
    // java语言中工厂方法模式的例子
    // 工厂方法模式是一个很常见设计模式，可以在java语言API的和个角落里找到，
    // 在Java聚集中的应用中
    // java聚集是java1.2版本提出来的，多个对象聚集在一起总体称为集聚，聚集对象是能够包容一组对象容器对象，所有的java聚集都实现一个Iterator类型
    // 对象，如下图所示
    // 一个具体的java聚集对象会通过这个Iterator()方法接口返还一个具体的Iterrator类，可以看出，这个Iterator()方法就是一个工厂方法
    // 这个Iterator接口是迭代子模式应用，关于迭代模式，
    // 在java聚集的应用中
    // java的列是特殊的java聚集，所有的java除了实现Collection接口外，还实现一个List接口，这个List接口给出了两个工厂方法，一个是上面已经
    // 讨论过的Iterator()方法，一个是Iterator类型的对象，另一个是listIterator()方法，返还的是一个ListIterator类型的对象
    // 这个Iterrator的状况中和ListIterator均是迭代子模式的应用，关于迭代子模式以及java语言对API对迭代子模式的支持，请参见本书的迭代子模式
    // 以及专题java对迭代子模式的支持
    // URL 与 URLConnection的应用
    // URL类代表的是一个Uniform Resource Locator ，也就是互联网上的资源的一个指针，而这个资源可以是一个简单的文件或者目录，也可以是一个更加
    // 的对象，比如向数据库或者搜索引擎查询对象，http://www.yahoo.com就是一个合法的URL
    // URL 对象提供了一个叫做openConection()的工厂方法，这个工厂方法返还一个URLConnection对象，而URLConnection对象则代表一个与远程对象的
    // 连接，URLConnection是所有代表应用系统是一个url的连接对象的超类，使用URLConnection对象针对一个URL进行读写操作
    // 为了说明URL作为一个工厂类，而URLConnection作为一个抽象产品类的使用，下面提供一个简单的例子
    // 为了说明URL作为一个工厂类，而URLConnection作为一个抽象产品类的使用，下面提供一个简单的例子，如下
    // 模版方法模式
    // 工厂方法模式常常与模版方法模式一起联合使用，读者可能会问，读者可能会问
    // 工厂方法模式常常与模版方法模式一起联合使用，读者可能会问，这两种模式一个是关于对象的创建，另一个是关于对象的行为，为什么会常常一起使用
    // 原因不难理解，第一，两种模式都是基于方法，工厂方法模式是基于多态性工厂方法，而模版方法将创建工厂推延给子类 ，工厂方法模式将创建
    // 工作推给了子类，模版方法模式将剩余的逻辑交给了子类，模版方法模式类图如图所示
    // 从各个工厂角色组成的工厂等级结构上看，抽象工厂角色中可以加入一些模版方法，代表某个顶级逻辑，而这个模版方法调用几个基本的方法，这些
    // 基本方法中就可以有一个或者多个工厂方法，这些工厂方法代表剩余的逻辑，交给具体的子类实现
    // 模版方法本身也可能是工厂方法，它的对象创建过程就是所谓的顶级结构，而这个过程就可以分成数个具体的步骤，每一个步骤都是顶级逻辑，交给
    // 具体的组成部分
    // 使用模版方法模式可以，代表某个顶级的逻辑，而这个模版方法调用几个基本的方法，这些方法基本方法中就可以有一个或多个工厂方法，这些
    // 工厂方法代表剩余的逻辑，
    // MVC模式并不是严格意义上的设计模式，而是更加高层次的架构模式，mvc 模式可以分解成几个设计模式的组合，包括合成模式，策略模式，观察
    // 者模式，也有可能是装饰模式，调停模式，迭代模式以及工厂模式等
    // 关于mvc模式时，讨论可以参考本书的专题，MVC模式也用户输入数据检查，mvc模式结构图如
    // 工厂方法模式总是涉及到两个等级结构中的对象，而这两个等级结构可以分别是MVC模式中的控制器和视图，一个MVC模式可以有多个控制器和多个视图
    // 控制器端可以创建合适的视图端，就如同工厂角色创建合适的对象角色一样，模型端可以充当这个创建过程中的客户端
    // 如果系统内只需要一个控制器，那么，设计可能简化为简单的工厂模式
    // 亨元模式
    // 正如本章关于工厂方法模式的实现，一节中，讨论过，亨元模式使用了带有循环逻辑工厂方法，亨元模式的简略类图如下所示
    // 备忘录模式
    // 亨元模式使用了一个聚集来登记所创建的产品对象，以便可以通过查询这个聚集到和共享已经创建的产品对象，这就是备忘录模式的应用，备忘录模式
    // 的简略图如下图所示
    //



}