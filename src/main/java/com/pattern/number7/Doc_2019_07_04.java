package com.pattern.number7;

public class Doc_2019_07_04 {
    //对可维护性的支持
    // 仍然以 PerterCoad 所给出的三个设计目标为出发点进行阐述
    // 首先，恰当的提高系统的可复用性，可以提高系统的可扩展性，允许一个具有同样的接口的新的类代替旧的类，是对抽象接口的复用，客户端面依赖
    // 于一个抽象的接口，而不是一个具体的实现类，使得这个具体的类可以被另一个具体的类所取代，而不影响到客户端内容
    // 系统的可扩展性是由开闭原则，里氏替换原则，依赖倒转原则和组合聚合利用原则所保证的。
    // 其次，恰当的提高系统的可复用性，可以提高系统的灵活性，在一个设计得当的系统中，第一个模块都相对于其他的模块独立的存在，并只保证与其他
    // 模块尽可能少的通信，这样一来，在其中某个模块发生代码修改的时候，这个修改的压力不会传递到其他的模块中。
    // 系统的灵活性是由开闭原则，迪米特原则，接口隔离原则所保证的。
    // 最后，恰当的提高系统的可复用性，可以提高系统的可插入性，在一个符合开闭原则的系统中，抽象则封装了与商业逻辑相关的重要行为，这些行动
    // 具体的实现由实现层给出，当一个实现类不再满足需要，需要另一个实现类取代的时候，系统的设计可以保证旧的类可以被拔出，新的类可以被插入
    // 系统的可插入性是由开闭原则，里氏替换原则，组合，聚合复用原则以及依赖倒转原则保证。
    // 这就是说，本书将要介绍的这些原则在提高一个系统的可维护性的同时，提高这个系统的可复用性的指导原则，按照这个原则进行系统设计，就可以
    // 抓到同时奔跑的兔子。
    // 设计原则有哪些
    // 本书在后面将要介绍设计原则如下
    // 开闭原则，
    // 里氏替换原则
    // 依赖倒转原则
    // 接口隔离原则
    // 组合聚合利用原则
    // 迪米特法则
    // 这些设计原则首先都是复用的原则，遵循这些原则可以有效的提高系统的可复用性，同时提高系统的的可维护性。
    // 学习设计模式对复用性与可维护性的帮助。
    // 凡是有理论的地方，就有如何给当地将理论应用到实践中去的问题，设计模式是对学习 OO 设计原则的具体的指导。
    // 本书将要介绍的设计模式可以划分成创建模式，结构模式和行为模式三大类别，专门讲解的设计模式有26个，在讲解过程中所涉及到的模式就更加的多了
    // 设计模式本身并不能保证一个系统的可复用性和可维护性，但是通过学习这些设计模式工的思想可以有效的保证设计师的设计风格，设计水平，并促进
    // 与同行之间的沟通，从而帮助设计师提高系统的利用性和可维护性
    // 老子云，善为士者不武，如果士，就像软件系统的设计师，武，就是软件系统的大规模的修改，那么老子说的就是，老子说的所谓的不武，但是软件
    // 设计中的复用
    // 老子还说，天下有道，却走马以粪，天下无道，戎马生于效，也就是说，天下太平，好的跑马却在田间耕作，当天下不太平时，战马在战场上生下小驹。
    // 这相当于说，当一个软件系统是一个复用有道，易于维护的系统时，将新的性能加入到系统中去，或者对于一个已有的性能进行修改是不困难的事情，
    // 因此，代码高手就无法发挥作用，而当一个软件是一个设计低劣，可维护性差的系统时，代码高手就必须连续作战，才能将新的性能加入到系统中去
    // 或者对于一个已有的性能进行修改
    // 开闭原则讲的是，一个软件实体应当对扩展开放，对修改关闭，这一个原则早由英文原文是
    // 这个原则说的就是，在设计一个模块的时候，应当使用这个模块可以在不被修改的前提下被扩展，换言之，应当在可以不必修改源代码的情况下，改变
    // 这种模块的行为
    // 这话听上去好像是矛盾的，但是实际上配将在后面给个几个面向对象的设计原则和设计模式中很具体的如何在设计上做到这一点
    // 所有的软件系统都有一个共同的性质，即它们的需求会随着时间的变化而变化，在软件系统面临新的需求时，系统的设计必须是稳定的，满足开闭
    // 原则系统会给系统带来无可比似的优越性。
    //  通过扩展已有的软件系统，可以提供新的行为，以满足对软件的新的需求，使变化中的软件系统有一定适应性和灵活性。
    //  已有的软件模块，特别是最重要的抽象层模块不能再修改，这就使变化中的软件系统有一定的稳定性和延续性。
    // 具有这两个优点的软件系统是一个高层次上实现复用的系统，也是一个易于维护的系统。
    // 玉帝招安美猴王。
    // 招安之法的关键便是不允许更改现有天庭秩序，但是允许将妖猴纳入到现有的秩序中，从而扩展了这一次序，用面向对象的语言来讲，不允许更改
    // 的是系统的抽象层，而允许修改的是系统的实现层。
    // 太玄 论 固革
    // 西汉杨雄的太玄 一书中说，知固而不知革，物失其则，知革而不知固，物失其均，
    // 一个系统对修改关闭，就是太玄所说的固，而一个系统对扩展开放，就是太玄所说的革，如果一个系统不可扩展，就会失去他的使用价值，而一个
    // 系统动辄需要修改，便会失去他的重心
    // 抽象化是关键
    // 解决问题是关键在于抽象，在像 Java 语言这样的面向对象的编程语言里，可以给系统定义一个一劳永逸的，不再更改的抽象设计，此设计允许有
    // 无穷无尽的行为在实现层被实现，在 Java 的语言里，可以给出一个或多个抽象 Java 类或者 java接口，规定出所有的具体类必须提供的方法
    // 的特征作为系统设计的抽象层，这个抽象层预见的所有的可能扩展的，因此，在任何情况下都不会改变，这就使得系统的抽象层不需要修改
    // 从而满足对开闭原则的第二条，对修改关闭
    // 同时，由于抽象层导出的一个或多个新的具体的类可以改变的行为，因此系统的设计对扩展是开放的，这就满足了开闭原则的第一条
    // 对可变性的封装原则
    // 开闭原则如果从另一个角度来讲，就是所谓的对可变性的封装原则，对可变性的封装原则，讲的就是找到一个系统的可变的因素，将之封装出来
    // 在中说，考虑到你的设计中可能会发生变化，与通常的焦点放到什么会导致设计的改变的思考方式正好相反，这一思路考虑到不是什么导致改变
    // 而是考虑到你允许什么发生变化而不让这一变化导致重新设计
    // 将这一思想用到了一句话总结为找到一个系统的可变因素，将它封装起来，并将它命名为对可变性的封装原则
    // 对可变性的封装原则就意味着这两点
    // 一种可变性不应当散落在代码的很多的角落里，而应当被封装到一个对象里面，同一种可变性的不同表象里，读者可以在设计模式中看到继承关系
    // 继承就当被看做是封装变化的方法，而不就当被座谈是从表般对象生成特殊对象的方法
    // 一种可变性不应当与另一种可变性混合在一起，如果读者留心书上所研究的这些设计模式的类图的话，就会发现所有的类图的继承结构一般不会
    // 超过两层，不然就意味着将这两中不同的可变性混合在一起
    // 显然，对可变性的封装原则，从工程的角度上讲解了如何实现开闭原则，如果能够将可变性封装原则，作为总的设计原则的话，那么就按照这个原则
    // 进行系统设计
    // 做到开闭原则不是一件容易的的工作，但是也是很多的规律可循的，这些规律也同样的设计原则的身份，显然，对可变性的封装原则，从工程的角度上
    // 讲解了如何实现开闭原则，如果能够将对可变性封装原则，作为总的设计原则的话，那么按照这个原则进行系统设计，遵守开闭原则
    // 尽管在很多的情况下，无法百分之百地做到了开闭原则，但是如果向这个方向上的努力能够得到部分的成功，也可以显著的改善一个系统的结构,
    // 与其他设计原则的关系
    // 里氏替换原则中说，任何基类可以出现的地方，子类一定可以出现
    // 里氏替换原则是对开闭原则的补充，正如前面所谈到的实现开闭原则关键步骤是抽象化，而基类与子类的继承关系就是抽象化的具体实现，所以里氏
    // 替换原则是对抽象化具体的步骤的规范
    // 一般而言，违反了里氏替换原则，也就是违背了开闭原则，反过来并不一定成立
    // 依赖倒转原则
    // 依赖倒转原则讲的就是，要依赖于抽象，但是不要依赖于具体的实现
    // 看上去依赖倒转原则与开闭原则有很大的相似之处，实际上，它们之间的关系是目标和手段之间的关系，开闭原则有很大的，开闭原则的目标，而达到
    // 这一目标的第一段是依赖倒转原则，换言之，
    // 要想实现开闭原则，就就当坚持依赖倒转原则，违反了依赖倒转原则，就不可能达到开闭原则的要求
    // 依赖倒转原则
    // 依赖倒转原则讲的是，要依赖于抽象，不要依赖于实现
    // 看上去，依赖原则与开闭原则有很大的相似之处，实际上，它们之间关系是目标和手段之间的关系，开闭原则是目标，而达到这一目标的手段是依赖
    // 原则，换言之，要想实现开闭原则，就应当是是支持依赖原则，违反了依赖倒转原则，就不能实现开闭原则的要求
    // 合成聚合复用原则
    // 合成/聚合的复用原则讲的就是，要尽量的使用合成聚合，而不是继承关系达到复用的目的，
    // 显然，合成/聚合复用原则是与里氏替换原则相辅相成的，两者又都是对实现开闭原则的具体步骤规范，前者要求设计师首先考虑合成聚合关系，
    // 后者要求使用继承关系时，必须确定这个关系符合一定的条件
    // 遵守合成聚合复用原则是实现开闭原则的必要条件，违反这一原则就无法使用系统实现开闭原则这一目标

