package com.pattern.number7;

public class Doc_2019_07_10 {
    // 这个设计原则有另一个更加简单的表述，要尽量的使用合成聚合，尽量不要使用继承
    // 合成一词使用很广泛，经常混淆，为了避免这些混淆，不妨先来考察一下，合成与聚合的区别
    // 合成和聚合均是关联的特殊种类，聚合用来表示拥有的关系或者整体和部分的关系，而合成则用来表示一种强得多的拥有关系，在一个合成关系里
    // 部分和整体的生命周期是一样的，一个合成的新的对象完全拥有对其组成部分的支配权，一个合成的新的对象完全拥有对其组成部分的支配权，
    // 包括他的创建和湮灭，使用程序言语的术语来讲，组合而成的新的对象组成部分内存分配，内存的释放有绝对的责任
    // 更进一步来讲，一个合成多重性不能超过1 ，一个合成关系中的成分对象是不能与另一个对象关系共享的，一个成分对象在同一个时间内只能
    // 属于一个合成关系，如果一个合成关系湮灭了，那么所有的成分对象要么自己湮灭所有的成分对象（这种情况比较普遍），要么将这一种责任交给
    // 别人
    // 合成是值的聚合，而通常所说的聚合则是引用的聚合
    // 复用的基本种类
    // 在面向对象的设计里，有两种基本的办法可以在不同的环境中复用已有的设计和实现，即通过合成聚合或通过继承，那么这两种不同的复用方式在可
    // 维护性上面有何区别呢？
    // 合成聚合的复用
    // 由于合成或聚合可以将已有的对象纳入到新的对象中，使之成为新的对象的一部分，因此新的对象可以调用自己对象的功能，这样做有以下的几种好处
    //  新对象的存取成分对象的唯一方法是通过成分对象的接口
    // 这种利用是黑箱复用，因为成分对象的内部细节是新对象不可见的
    // 这种复用支持包装
    // 这种复用所需的依赖较少
    // 每一个新的类可以将焦点集中在一个任务中
    // 这种利用可以在运行时间的内部动态的进行，新的对象可以动态的引用与成分对象的类型相同的对象
    // 一般而言，如果一个角色得到更多的责任，那么可以使用合成聚合关系将新的责任委派到合适的对象
    // 当然 ，这种复用也是有缺点的，其中最主要的缺点就是通过使用这种复用建造的系统会有较多的对象和管理
    // 对过继承达到复用的目的
    // 合成聚合作为复用的手段可以应用到几乎任何环境中去，而与合成聚合不同的是，继承只能应用到很有限的一些环境中去，尽管集成是一种非常
    // 重要的复用手段，但是设计师应当首先考虑使用合成聚合，而不是继承关系
    // 继承的种类
    // 继承是面向对象语言特有的复用工具，而且最容易被滥用的复用工具，这时讨论的继承，是指从一个 java 类到另一个 java 类实现性继承
    //  也就是实现继承，并不包括接口的继承，一个实现继承的例子
    // 继承是复用对过扩展一个已有的对象实现来得到新的功能，基类明显地捕获共同的属性和方法，而子类通过增加新的属性和方法扩展超类的实现
    // 继承是类型的复用
    //  男人和女人是人类
    //  上推排序 ，是 排序 程序的一种
    // 汽车驾照是官方文件中的一种
    // 正式雇员和临时雇员是雇员的一种
    // 经理是正式雇员的一种
    // 在面向对象的设计理论早期，设计师十分热衷，好像继承就是最好的复用手段，随着时间的推移和实践经验 的积累，人们逐渐的认识到了继承关系的
    // 缺点
    // 在面向对象的设计理论早期，设计师十分热衷于继承，好像继承就是最好的利用手段，
    // 继承是复用的优点
    // 利用继承关系达到复用的做法有下面的优点
    // 新的实现较为容易，因为超类的大部分的功能可以通过继承关系自动进入子类
    // 修改或扩展继承而来的实现较为容易
    // 继承和复用的缺点
    // 继承利用破坏了包装，因为继承将超类的实现细节暴露给子类 ，由于超类的内部细节常常是对子类是透明的，因此这种利用是透明的复用，又称为白箱复用
    // 如果超类的实现发生变化，那么子类的实现也不得不发生变化，因此，一个基类发生改变时，这种改变会像水中投入石子一样，将变化一圈一圈的传导到了
    // 从超类的继承而来的是静态的，不可能运行赶时间内发生改变，因此没有足够的灵活性
    //
    //
}