    // 迪米特法则
    // 迪类物法则讲的就是，一个软件实体应当与尽可能少的其他的实体发生相互作用
    // 当一个系统面临功能扩展的时候，其中会有一些模块，它们需要修改压力比其他的一些模块要大，最后的结果可能是这些模块需要修改或者不需要修改
    // 但是无论是哪一种情况，如果这些模块是相对孤立的，那么它们就不会将修改的压力传递给其他的模块
    // 这就是说，一个遵守迪米特原则设计出来的系统在功能需要扩展时，会相对更加容易一些，会相对做到对修改关闭，也就是说，迪为特法则，是一
    // 条通向开闭原则的道路
    // 接口的隔离原则讲的是应当为客户端提供尽可能小的单独接口，而不要为提供大的总接口
    // 显然，接口的隔离原则与广义的迪米特法则是一个对软件实体与其他的软件实体通信的限制，广义的迪米特法则要求尽可能限制通信的深度，接口
    // 隔离原则所限制的通信的宽度，也就是说，通信尽可能的窄，
    // 显然，遵循接口的隔离原则与迪米特法则，会使一个软件系统在功能扩展的过程中，不会将修改的压力传递到其他的对象
    // 策略模式对开闭原则的支持
    // 策略模式讲的是，如果有一组算法，那么就将每一个算法封装起来，使得它们可以互换，显然，策略模式就是可以从对可变性的封装原则出发，
    // 达到一个开闭原则的一个范例
    // 在本书后面的策略模式，一章讨论了图书的销售的折扣计算问题，显然，根据描述，折扣是根据以下的第几个算法中的一个进行的
    // 算法一：对有些图书没有折扣，折扣算法对象返回0作为折扣值
    // 算法二，对有些图书提供的一个固定量的值为1元的折扣
    // 算法三：对有些图书提供一个百分提供一个百分比，比如一本书价格为20元，折扣百分比为7%,那么折扣值就是1.4元
    // 在采用策略模式之前，设计师必须从开闭原则出发，考察这个图书销售系统是否可能在将来的引入新的算法，如果有可能，那么就将当前所有的折扣
    // 算法封装起来，因为它们是可变的因素，系统必须能够在新算法出现时，很方便的将新的算法插入到已有的系统中，而不必修改已有的系统算法
    // 使用策略模式描述的话， 这些不同的算法都是用不同的具体的策略角色，从算法到算法三分别可以用 NodiscountStragegy 对象，FlatRateStratgy
    // 对象和 PercentageStrategy 对象描述
    // 为了使这些算法成为即插即用的对象，必须使用这些算法能够相互替换，而做到这一点是非常的关键的，就是给这些对象定义出相同的接口，也就是需要
    // 一个抽象的策略角色作为这些对象所组成等级结构的超类型，在现有的讨论图销售的折扣计算系统中，这引进抽象的策略角色由一个 java 抽象类
    // DisCountStrategy
    // 在其他的设计模式中体现
    // 对可变性原则的封装，实际上是设计模式的主题，换言之，所有的设计模式都是对不同的可变性封装，从而使系统在不同的角度上达到开闭原则要求
    // 下面就是给出的几个例子
    // 开闭原则要求系统允许产品加入到新的系统中，对无需对现有的代码进行修改，在简单的工厂模式中，这对于产品的消费角色是成立的，而对于工厂角色是不
    // 成立的，如下图所示，每次新增加一个新的产品，都是需要修改工厂角色，但是产品的消费者可以避免进行修改
    //

    // 工厂方法模式
    // 在工厂方法模式中，具体的工厂类有共同的接口，它们生产出现很多牌一个等级结构中的产品对象，使用这个设计的系统可以允许向系统加入新的产品类型
    // 而不必修改已有代码，只需要加入一个相应的具体的工厂类就可以了，工厂方法模式
    // 换言之，对于增加新的产品类型而言，这个系统完全支持开闭原则
    //


    // 抽象工厂模式
    // 抽象工厂模式封装了产品对象的定州的可变性，从而一方面可以使得系统动态的决定将哪一个产品实例化，另一方面可以在新的产品对象引进而
    // 已有的系统不必要的修改，产品对象家族发生变化时，这个设计可以维持系统的开闭性，抽象工厂模式的简略图如下
    // 建造模式封装了一个内部结构的产品对象的过程，因此，这样的系统是向产品内部表象的改变开始的，建造模式的
    //


    // 桥梁模式
    // 桥梁模式是对可变性封装原则的极好的例子，在桥梁模式中，具体的实现类代表着不同的实现逻辑，但是所有的具体的实现类又有共同的接口，新的
    // 实现逻辑可以通过创建新的具体的实现类加入到系统里面，桥梁模式的简略如下图

    // 门面模式
    // 假设一个系统开始的时候与某个子系统耦合在一起，后来又不得不换成另一个子系统，那么门面模式便可以发挥门面模式的两种作用，将新的子系统
    // 仍然合在一起，这样一来，使用门面模式便可以改变子系统内部的功而不会影响到客户端，门面模式的简略图如下图所示
    //

    // 调停者模式
    // 调停模式使用一个调停者对象协调和个对象的相互作用，这些同事对象之间不再发生直接的相互作用，调停者模式的简略图

    // 这样的，一旦有新的同事加入到系统中来的时候，这些已有的同事对象都不会受到任何影响，但是调停者对象本身却要修改，调停者模式以一种
    // 不完美的方式支持开闭原则
    //
    // 访问者模式使得在节点的加入新的方法变得很容易，仅仅需要在一个新的访问者类中加入此方法就可以了，但是访问者模式不能很好的处理新的
    // 节点加入的情况，访问者模式提供倾斜的可扩展性的设计，方法的集合可扩展性和类的集合可扩展性。
    //
    // 迭代子模式将访问聚集元素的逻辑封装起来，并且使它独立于聚集对象的封装，这就提供了聚集存储逻辑与迭代逻辑的独立演变的空间。
    // 使系统可以在无需修改消费迭代子的客户端的情况下，对聚集对象的内部结构进行功能的扩展，迭代子模式的简略类图如下
    //

    // 当读者学习设计模式的时候，要学会问一个问题，这个设计模式可以对什么样的变换开放，以及它做一些所付出的个代价是什么，通过这样的思考
    // 可以更加透彻的解决这种对开闭原则的支持程度，以及对设计模式本身的一种做法。

    // 一个重构的做法讨论
    // 将条件转移语句改写成多态性，一个广为流传的代码重构的做法，它的意思是说，将一个进行多次条件转移的商业逻辑封装到不同的具体的类中去，
    // 从而使用多态性代替条件转移语句
    //

    // 首先，这一代码重构的做法是实现开闭原则 的一条重要线索，因为条件转移语句特别是大段大段代码转移
    // 首先，这一代码重构的做法实现开闭原则 的的和条重要线索，因为条件的转移语句特别是大段大段的代码转移语句往往意味着某种可变性，将这种
    // 可变性用多态的代替，就意味着可变性的封装起来，从而带来系统在这种情况变化的发生开闭的特性
    // 但是这种，做法，本身并不能保证实现开闭原则，设计师应当以开闭原则为指导的原则，这一代码的重构的做法并不能成为设计的原则，事实上，
    // 这一种做法有明显的缺点与
    // 任何语言提供的转移功能，条件转移本身并不是错误的，这一做法有明显的缺点，任何语言都提供了条件转移的功能，条件转移本身并不是错误的，
    // 更加不是什么罪恶的，如果需要，设计师完全可以选择使用条件转移
    // 使用多态性代替条件转移意味着大量的类被创建出来，比如，一个类如果有三个条件方法，每个方法都有一个三段的条件转移的语句，如果将它们
    // 都用多态的性代替的话，就会造成不同的类，很难想象设计师怎样能明白这九种组合成员之间的关系，
    //

    // 何时使用这种重构的做法
    // 那么设计师应当怎样的判断何时使用多态性取条件转移语句呢？ 回答是应当从开闭原则出发来做判断，如果一个条件转移语句，确实一个条件转移
    // 如果一个条件转移语句确实封装了某种商务逻辑的可变性，那么将这种可变性封装起来就符合开闭原则的设计思想了
    //
    // 但是，如果一个条件转移语句没有重要的商务逻辑，或者不会随着时间的变化 而变化，也不意味着任何的可扩展性，那么也不涉及任何的有意义的
    // 可变性，这个时候不会随着时间的变化而变化，也不意味着任何的可扩展性，那么它就没有涉及任何的有意义的可变性，这个时候，将这个条件转移
    // 这个时候将这种条件转移语句改写成多态性就是一种没有的浪费，本书将这种多态性的滥用叫多态性的污染

    //问题 java.util.Calendar 符合开闭原则吗
    // 问题的答案是
    // java.util.Calendar 是一个抽象的类，应当给出一个不仅仅适用于高利有历法的方法和公开的常量，而且就当给出适用于所有的历法，包括中国的
    // 阴历的方法和常量，比如：大家使用的公元历法属于历法，日期和时间的运算都就当使用 GregorianCalendar 类
    //
    // 但是，java.util.Calendar 却只定义出只适用于格里高利历法的方法和公开的常量，如代码清单1
    // 这些英文星期名称与月份名称的常量对中国的阴历而言没有任何意义的，阴历以十天为一周，因此，java.util.Calendarr抽象算法不适用于
    //中国的阴历，而仍然仅仅适用于格里高利历法
    // Calendar 类没有办法容纳中国阴历
    //

    // 一个 java 接口是一些方法特性的集合，这些方法特征的集合，这些方法特征当然来自于具体的方法，但是它们一般都来自于一些方法在不同的
    // 地方被实现，可以具体的完全不同的行为，在 java 语言中，java 接口还可以定义 public 的常量
    // 在众讲到的接口的时候，这个词往往有两种不同的含义，每一种是指 Java接口，这是一种 Java 语言中存在的结构，有特定的语法和结构，另一种
    // 仅仅是一处类所具有的方法特征的集合，是一种逻辑上的抽象，前者叫做 java接口，后者就叫做接口，比如。java.lang.Runnable就是一个
    // java接口，它的源代码如代码清单
    // 在 java语言规范，一个方法的特征仅包括方法的名字，参量的数目和种类，而不包括方法的返回类型，参量的名称及所抛出的异常
    // 在 java 编译检查方法的重载时，会根据这些条件判断两个方法是否重载方法，但是在 java 编译器检查方法的转换时，则会进一步的检查两个方法
    // 处超类型和子类型，的返还类型和抛出的异常是否相同
    //

    // 在使用这个接口时，需要指明接口的本身，以及实现这个接口的类，一个类实现了一个接口，这种关系叫做接口的继承，而一个类是另一个类的子类
    // 这种关系叫做实现继承，接口的继承规则与实现继承的规则不同，一个类最多只能够有一个超类，但是可以同时实现第几个接口
    // java 接口的本身没有任何的实现，因为 java接口不涉及表象，而只描述 public 行为，所有 java 接口比 java 抽象类抽象
    // 一个 java 接口的方法只能是抽象的和公开的，java 接口不能有构造子，java 接口可以有 public 的，静态的和 final 的属性
    // 实现一个共同的 java 接口的两个类常常完全不同，但是有一组相同的方法和常数
    // 一些看上去毫不相干的类，可以因为提供相类似的服务，从而具有相同的接口，比如说，两个类实现 Runnable 的接口的类除了都有一个
    // public void run()方法之外，可能没有其他任何的共同点,可能没有其他的任何的共同点
    //
    //接口和类的最重要的区别是，接口仅仅描述的是方法的特征，而不会给出方法的实现，而类不仅仅给出方法的特征，而且还给出的方法的实现，因此
    // 接口把方法的特征主方法的实现分割开来，这种分割，体现在接口的常常代表的一个角色，它包装与该角色相关的操作和属性，而实现这个接口
    // 的类便是扮演这个角色的演员，一个角色可以由不同的演员来演，而不同的演员之间的一个共同的角色之外，并不要求有任何其他的共同之处
    // 为什么使用接口
    // 首先，如果没有接口会怎样呢，一个类总归可以从另一个类继承，难道还不够吗？
    // 没有接口会怎样，一个对象需要知道其他的对象，并且与其他的对象发生相互作用，这是因为这些对象需要借助于其他的对象的行为以便完成一项工作
    // 这些关于其他的对象的知识，以及对其他的对象的行为调用，都是使用硬编码写在类里面，可插入性几乎为零。
    // 如果要加入一个新的类，仅仅意味着加入新的硬代码，而不能给出动态的可插入性。
    // 那么基于类的继承是否可以提供一点帮助呢？比如现在有一个具体的类，提供某种使用硬代码，写在类中的行为，现在，要提供一些类似的行为，并且
    // 实现，这是否可以提供可插入性呢
    // 答案是，这个确定可以简单的情况下提供可插入性，但是由于 Java 语言的一个单继承的语言，一个类只能有一个超类，因此，在很多情况下，这个
    // 具体类可能已经有一个超类，这个时候，要给它加上一个新的超类是不可能的，如果硬要做的话，只好把这个新的超类加到已经有的超类上面，形成
    // 超超类的情况，如果这个超超类的位置也已经被占用了，就只好继续身上移动，直到移动的类等级结构的最顶端，这样一来，对一个具体的类
    // 可插入性设计，就变成了对整个等级中的所有的类进行修改
    //

    // 接口是对可插入性的保证
    // 接口使可插入性变得可能
    // 在一个类等级结构中，任何的一个类可以实现一个接口，这个接口会影响到此类中所有的子类 ，但是不会影响到此类的任何超类，此类将不得不实现这个接口
    // 所规定的方法，而其子类则可以



    // 关联可插入性
    // 正如前面所说的，一个对象需要完成一项任务，所以需要知道其他的对象，并且调用其他的对象的方法，这个对象对其他的对象的知识叫做关联
    //  如果一个关联不是针对一个具体的类，而是针对一个具体的类的，而是针对一个接口的，那么任何实现这个接口的类就都可以满足要求，换言之
    // 当对象并不在

    // 正如前面所说的，一个对象要完成一项任务，所以需要知道其他的对象，并且调用其他对象的方法，这个对象对其他的对象的知识叫做关联
    //  如果一个关联不是针对一个具体的类，而是对象并不在意所关联的哪一个任何实现这个接口的类都可以满足要求，当前对象并不在意所关联的哪一个
    // 具体的类，而仅仅关心的是这个类是否实现的某一个接口
    // 这样一来，就可以动态地将关联的一个具体的类转换到另一个具体的类，而这样做的惟一条件就是它们都实现了某个接口
    // 调用的可插入性
    // 同样，一个对象不可避免的需要调用其他对象的方法，这种调用不一定非得是某一个具体的类，而可以是一个接口，这样一来，任何实现这个接口的具体类都
    // 可以以当前对象调用，而当前对象到底调用的是哪一个具体类的实例则完全可以动态的决定
    // 因此，接口提供的关联以及方法调用上的可插入性，软件系统的规模越大，生命周期越长，接口的重要性也就越大，接口使得软件系统的灵活性和
    // 可扩展性，可插入性得到了保证
    //
    // 类型
    // java接口，用来声明一个新的类型
    // 调用的可插入性
    // 同样的，一个对象不可避免的需要调用其他的对象的方法，这种调用不一定非得某个具体的为，而也可以是一个接口，而可以是一个接口，这样的一
    // 来，任何实现了这个接口的具体的类都可以被当前的对象调用，而当前的对象到底是哪一个具体的类的实例则完全可以动态的决定
    // 类型
    // java 接口，以及 java抽象类，用来声明一个新的类型
    // java 设计师应当使用接口和抽象 java 类将软件单位与内部和外部耦合起来，应当使用 java 接口和抽象类而不是具体的类型进行变量的类型
    // 声明，参量的类型声明，方法返还类型声明，以及数据类型的转换，当然，一个更好的做法是仅仅使用java 接口，而不要使用抽象的 java 类来做
    // 上面的这些
    // 在理想的情况下，一个具体的 java 应当只实现 java 接口和抽象java 类中声明过的方法，而不应当给出多余的方法
    // 类型等级结构
    // java 接口，以及 java 抽象类，一般用来做为一个类型的等级结构的起点
    // java 的类型是以类型等级结构 的方式组织起来的，在一个类型等级结构里面，一个类型可以有一系列的超类型，这时这个类型叫做其超类型的
    // 子类型，比如白马和黑马均是马的子类型，
    // 混合类型
    // 如果一个类已经有一个主要的超类型，那么通过实现这一个接口，这个类可以拥有另一个次要的超类型，这种次要的超类型，叫做混合类型
    // 如前面所谈到的，当一个具体的类型处于一个类型的等级组构中中的时候，这个具体的类型定义为一个混合类型是可以保证基于这个类型的可插入关键
    // 因此，一个混合类型是一个非常重要的可以概念
    // 它的主要的类型是 AbstractMap ，这是一种 java 聚集，而 Cloneable 接口则给出一个将要的类型，这个类型说明这个类是可以安全的进行
    // 克隆的，同样 Serializable 也是一种次要的类型，它表明这个类的实例是可以串行化的，而 SortedMap 则表明这个聚集的类型是可以排序的
    // 单方法接口
    // 顾名思义，一个单方法接口只含有一个方法，既然这个方法是这个接口的唯一的内容，那么这个方法也就是单方法接口的核心，这种做法可以看做是
    // C 语言的函数指针对应物
    // 一个函数的指针允许一个 C 语言的程序存储和转移调用某一个函数的能力，一个单方法接口的用意很相似，在 java 语言中有很多的单个方法接口，
    // 比如，Runnable 接口要求实现一个没有参量的返还值的 run()方法，
    // 标识接口
    // 标识接口是没有任何方法和属性的接口，标识接口对实现它的类有任何主义上的要求，它仅仅表明它的类属于一个特定的类型
    // 标识接口在 java 语言中有一些很著名的应用，比如 java.io.Serializable 和 java.rmi.Remote 等接口便是标识接口，java.io.Serializable
    // 接口如图所示
    // 另一个例子就是 RMI 库中的 Remote接口，java.rmi.Remote 接口便是一个标识接口
    // 标识接口通常使用的是在工具类中，很少在其他的方法中使用，虽然在有些地方使用标识接口是很巧妙的做法，但是这个做法是不可以滥用的，一般
    // 而言
    // 常量接口
    // 前面讲过，java 接口可以用来声明一个新的类型，实际上，java 接口就当仅仅用来声明一个新的类型，而不应当用来
    // 常量接口这样一来，凡是实现这个接口的 java 搂都会自动的继承这些常量，并且都可以使用自己的常量一样的使用这些常量，而不必加上
    // 其中，ObjectStreamConstants 和 d
    // java 构件模型的顶端是 java.lang.Object，所有的 java 构件包括数组对象，都以这个为是超类
    // java 是强类型的语言，这意味着 java 编译器会对代码进行检查，以确定第一次赋值，第一次方法都是符合类型的，如果有任何不相符合情况的
    // java 编译器就会给出错误
    // 类型检查是基于这样的一个简单的事实，每一个变量的声明给这个变量一个类型，每一个方法和构造子 的声明都给出这个方法的特征，这样一来
    // java 编译器可以基于明显的类型对类型进行检查
    // java 语言是类型安全的，任何被 java 编译器接收的合法的 java 楼型 保证是类型安全的，在程序运行期间是不会有任何类型的错误
    // 一个 java 程序根本不可能将一个本来发生一种类型的变量当做另一种类型来处理，因此也就不会产生由此而引起的错误
    // 简单来讲，java 语言依靠三种机制做一这一点，编译期间的类型检查，自动存储管理数组的边界检查
    // 在 java 语言里，类有两种，一种是具体的类，另一种是抽象类，具体的类可以实例化的，抽象的类是不可以实例化
    // 什么是抽象类
    // 抽象类提供了一个类型的部分实现，抽象灰可以有实例变量，以及一个或多个构造子，抽象类可以同时有抽象方法和具体方法
    // 一个抽象类不会有实例，这些构造子不能被客户端用来创建实例，一个抽象类的构造子可以审美观点 其他的子类调用，从而使一个抽象类所有的子类
    // 都可以有一些共有的实现，而不同的子类可以在此基础上有不同的实现
    // 抽象类和子类的这种关系其实是模版方法模式的应用
    // java 抽象类与 java 接口一样，都是用来声明一个新有类型的，并且作为一个类型的等级结构的起点，但是，java 接口具体的比 java 抽象的
    // 类有更加好的特性，因此，就当优先使用 java 接口声明一个超类类型
    // 抽象类的用途
    // 抽象类通常代表的是一个抽象的概念，它提供了一个继承的出发点，而具体的类则不同，具体的类可以实例化，应当给出一个商业的逻辑实现
    // 对象模版，由于抽象类不可以实例化，因此 ，一个设计师设计一个新的抽象类，一定是用来继承的
    // 具体的类不是用来继承的
    // 只要有可能，不要从具体的类继承
    // 抽象类应当拥有尽可能多的共同代码
    // 在一个从抽象类到多个具体的类的继承关系中，共同的代码应当尽量移动到抽象类
    // 在一个继承结构中，共同的代码应当尽量的等级结构的上方移动
    // 针对抽象编程
    // 针对抽象编程，不要针对具体的编程，这就是依赖倒转原则，
    // 应当针对抽象类编程，不要针对具体的类编程，这一原则点出的抽象类的对代码利用的一个最重要的作用
    // 正确的使用继承
    // 在 java 语言中，继承关系可以分成两种，一种是类的接口的实现，称做接口的继承，另一种是对类的继承，称做实现继承，第二种继承关系是
    // 很容易被是滥用的继承关系关联在一起
    // 模版方法模式
    // 抽象类在配所讨论的和个模式里面扮演了重要的角色，几乎所有的模式都涉及到了抽象类，但是模式方法模式不仅仅使用抽象类和继承关系作为对
    // 模式所涉及的角色的抽象化，模版方法模式根本就是关于继承模式，关于模版方法模式，
    // 当读者阅读完本章节后，会对抽象类的使用有一个新的高度的理解
    // 继承代表一般化特殊化，关系，其中基类代表一般，而衍生类代码特殊，衍生类将基类特殊化扩展化，只有当以下的 Coad条件全部被满足时，才应当
    // 使用继承关系
    // 子类 是超类的一个特殊的种类，而不是超类的一个角色，也就是要区分 has-A 与 IS-A 两种关系，Has-A 关系应当是聚合关系的描述，而只有
    // IS-A 关系才符合继承关系
    // 永远不会出现将子类换成另一个类的子类的情况，如果设计师不是很肯定一个类会不会变成另一个类的子类的话，就不应该将这个类设计成当前的这个
    // 超类的子类
    // 子类具有扩展超类的责任，而不是具有转换掉或注销掉超类的责任，如果子类需要大量的转换超类的行为，那么这个子类需要大量的转换掉超类的行为
    // 那么这个子类不应当成为这个超类的子类
    // 只有在分类学的角度上有意义时，才可以使用继承，不要从工具类中继承
    // 区分 Has-A 与 Is-A
    // 当一个类是另一个类的角色时，不应当使用继承描述这种关系，如果仔细考察就会发现，这种情况一定不满足里氏替换法则
    // 子类扩展超类的责任
    // 子类应当扩展超类的责任，而不理转换掉，或者撤销掉
    // 超类的责任， 如果一个子类需要将继承自超类的责任取消转置换后才能使用的话，很可能这个子类根本不是哪个超类的子类
    // 一般而言，如果子类需要置换掉太多的超类的行为，那么一定因为子类的行为也超类有太大的区别，这个时候，很有可能子类并不能取代超类出现的
    // 行为，也就是不满足里氏替换原则
    // 不要从工具类中继承
    // 只有当分类意义时，才使用继承，一个商业类型不会与一个工具类型有这种分类上的意义关系，因此不要从工具类中继承，从工具类必定
    // 有自己的特性，一个商业类型的封装了商业逻辑，不可能是工具类，不可能是工具类型的和种，几乎没有例外，从工具类型继承是错误的
    // 同时，由于系统是由于数据驱动的，因此系统需要一个 DBManager 的工具类，提供所有数据库的功能，比如 executeSql()
    // openQuery()等方法
    // 如果到此为止，当然这种滥用的情况不能使用引进一个抽象类的办法重构纠正，而应当将继承关系改为委派关系的办法纠正，将 DBManager
    // 到 CountentDataBean 的继承关系改成 ContentDataBean 到 DBManager 的委派关系
    // 从开闭原则中可以看出面向对象的设计的重要原则是创建抽象化，并且从抽象化导出具体化，具体化可以给出不同的版本，每一个版本给出不同的
    // 实现
    // 从抽象化到具体化的导出要使用继承关系和这里要引入的里氏替换原则，
    // 反过来的代换不成立
    // 在编译时期，java 语言编译器检查一个程序是否
    // 里氏替换要求凡是基类型使用的地方，子类型一定适用，因此子类型具备基类型的全部接口，或者说，子类型的接口必须包括全部的基类型的接口
    // 而且还有可能更宽，如果一个java 程序破坏了这一条件，java 编译器就会给出编译错误
    // Java 编译器的检查是有局限的，举例来说，描写一个物体大小的量有精度和准度之分，所谓的精度就是，这个量的有效数字的多少位，而所谓的
    // 准确度，是这个量与真实物体情况相吻合的，java 语言能够编译器能够检查，仅仅是相当于精度的属性而已，它无法检查这个量与真实的物体的差距
    // 正方形类是否是长方形的子类，的这个；问题，本章会在后面详细的讨论这种具体的实现商业逻辑上的问题
    //























}